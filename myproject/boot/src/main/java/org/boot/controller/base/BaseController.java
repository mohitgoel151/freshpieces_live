package org.boot.controller.base;

import static org.util.common.constants.Constants.REQUEST_ERROR_MESSAGE;
import static org.util.common.constants.Constants.SUCCESSFUL_REQUEST_MESSAGE;

import org.common.domain.Metadata;
import org.common.domain.response.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.util.common.base.CheckedFunction;
import org.util.common.exception.MyException;

public class BaseController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public <K, T> void serveRequest(K requestparam, ApiResponse response, CheckedFunction<K, T> function) {
        T result = null;
        try {
            result = function.apply(requestparam);
            response.setResponse(result);
            embedMetadataInResponse(response, null);
        } catch (Exception ex) {
            embedMetadataInResponse(response, ex);
        }

    }
    
    @SuppressWarnings("rawtypes")
    private void embedMetadataInResponse(ApiResponse response, Exception ex) {
        Metadata metadata = new Metadata();
        if(ex == null) {
            setMetadataForSuccess(metadata);
            //response.setStatus(HttpStatus.OK.value());
        } else {
            setMetadataForExeption(metadata, ex);
        }
        
        //metadata.setResponseTime(System.currentTimeMillis() - request.getStartTime());
        response.setMetadata(metadata);
    }
    
    private void setMetadataForSuccess(Metadata metadata) {
        metadata.setCode(String.valueOf(HttpStatus.OK));
        metadata.setMessage(SUCCESSFUL_REQUEST_MESSAGE);
        metadata.setSuccessful(true);
    }
    
    private void setMetadataForExeption(Metadata metadata, Exception ex) {
        if(ex instanceof MyException) {
            metadata.setCode(String.valueOf(((MyException)ex).value()));
            metadata.setMessage(((MyException)ex).getReasonPhrase());
        } else {
            metadata.setCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
            metadata.setMessage(REQUEST_ERROR_MESSAGE);
        }
        metadata.setSuccessful(false);
        LOGGER.error(REQUEST_ERROR_MESSAGE, ex);
    }


}

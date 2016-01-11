package org.util.common.exception;

import org.springframework.http.HttpStatus;

public class ResourceAlreadyExistException extends MyException {

    /**
     * 
     */
    private static final long serialVersionUID = 786549354118088749L;

    public ResourceAlreadyExistException(String reasonPhrase) {
        super(HttpStatus.CONFLICT.value(), reasonPhrase);
        
    }

}

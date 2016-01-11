package org.util.common.exception;

import org.springframework.http.HttpStatus;

public class BadArgumentsException extends MyException {

    /**
     * 
     */
    private static final long serialVersionUID = -1675793290577447862L;
    
    public BadArgumentsException(String reasonPhrase) {
        super(HttpStatus.BAD_REQUEST.value(), reasonPhrase);
        
    }

}

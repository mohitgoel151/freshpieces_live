package org.util.common.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends MyException {
    
    /**
     * 
     */
    private static final long serialVersionUID = 6483402737479491718L;

    public ResourceNotFoundException(String reasonPhrase) {
        super(HttpStatus.NOT_FOUND.value(), reasonPhrase);
        
    }

}

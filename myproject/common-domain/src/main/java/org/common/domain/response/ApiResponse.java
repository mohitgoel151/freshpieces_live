package org.common.domain.response;

import org.common.domain.Metadata;

public class ApiResponse <T> {

    private T response;
    private Metadata metadata = new Metadata();
    
    public T getResponse() {
        return response;
    }
    public void setResponse(T response) {
        this.response = response;
    }
    
    public Metadata getMetadata() {
        return metadata;
    }
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    
}

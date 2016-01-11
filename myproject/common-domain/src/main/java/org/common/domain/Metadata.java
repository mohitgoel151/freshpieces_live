package org.common.domain;

import java.util.UUID;

public class Metadata {
    
    private String code;
    private String message;
    private Long responseTime;

    private boolean successful;
    private String requestId; 
    
    public Metadata() {
        this.requestId = UUID.randomUUID().toString();
    }
    
    public Metadata(String code, String message, Long responseTime, boolean successful, String clientId){
        this();
        this.code = code;
        this.message = message;
        this.responseTime = responseTime;
        this.successful = successful;
    }
    
    public Metadata(String code, String message,  boolean successful){
        this();
        this.code = code;
        this.message = message;
        this.successful = successful;
    }
    

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Long getResponseTime() {
        return responseTime;
    }
    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }
    public boolean isSuccessful() {
        return successful;
    }
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
    
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}

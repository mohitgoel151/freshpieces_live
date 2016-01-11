package org.util.common.exception;

public class MyException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -4871542390000779702L;
    

    private int value;

    private String reasonPhrase;

    public MyException(int value) {
        this.value = value;
    }

    public MyException(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    } 

    public MyException(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    /**
     * Return the integer value of this status code.
     */
    public int value() {
        return this.value;
    }

    /**
     * Return the reason phrase of this status code.
     */
    public String getReasonPhrase() {
        return reasonPhrase;
    }

}

package com.hui.exception;
public class SystemException extends RuntimeException{
    private final Integer exceptionCode;

    public SystemException(Integer exceptionCode, String message) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public SystemException(Integer exceptionCode, String message, Throwable cause) {
        super(message, cause);
        this.exceptionCode = exceptionCode;
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }
}

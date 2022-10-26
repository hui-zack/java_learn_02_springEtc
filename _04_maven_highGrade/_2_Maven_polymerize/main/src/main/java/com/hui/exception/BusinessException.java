package com.hui.exception;

public class BusinessException extends RuntimeException{
    private final Integer exceptionCode;

    public BusinessException(Integer exceptionCode, String message) {
        super(message);
        this.exceptionCode = exceptionCode;
    }

    public BusinessException(Integer exceptionCode, String message, Throwable cause) {
        super(message, cause);
        this.exceptionCode = exceptionCode;
    }

    public Integer getExceptionCode() {
        return exceptionCode;
    }
}

package com.can.pawrest.exception.error;

import lombok.Getter;

@Getter
public class UserException extends RuntimeException {
    private ErrorCode errorCode;
    private String message;

    public UserException(ErrorCode errorcode) {
        super(errorcode.getMessage());
        this.errorCode = errorcode;
        this.message = errorcode.getMessage();
    }
}

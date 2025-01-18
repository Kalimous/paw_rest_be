package com.can.pawrest.exception.error;

import lombok.Getter;

import java.util.List;

@Getter
public class UserException extends RuntimeException {
    private ErrorCode errorCode;
    private String message;
    private List<String> details;

    public UserException(ErrorCode errorcode) {
        super(errorcode.getMessage());
        this.errorCode = errorcode;
        this.message = errorcode.getMessage();
    }

    public UserException(ErrorCode errorcode, List<String> details) {
        super(errorcode.getMessage());
        this.errorCode = errorcode;
        this.details = details;
    }
}

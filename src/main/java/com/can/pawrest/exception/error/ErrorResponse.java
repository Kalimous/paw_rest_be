package com.can.pawrest.exception.error;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private String message;
    private String code;
    private List<String> details;

    ErrorResponse(final ErrorCode code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    public ErrorResponse(final ErrorCode code, final String message) {
        this.code = code.getCode();
        this.message = message;
    }

    public ErrorResponse(final ErrorCode code, final List<String> details) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.details = details;
    }


}

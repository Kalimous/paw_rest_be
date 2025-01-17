package com.can.pawrest.exception.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = UserException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(UserException e) {
        ErrorCode errorCode = e.getErrorCode();

        ErrorResponse errorResponse = new ErrorResponse(errorCode);

        return new ResponseEntity<>(errorResponse, errorCode.getStatus());
    }
}

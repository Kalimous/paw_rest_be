package com.can.pawrest.exception.error;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = UserException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(UserException e) {
        ErrorCode errorCode = e.getErrorCode();
        List<String> details = e.getDetails();

        ErrorResponse errorResponse = new ErrorResponse(errorCode, details);

        return new ResponseEntity<>(errorResponse, errorCode.getStatus());
    }
}

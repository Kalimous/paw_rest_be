package com.can.pawrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// exception을 던질때 bad_request 상태코드와 함께 메세지가 반환된다.
@ResponseStatus(HttpStatus.BAD_REQUEST)

public class DuplicateUserInfoException extends RuntimeException {
    public DuplicateUserInfoException(String message) {
        super(message);
    }
}

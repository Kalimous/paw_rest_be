package com.can.pawrest.exception.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode{
    USER_NAME_ALREADY_EXISTS(HttpStatus.BAD_REQUEST, "U1", "유저이름이 이미 존재합니다."),
    USER_ID_ALREADY_EXISTS(HttpStatus.ALREADY_REPORTED, "U2", "유저 아이디가 이미 존재합니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "U3", "유저를 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;
    private final String code;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.message = message;
        this.code = code;
    }
}

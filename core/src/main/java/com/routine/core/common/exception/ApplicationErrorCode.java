package com.routine.core.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum ApplicationErrorCode {

    UNKNOWN_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,9000, "Unknown Server Error"),
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST,9001, "Invalid Input Value");

    @Getter
    private final HttpStatus httpStatus;
    @Getter
    private final int code;
    @Getter
    private final String message;

    public int getStatusCode() {
        return httpStatus.value();
    }
}

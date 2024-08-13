package com.routine.core.common.exception;

import lombok.Getter;

@Getter
public class ApplicationErrorException extends RuntimeException {
    private final ApplicationErrorCode errorCode;

    public ApplicationErrorException(ApplicationErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
package com.routine.core.common.model.dto;

import com.routine.core.common.exception.ApplicationErrorCode;

public record ErrorResponseDto(

        int code,
        String message
){
    public static ErrorResponseDto of(int code, String message) {
        return new ErrorResponseDto(code, message);
    }

    public static ErrorResponseDto of(ApplicationErrorCode applicationerrorCode) {
        return new ErrorResponseDto(applicationerrorCode.getCode(), applicationerrorCode.getMessage());
    }
}

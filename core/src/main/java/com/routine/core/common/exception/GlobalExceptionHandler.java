package com.routine.core.common.exception;

import com.routine.core.common.model.dto.ErrorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorResponseDto> handleApplicationErrorException(ApplicationErrorException e) {
        log.error("ApplicationErrorException {}", e.getMessage());

        var response = new ErrorResponseDto(e.getErrorCode().getCode(), e.getMessage());
        return new ResponseEntity<>(response, e.getErrorCode().getHttpStatus());
    }

}

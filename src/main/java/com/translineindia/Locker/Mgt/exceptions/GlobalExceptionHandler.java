package com.translineindia.Locker.Mgt.exceptions;

import com.translineindia.Locker.Mgt.response.ApiResponse;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(@NotNull ResourceNotFoundException ex){
        String message = ex.getMessage();
        ApiResponse response = ApiResponse.builder().message(message).success(true)
                .status(HttpStatus.NOT_FOUND).build();
        return  new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
    }
}
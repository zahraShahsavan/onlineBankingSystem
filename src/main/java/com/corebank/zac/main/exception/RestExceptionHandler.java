package com.corebank.zac.main.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler({ CustomerNotFoundException.class })
    protected ResponseEntity<Object> handleCustomerNotFound(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "customer not found",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }


    @ExceptionHandler({ AccountNotFoundException.class })
    protected ResponseEntity<Object> handleAccountNotFound(Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "account not found",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}
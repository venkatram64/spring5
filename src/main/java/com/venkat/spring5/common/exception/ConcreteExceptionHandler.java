package com.venkat.spring5.common.exception;

import com.venkat.spring5.common.StockError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ConcreteExceptionHandler {

    /*@ExceptionHandler(IllegalStateException.class)
    @ResponseBody
    public String handleIllegalStateException(Exception ex){
        return "Exception occured: " + ex.getMessage();
    }*/
    @ResponseBody
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<StockError> handleException(IllegalArgumentException exception) {
        return ResponseEntity.badRequest().body(new StockError("00102", exception.getMessage()));
    }
}

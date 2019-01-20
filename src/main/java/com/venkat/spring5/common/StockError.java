package com.venkat.spring5.common;

import lombok.Value;

//@Value
public class StockError {
    String code;
    String message;

    public StockError(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

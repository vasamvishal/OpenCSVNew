package com.dummytesting;

public class CustomException extends Exception{
    enum ExceptionType{
        NO_SUCHFILE;
    }
    ExceptionType type;

    public CustomException(String message,ExceptionType type) {
        super(message);
        this.type= type;
    }
}

package com.example.demo;

/**
 * 异常类
 */
public class UnableToAquireLockException extends RuntimeException  {

    public UnableToAquireLockException(){}

    public UnableToAquireLockException(String message){
        super(message);
    }

    public UnableToAquireLockException(String message, Throwable throwable){
        super(message, throwable);
    }

}

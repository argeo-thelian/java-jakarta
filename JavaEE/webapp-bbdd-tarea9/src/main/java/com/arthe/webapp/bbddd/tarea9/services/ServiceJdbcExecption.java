package com.arthe.webapp.bbddd.tarea9.services;

public class ServiceJdbcExecption extends RuntimeException {
    public ServiceJdbcExecption(String message, Throwable cause){
        super(message,cause);
    }
}

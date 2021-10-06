package com.task.selftask;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class errorHandling extends IndexOutOfBoundsException {
    public void err () throws IndexOutOfBoundsException{

    }
}

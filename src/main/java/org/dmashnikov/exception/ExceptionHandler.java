package org.dmashnikov.exception;

import org.dmashnikov.model.ICommand;

public class ExceptionHandler {
    public void handle(Exception ex, ICommand command){
        command.getClass().getName();

    }
}

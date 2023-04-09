package org.dmashnikov.model;

public interface ICommand {
    void execute();
    void execute(ICommand command);
}

package org.dmashnikov.command;

import org.dmashnikov.model.ICommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogCommand implements ICommand {
    private static Logger LOGGER = LoggerFactory.getLogger(LogCommand.class);

    private final ICommand command;

    public LogCommand(ICommand command) {
        this.command = command;
    }

    @Override
    public void execute() {
        LOGGER.info("Ошибка при выполнении команды: " + command.toString());
    }

}

package org.dmashnikov.command;

import org.dmashnikov.model.ICommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogCommand implements ICommand {
    private static Logger logger = LoggerFactory.getLogger(LogCommand.class);

    @Override
    public void execute() { }

    @Override
    public void execute(ICommand command) {
        logger.info("Выброшено исключение команды: %s", command);
    }
}

package org.dmashnikov.command;

import org.dmashnikov.model.ICommand;

import java.util.List;

public class SetLogCommand implements ICommand {
    private final List<ICommand> commands;

    public SetLogCommand(List<ICommand> commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        commands.add(new LogCommand(commands.get(0)));
    }
}

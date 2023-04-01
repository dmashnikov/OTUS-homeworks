package org.dmashnikov.command;

import org.dmashnikov.model.ICommand;

import java.util.List;

public class MacroCommand implements ICommand {
    private final List<ICommand> commands;

    public MacroCommand(List<ICommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        commands.forEach(c -> {
            c.execute();
        });
    }
}

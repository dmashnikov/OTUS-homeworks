package org.dmashnikov.command;

import org.dmashnikov.adapter.CheckableFuelAdapter;
import org.dmashnikov.exception.CommandException;
import org.dmashnikov.model.ICommand;

public class CheckFuelCommand implements ICommand {
    private final CheckableFuelAdapter checkableFuelAdapter;
    public CheckFuelCommand(CheckableFuelAdapter checkableFuelAdapter) {
        this.checkableFuelAdapter = checkableFuelAdapter;
    }
    @Override
    public void execute() {
        Integer fuel = checkableFuelAdapter.getFuel();
        if (fuel <= 0) throw new CommandException("No more fuel");
    }
}

package org.dmashnikov.command;

import org.dmashnikov.adapter.CheckableFuelAdapter;
import org.dmashnikov.exception.CommandException;

public class CheckFuelCommand {
    private final CheckableFuelAdapter checkableFuelAdapter;
    public CheckFuelCommand(CheckableFuelAdapter checkableFuelAdapter) {
        this.checkableFuelAdapter = checkableFuelAdapter;
    }

    public void execute() {
        Integer fuel = checkableFuelAdapter.getFuel();
        if (fuel < 0) throw new CommandException();
    }
}

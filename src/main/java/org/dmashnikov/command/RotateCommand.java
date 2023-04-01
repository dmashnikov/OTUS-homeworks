package org.dmashnikov.command;

import org.dmashnikov.adapter.RotableAdapter;
import org.dmashnikov.model.ICommand;

public class RotateCommand implements ICommand {
    private final RotableAdapter rotableAdapter;
    public RotateCommand(RotableAdapter rotableAdapter) {
        this.rotableAdapter = rotableAdapter;
    }

    @Override
    public void execute() {
        int dir = rotableAdapter.getDirection();
        int angV = rotableAdapter.getAngularVelocity();
        int dirNum = rotableAdapter.getDirectionNumber();
        rotableAdapter.setDirection((dir + angV)%dirNum);
    }
}

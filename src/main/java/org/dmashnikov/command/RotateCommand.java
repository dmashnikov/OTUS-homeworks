package org.dmashnikov.command;

import org.dmashnikov.adapter.RotableAdapter;

public class RotateCommand {
    private final RotableAdapter rotableAdapter;
    public RotateCommand(RotableAdapter rotableAdapter) {
        this.rotableAdapter = rotableAdapter;
    }

    public void execute() {
        int dir = rotableAdapter.getDirection();
        int angV = rotableAdapter.getAngularVelocity();
        int dirNum = rotableAdapter.getDirectionNumber();
        rotableAdapter.setDirection((dir + angV)%dirNum);
    }
}

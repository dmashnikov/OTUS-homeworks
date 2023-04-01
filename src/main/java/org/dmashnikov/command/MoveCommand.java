package org.dmashnikov.command;

import org.dmashnikov.adapter.MovableAdapter;
import org.dmashnikov.model.ICommand;

import java.util.Vector;

public class MoveCommand implements ICommand {
    private final MovableAdapter moveAdapter;
    public MoveCommand(MovableAdapter moveAdapter) {
        this.moveAdapter = moveAdapter;
    }

    @Override
    public void execute() {
        Vector position = moveAdapter.getPosition();
        Vector velocity = moveAdapter.getVelocity();

        Vector res = new Vector();
        res.add(0, (int) position.get(0) + (int) velocity.get(0));
        res.add(1, (int) position.get(1) + (int) velocity.get(1));
        moveAdapter.setPosition(res);
    }
}

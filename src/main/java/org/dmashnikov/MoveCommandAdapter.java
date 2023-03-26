package org.dmashnikov;

import java.util.HashMap;
import java.util.Vector;

public class MoveCommandAdapter implements IMovable{
    private Vector position;
    private Vector velocity;

    public MoveCommandAdapter(HashMap<String, Vector> commands) {
        this.position = commands.get("position");
        this.velocity = commands.get("velocity");
    }

    @Override
    public Vector getPosition() {
        return position;
    }

    @Override
    public Vector getVelocity() {
        return velocity;
    }

    @Override
    public void setVelocity() {

    }
}

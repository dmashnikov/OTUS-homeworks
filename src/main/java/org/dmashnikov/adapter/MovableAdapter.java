package org.dmashnikov.adapter;

import org.dmashnikov.model.IMovable;

import java.util.HashMap;
import java.util.Vector;

public class MovableAdapter implements IMovable {
    private final HashMap<String,Object> moveMap;

    public MovableAdapter(HashMap<String, Object> commands) {
        this.moveMap = commands;
    }

    @Override
    public Vector getPosition() {
        return (Vector) moveMap.get("position");
    }

    @Override
    public Vector getVelocity() {
        return (Vector) moveMap.get("velocity");
    }

    @Override
    public void setPosition(Vector newVector) {
        moveMap.put("position", newVector);
    }
}

package org.dmashnikov;

import java.util.HashMap;
import java.util.Vector;

public class MoveAdapter implements IMovable{
    private HashMap<String,Object> moveMap;

    public MoveAdapter(HashMap<String, Object> commands) {
        this.moveMap = commands;
    }

    @Override
    public Vector getPosition() {
        return (Vector) moveMap.get("position");
    }

    @Override
    public Vector getVelocity() {
        Vector vector = new Vector();
        int d = (int) moveMap.get("direction");
        int num = (int) moveMap.get("direction_number");
        int v = (int) moveMap.get("velocity");
        vector.add(v * Math.cos((double) d /360 * num));
        vector.add(v * Math.sin((double) d /360 * num));
        return vector;
    }

    @Override
    public void setPosition(Vector newVector) {
        moveMap.put("position", newVector);
    }

    public void execute() {
        getPosition();
    }
}

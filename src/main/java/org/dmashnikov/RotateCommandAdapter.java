package org.dmashnikov;

import java.util.HashMap;
import java.util.Vector;

public class RotateCommandAdapter implements IRotable {
    private HashMap<String,Object> rotateMap;

    public RotateCommandAdapter(HashMap<String, Object> commands) {
        this.rotateMap = commands;
    }
//
//    @Override
//    public Vector getPosition() {
//        return (Vector) moveMap.get("position");
//    }
//
//    @Override
//    public Vector getVelocity() {
//        Vector vector = new Vector();
//        int d = (int) moveMap.get("direction");
//        int num = (int) moveMap.get("direction_number");
//        int v = (int) moveMap.get("velocity");
//        vector.add(v * Math.cos(d /(360 * num)));
//        vector.add(v * Math.sin(d /(360 * num)));
//        return vector;
//    }
//
//    @Override
//    public void setVelocity(Vector newVector) {
//        moveMap.put("position", newVector);
//    }

    @Override
    public int getDirection() {
        return (int) rotateMap.get("direction");
    }

    @Override
    public int getAngularVelocity() {
        return 0;
    }

    @Override
    public void setDirection(int newDir) {
        rotateMap.put("direction", newDir);
    }

    @Override
    public int getDirectionsNumber() {
        return 0;
    }
}

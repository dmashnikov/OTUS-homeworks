package org.dmashnikov;

import java.util.HashMap;

public class RotableAdapter implements IRotable {

    private HashMap<String,Object> rotateMap;
    @Override
    public int getDirection() {
        return (int) rotateMap.get("direction");
    }

    @Override
    public int getAngularVelocity() {
        return (int) rotateMap.get("direction");
    }

    @Override
    public void setDirection(int newDir) {
        rotateMap.put("direction", newDir);
    }
}

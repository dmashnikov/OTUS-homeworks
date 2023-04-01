package org.dmashnikov;

import java.util.HashMap;
import java.util.Map;

public class RotableAdapter implements IRotable {

    private HashMap<String,Object> rotateMap;

    public RotableAdapter(HashMap<String, Object> commands) {
        this.rotateMap = commands;
    }
    @Override
    public int getDirection() {
        return (int) rotateMap.get("direction");
    }

    @Override
    public int getDirectionNumber() { return (int) rotateMap.get("direction number");}

    @Override
    public int getAngularVelocity() {
        return (int) rotateMap.get("angular velocity");
    }

    @Override
    public void setDirection(int newDir) {
        rotateMap.put("direction", newDir);
    }
}

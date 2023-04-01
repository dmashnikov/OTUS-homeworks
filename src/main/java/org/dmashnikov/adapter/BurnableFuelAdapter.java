package org.dmashnikov.adapter;

import org.dmashnikov.model.IBurnableFuel;

import java.util.HashMap;

public class BurnableFuelAdapter implements IBurnableFuel {
    private final HashMap <String, Object> burnableMap;

    public BurnableFuelAdapter(HashMap <String, Object> commands) {
        this.burnableMap = commands;
    }
    @Override
    public Integer getFuel() {
        return (int) burnableMap.get("fuel");
    }

    @Override
    public Integer getBurnVelocity() {
        return (int) burnableMap.get("burn velocity");
    }

    @Override
    public void setFuel(int newF) {
        burnableMap.put("fuel", newF);
    }
}

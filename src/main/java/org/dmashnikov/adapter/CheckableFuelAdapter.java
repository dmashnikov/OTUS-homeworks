package org.dmashnikov.adapter;

import org.dmashnikov.model.ICheckableFuel;

import java.util.HashMap;

public class CheckableFuelAdapter implements ICheckableFuel {
    private final HashMap <String, Object> checkableMap;

    public CheckableFuelAdapter(HashMap <String, Object> commands) {
        this.checkableMap = commands;
    }

    @Override
    public Integer getFuel() {
        return (int) checkableMap.get("fuel");
    }
}

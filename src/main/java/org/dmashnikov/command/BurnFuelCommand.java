package org.dmashnikov.command;

import org.dmashnikov.adapter.BurnableFuelAdapter;

public class BurnFuelCommand {
    private final BurnableFuelAdapter burnableFuelAdapter;
    public BurnFuelCommand(BurnableFuelAdapter burnableFuelAdapter) {
        this.burnableFuelAdapter = burnableFuelAdapter;
    }

    public void execute() {
        Integer fuel = burnableFuelAdapter.getFuel();
        Integer burnV = burnableFuelAdapter.getBurnVelocity();
        burnableFuelAdapter.setFuel(fuel - burnV);
    }
}

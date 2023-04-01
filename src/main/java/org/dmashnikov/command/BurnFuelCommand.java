package org.dmashnikov.command;

import org.dmashnikov.adapter.BurnableFuelAdapter;
import org.dmashnikov.model.ICommand;

public class BurnFuelCommand implements ICommand {
    private final BurnableFuelAdapter burnableFuelAdapter;
    public BurnFuelCommand(BurnableFuelAdapter burnableFuelAdapter) {
        this.burnableFuelAdapter = burnableFuelAdapter;
    }

    @Override
    public void execute() {
        Integer fuel = burnableFuelAdapter.getFuel();
        Integer burnV = burnableFuelAdapter.getBurnVelocity();
        burnableFuelAdapter.setFuel(fuel - burnV);
    }
}

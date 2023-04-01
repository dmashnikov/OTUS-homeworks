package org.dmashnikov;

import org.assertj.core.api.Assertions;
import org.dmashnikov.adapter.BurnableFuelAdapter;
import org.dmashnikov.adapter.CheckableFuelAdapter;
import org.dmashnikov.command.BurnFuelCommand;
import org.dmashnikov.command.CheckFuelCommand;
import org.dmashnikov.exception.CommandException;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BurnFuelTests {
    @Test
    void shouldBurnCheckableObject_whenFuelIsPositive() {
        HashMap<String, Object> data = new HashMap<>();

        data.put("fuel", 5);
        data.put("burn velocity", 2);
        BurnableFuelAdapter burnableFuelAdapter = new BurnableFuelAdapter(data);
        BurnFuelCommand burnFuelCommand = new BurnFuelCommand(burnableFuelAdapter);
        burnFuelCommand.execute();

        Integer newFuel = burnableFuelAdapter.getFuel();
        Assertions.assertThat(newFuel).isEqualTo(3);
    }

    @Test
    void shouldError_whenFuelNotExists() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("burn velocity", 2);
        BurnableFuelAdapter burnableFuelAdapter = new BurnableFuelAdapter(data);
        BurnFuelCommand burnFuelCommand = new BurnFuelCommand(burnableFuelAdapter);

        Assertions.assertThatThrownBy(() -> burnFuelCommand.execute())
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void shouldError_whenBurnVExists() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("fuel", 3);
        BurnableFuelAdapter burnableFuelAdapter = new BurnableFuelAdapter(data);
        BurnFuelCommand burnFuelCommand = new BurnFuelCommand(burnableFuelAdapter);

        Assertions.assertThatThrownBy(() -> burnFuelCommand.execute())
                .isInstanceOf(NullPointerException.class);
    }
}

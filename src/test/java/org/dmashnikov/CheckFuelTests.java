package org.dmashnikov;

import org.assertj.core.api.Assertions;
import org.dmashnikov.adapter.CheckableFuelAdapter;
import org.dmashnikov.command.CheckFuelCommand;
import org.dmashnikov.exception.CommandException;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class CheckFuelTests {
    @Test
    void shouldCheckCheckableObject_whenFuelIsPositive() {
        HashMap<String, Object> data = new HashMap<>();

        data.put("fuel", 2);
        CheckableFuelAdapter checkableFuelAdapter = new CheckableFuelAdapter(data);
        CheckFuelCommand checkFuelCommand = new CheckFuelCommand(checkableFuelAdapter);
        checkFuelCommand.execute();

        Integer newFuel = checkableFuelAdapter.getFuel();
        Assertions.assertThat(newFuel).isEqualTo(2);
    }

    @Test
    void shouldError_whenNoFuel() {
        HashMap<String, Object> data = new HashMap<>();

        data.put("fuel", -2);
        CheckableFuelAdapter checkableFuelAdapter = new CheckableFuelAdapter(data);
        CheckFuelCommand checkFuelCommand = new CheckFuelCommand(checkableFuelAdapter);

        Assertions.assertThatThrownBy(() ->  checkFuelCommand.execute())
                .isInstanceOf(CommandException.class).hasMessage("No more fuel");
    }
}

package org.dmashnikov;

import org.assertj.core.api.Assertions;
import org.dmashnikov.adapter.BurnableFuelAdapter;
import org.dmashnikov.adapter.CheckableFuelAdapter;
import org.dmashnikov.adapter.MovableAdapter;
import org.dmashnikov.command.BurnFuelCommand;
import org.dmashnikov.command.CheckFuelCommand;
import org.dmashnikov.command.MacroCommand;
import org.dmashnikov.command.MoveCommand;
import org.dmashnikov.model.ICommand;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class MacroCommandTests {

    @Test
    void shouldMoveAndBurnObject() {
        HashMap<String, Object> moveData = new HashMap<>();
        Vector<Integer> position = new Vector<>();
        position.add(0, 12);
        position.add(1, 5);
        Vector<Integer> velocity = new Vector<>();
        velocity.add(0, 4);
        velocity.add(1, -10);

        moveData.put("position", position);
        moveData.put("velocity", velocity);
        MovableAdapter moveAdapter = new MovableAdapter(moveData);
        MoveCommand moveCommand = new MoveCommand(moveAdapter);

        HashMap<String, Object> fuelData = new HashMap<>();
        fuelData.put("fuel", 5);
        fuelData.put("burn velocity", 4);

        CheckableFuelAdapter checkableFuelAdapter = new CheckableFuelAdapter(fuelData);
        BurnableFuelAdapter burnableFuelAdapter = new BurnableFuelAdapter(fuelData);
        CheckFuelCommand checkFuelCommand = new CheckFuelCommand(checkableFuelAdapter);
        BurnFuelCommand burnFuelCommand = new BurnFuelCommand(burnableFuelAdapter);

        LinkedList<ICommand> commands = new LinkedList<>();
        commands.add(checkFuelCommand);
        commands.add(moveCommand);
        commands.add(burnFuelCommand);
        MacroCommand macroCommand = new MacroCommand(commands);
        macroCommand.execute();

        Vector newPosition = moveAdapter.getPosition();
        Integer newFuel = burnableFuelAdapter.getFuel();
        Assertions.assertThat(newPosition.get(0)).isEqualTo(16);
        Assertions.assertThat(newPosition.get(1)).isEqualTo(-5);
        Assertions.assertThat(newFuel).isEqualTo(1);
    }
}

package org.dmashnikov;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Vector;

public class MoveTests {

    @Test
    void shouldMoveMovableObject_whenCorrectPositionAndVelocity() {
        HashMap<String, Object> data = new HashMap<>();
        Vector<Integer> position = new Vector<>();
        position.add(0, 12);
        position.add(1, 5);
        Vector<Integer> velocity = new Vector<>();
        velocity.add(0, -7);
        velocity.add(1, 3);

        data.put("position", position);
        data.put("velocity", velocity);
        MovableAdapter moveAdapter = new MovableAdapter(data);
        MoveCommand moveCommand = new MoveCommand(moveAdapter);
        moveCommand.execute();

        Vector newPosition = moveAdapter.getPosition();
        Assertions.assertThat(newPosition.get(0)).isEqualTo(5);
        Assertions.assertThat(newPosition.get(1)).isEqualTo(8);
    }

    @Test
    void shouldError_whenPositionNotExists() {
        HashMap<String, Object> data = new HashMap<>();
        Vector<Integer> velocity = new Vector<>();
        velocity.add(0, -7);
        velocity.add(1, 3);

        data.put("velocity", velocity);
        MoveCommand moveCommand = new MoveCommand(new MovableAdapter(data));
        Assertions.assertThatThrownBy(() -> moveCommand.execute())
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void shouldError_whenVelocityNotExists() {
        HashMap<String, Object> data = new HashMap<>();
        Vector<Integer> position = new Vector<>();
        position.add(0, 12);
        position.add(1, 5);

        data.put("position", position);
        MoveCommand moveCommand = new MoveCommand(new MovableAdapter(data));
        Assertions.assertThatThrownBy(() -> moveCommand.execute())
                .isInstanceOf(NullPointerException.class);
    }
}

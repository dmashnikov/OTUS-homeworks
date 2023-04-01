package org.dmashnikov;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Vector;

public class RotateTests {

    @Test
    void shouldRotateRotableObject_whenCorrectParams() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("direction", 3);
        data.put("direction number", 8);
        data.put("angular velocity", 2);
        RotableAdapter rotableAdapter = new RotableAdapter(data);
        RotateCommand rotateCommand = new RotateCommand(rotableAdapter);


        rotateCommand.execute();

        int newPosition = rotableAdapter.getDirection();
        Assertions.assertThat(newPosition).isEqualTo(5);
    }

    @Test
    void shouldError_whenDirectionNotExists() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("direction number", 8);
        data.put("angular velocity", 2);
        RotableAdapter rotableAdapter = new RotableAdapter(data);
        RotateCommand rotateCommand = new RotateCommand(rotableAdapter);


        Assertions.assertThatThrownBy(() -> rotateCommand.execute())
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void shouldError_whenDirectionNumberNotExists() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("direction", 1);
        data.put("angular velocity", 2);
        RotableAdapter rotableAdapter = new RotableAdapter(data);
        RotateCommand rotateCommand = new RotateCommand(rotableAdapter);


        Assertions.assertThatThrownBy(() -> rotateCommand.execute())
                .isInstanceOf(NullPointerException.class);
    }


    @Test
    void shouldError_whenVelocityNotExists() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("direction number", 8);
        data.put("direction", 2);
        RotableAdapter rotableAdapter = new RotableAdapter(data);
        RotateCommand rotateCommand = new RotateCommand(rotableAdapter);


        Assertions.assertThatThrownBy(() -> rotateCommand.execute())
                .isInstanceOf(NullPointerException.class);
    }
}

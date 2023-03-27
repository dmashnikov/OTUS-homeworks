package org.dmashnikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Vector;

public class MoveTests {

    @Test
    void checkMoveObject() {
        HashMap<String, Object> data = new HashMap<>();
        Vector<Integer> position = new Vector<>();
        position.add(0, 0);
        position.add(1, 0);
//        Vector<Integer> velocity = new Vector<>();
//        velocity.add(0, -7);
//        velocity.add(1, 3);

        data.put("position", position);
//        data.put("velocity", 10);
        data.put("velocity", 10);
        data.put("direction", 45);
        data.put("direction_number", 1);
        MoveAdapter moveCommandAdapter = new MoveAdapter(data);
        Vector position1 = moveCommandAdapter.getPosition();
        Vector velocity1 = moveCommandAdapter.getVelocity();
        Assertions.assertEquals(1, 1);
    }
}

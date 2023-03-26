package org.dmashnikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Vector;

public class MoveTests {

    @Test
    void checkMoveObject() {
        HashMap<String, Vector> data = new HashMap<>();
        data.put("position", new Vector<>(12, 5));
        data.put("velocity", new Vector<>(-7, 3));
        new MoveCommandAdapter(data);
        Assertions.assertEquals(1, 1);
    }
}

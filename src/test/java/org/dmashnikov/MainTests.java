package org.dmashnikov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTests {

    @Test
    void test1() {
        double a = 2;
        double b = 3;
        double c = 7;

        MathUtils mathUtils = new MathUtils();
        double [] actual = mathUtils.solve(a, b, c);
        Assertions.assertEquals(0, actual.length);

    }
}

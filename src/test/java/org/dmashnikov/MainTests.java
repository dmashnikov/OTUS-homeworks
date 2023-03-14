package org.dmashnikov;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class MainTests {

    @Test
    void shouldReturnEmptyArr_whenDiscriminantLessThanZero() {
        double a = 2;
        double b = 3;
        double c = 7;

        MathUtils mathUtils = new MathUtils();
        List<Double> actual = mathUtils.solve(a, b, c);
        assertThat(actual).isEmpty();
    }

    @Test
    void shouldReturnOneValue_whenDiscriminantEqZero() {
        double a = 9;
        double b = 12;
        double c = 4;
        double expected = -0.666666;

        MathUtils mathUtils = new MathUtils();
        List<Double> actual = mathUtils.solve(a, b, c);
        assertThat(actual.size()).isEqualTo(1);
        assertThat(actual.get(0)).isEqualTo(expected, Offset.offset(0.000005));
    }
}

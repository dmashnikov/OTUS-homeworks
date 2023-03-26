package org.dmashnikov;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.dmashnikov.MathUtils.solve;

import java.util.List;

public class MainTests {

    @Test
    void shouldReturnEmptyArr_whenDiscriminantLessThanZero() {
        double a = 2;
        double b = 3;
        double c = 7;

        List<Double> actual = solve(a, b, c);
        assertThat(actual).isEmpty();
    }

    @Test
    void shouldReturnOneValue_whenDiscriminantEqZero() {
        double a = 9;
        double b = 12;
        double c = 4;
        double expected = -0.666666;

        List<Double> actual = solve(a, b, c);
        assertThat(actual.size()).isEqualTo(1);
        assertThat(actual.get(0)).isEqualTo(expected, Offset.offset(0.000005));
    }

    @Test
    void shouldReturnTwoValues_whenDiscriminantMoreZero() {
        double a = 5;
        double b = 12;
        double c = 4;
        List<Double> expected = List.of(-2d, -0.4d);

        List<Double> actual = solve(a, b, c);
        assertThat(actual.size()).isEqualTo(2);
        assertThat(actual).hasSameElementsAs(expected);
    }

    @Test
    void shouldReturnException_whenAEqZero() {
        double a = Math.pow(10, -9);
        double b = 1;
        double c = 3;

        assertThatThrownBy(() ->  solve(a, b, c))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    void shouldReturnException_whenAIsNull() {
        Double a = null;
        double b = 1;
        double c = 5;

        assertThatThrownBy(() ->  solve(a, b, c))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void shouldReturnException_whenAEqZero_2() {
        double a = 0;
        double b = 1;
        double c = 3;
        assertThatThrownBy(() ->  solve(a, b, c))
                .isInstanceOf(ArithmeticException.class);
    }
}

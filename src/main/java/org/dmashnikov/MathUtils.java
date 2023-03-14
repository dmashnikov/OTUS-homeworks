package org.dmashnikov;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    private static final double EPSILON = 0.000005;

    public List<Double> solve(double a, double b, double c) {
        List<Double> solutions = new ArrayList<>();
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return solutions;
        }
        if (Math.abs(D) < EPSILON) {
            double x = - b / (2 * a);
            solutions.add(x);
            return solutions;
        }
        return null;
    }
}

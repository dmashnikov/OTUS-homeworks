package org.dmashnikov;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    private static final double EPSILON = Math.pow(10, -7);

    public static List<Double> solve(double a, double b, double c) {
        List<Double> solutions = new ArrayList<>();
        double D = b * b - 4 * a * c;
        if (a < EPSILON && a >= 0) {
            throw new ArithmeticException();
        }
        if (D < 0) {
            return solutions;
        }
        if (Math.abs(D) < EPSILON) {
            double x = - b / (2 * a);
            solutions.add(x);
            return solutions;
        }
        if (D > 0) {
            double x1 = - (b  +  Math.sqrt(D))/ (2 * a);
            double x2 = - (b  -  Math.sqrt(D)) / (2 * a);
            solutions.add(x1);
            solutions.add(x2);
            return solutions;
        }
        return solutions;
    }
}

package org.dmashnikov;

public class MathUtils {
    public double[] solve(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return new double[0];
        }
        return null;
    }
}

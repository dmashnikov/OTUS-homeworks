package org.dmashnikov.command;

public class RotateCommand implements IRotateCommand{

    private int degree;
    private int delta;

    public RotateCommand(int degree, int delta) {
        this.degree = degree;
        this.delta = delta;
    }

    @Override
    public void rotate() {
        degree += delta;
    }
}

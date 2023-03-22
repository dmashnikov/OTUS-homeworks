package org.dmashnikov.command;

public class MoveCommand implements IMoveCommand {
    private int x;
    private int y;
    private int dx;
    private int dy;

    public MoveCommand(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }
    @Override
    public void move() {
        x += dx;
        y += dy;
    }
}

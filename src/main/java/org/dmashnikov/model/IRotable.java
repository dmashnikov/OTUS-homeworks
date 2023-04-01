package org.dmashnikov.model;

public interface IRotable {
    int getDirection();
    int getDirectionNumber();
    int getAngularVelocity();
    void setDirection(int newDir);
}

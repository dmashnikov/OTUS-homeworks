package org.dmashnikov;

import java.util.Vector;

public interface IMovable {
    Vector getPosition();
    Vector getVelocity();
    void setPosition(Vector newVector);

}

package org.dmashnikov.model;

public interface IBurnableFuel {
    Integer getFuel();
    Integer getBurnVelocity();
    void setFuel(int newF);
}

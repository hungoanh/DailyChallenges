package main.java.DataStructures;

/**
 * Created by hle on 1/11/18.
 */
public abstract class Vehicle {
    private String licensePlate;
    private int size;

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

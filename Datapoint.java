// src/main/java/com/example/dataanalysis/model/DataPoint.java

package com.example.dataanalysis.model;

public class DataPoint {
    private double x;
    private double y;

    public DataPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

package com.mainacad.model;

public class Quadrilateral extends Square{

    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * getSide();
    }
}

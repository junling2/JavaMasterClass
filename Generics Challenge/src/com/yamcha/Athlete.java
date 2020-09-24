package com.yamcha;

public abstract class Athlete {
    private String name;
    private int height;
    private double weight;

    public Athlete(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void train();
}

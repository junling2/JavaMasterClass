package com.yamcha;

import java.util.ArrayList;
// example of inner class, class Gear only needed in context of Gearbox, no need to make a separate class.
// can access outer fields and methods using "Gearbox.this.currGear"

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number < this.maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear <= this.maxGears) && clutchIsIn) {
            currGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        }
        else {
            System.out.println("Gear not available or clutch failure, defaulting to neutral");
            currGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Vroom Vroom");
        }
        return revs * gears.get(currGear).getRatio();
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }
    }
}

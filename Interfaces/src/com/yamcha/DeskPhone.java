package com.yamcha;

public class DeskPhone implements ITelephone {
    private boolean isRinging;
    private long myNumber;
    private boolean power;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    // checks if class has proper methods, parameters, and return types as stated in interface, if not, error will occur.
    @Override
    public void p0werOn() {
        System.out.println("DeskPhone is now powered on");
        this.power = true;
    }

    public void powerOff() {
        System.out.println("DeskPhone is now powered off");
        this.power = false;
    }

    @Override
    public void dial(int phoneNumber) {
        if (power) {
            System.out.println("Now calling: " + phoneNumber + " from DeskPhone");
        }
        else {
            System.out.println("phone is off, cannot call");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && power) {
            isRinging = true;
            System.out.println("ring ring");
        }
        else {
            isRinging = false;
            System.out.println("Phone is not on or not my number");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

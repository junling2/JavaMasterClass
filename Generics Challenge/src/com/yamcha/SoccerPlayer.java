package com.yamcha;

public class SoccerPlayer extends Athlete{
    private int goals = 0;
    private int assists = 0;

    public SoccerPlayer(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + "is sleeping");
    }

    @Override
    public void train() {
        System.out.println(getName() + "is training");
    }

    public void scoreGoal() {
        goals += 1;
    }

}

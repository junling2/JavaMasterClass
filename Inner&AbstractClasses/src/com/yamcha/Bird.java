package com.yamcha;
// can have abstract classes extending abstract classes, able to fine tune and restrict necessary methods at
// each level.

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void breathe() {

    }

    public abstract void layEgg();

}

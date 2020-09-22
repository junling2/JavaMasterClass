package com.yamcha;
// abstract forces subclasses that extend from this class to define listed methods, unlike normal extending
// similar to implementing interfaces, but more flexibility, can define fields, base methods that can be used
// by subclasses, unlike interfaces, which can only strictly define necessary methods.

public abstract class Animal {
    private String name;

    public abstract void eat();
    public abstract void breathe();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package com.yamcha;

public interface ITelephone {
    // only defining parameters, return types, and methods that will implement this interface.
    void p0werOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}

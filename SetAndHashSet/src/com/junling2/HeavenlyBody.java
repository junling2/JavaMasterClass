package com.junling2;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyTypes bodyType;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites); // for immutability
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody thisObject = (HeavenlyBody) obj;
            if (this.name.equals(thisObject.getName())) {
                return this.bodyType == thisObject.getBodyType();
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 69 + this.bodyType.hashCode(); // this is best practice so that a String "Pluto" will have different hashCode than HeavenlyBody pluto
        // added hashcode of bodytype as well in case of having same String name but for different bodytypes
    }

    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }

    /* there is an option for making a Key inner class to identify within a map so that it
    isn't only using String name and 2 heavenlyBodies with the same name will be unique keys in a Map.
    the implementation would involve creating an inner Key class that
    groups together String name and BodyType bodyType, and removing from the outer HeavenlyBody class.
    instead operations will call the inner Key class.
    The outer class constructor will instantiate a new Key class everytime it is called by passing the
    name and bodyType, and initializing a Key field within HeavenlyBody.
     */

}

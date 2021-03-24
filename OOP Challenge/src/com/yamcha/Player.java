package com.yamcha;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String n, int h, int s) {
        name = n;
        weapon = "Sword";
        hitPoints = h;
        strength = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public List<String> write() {
        List<String> ls = new ArrayList<>();
        ls.add(name);
        ls.add("" + hitPoints);
        ls.add("" + strength);
        ls.add(weapon);
        return ls;
    }

    public void read(List<String> ls) {
        if (ls != null && ls.size() > 0) {
            name = ls.get(0);
            hitPoints = Integer.parseInt(ls.get(1));
            strength = Integer.parseInt(ls.get(2));
            weapon = ls.get(3);
        }
    }

    @Override
    public String toString() {
        String s = String.format("Player{name=%s, hitPoints=%d, strength=%d, weapon=%s}", name, hitPoints, strength, weapon);
        return s;
    }
}

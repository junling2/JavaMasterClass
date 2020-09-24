package com.yamcha;

import java.util.ArrayList;

public class Team<T extends Athlete> implements Comparable<Team<T>> {
    private String name;
    int gamesPlayed = 0;
    int wins = 0;
    int losses = 0;
    int draws = 0;
    private ArrayList<T> teamMembers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return teamMembers.size();
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getPoints() {
        return (wins * 3) + (draws * 1);
    }

    public boolean addMember(T newMember) {
        if (teamMembers.contains(newMember)) {
            System.out.println(newMember.getName() + "is already on the team");
            return false;
        }
        else {
            teamMembers.add(newMember);
            return true;
        }
    }

    @Override
    public int compareTo(Team<T> team) {
        if (getPoints() > team.getPoints()) {
            return -1;
        }
        else if (getPoints() < team.getPoints()) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

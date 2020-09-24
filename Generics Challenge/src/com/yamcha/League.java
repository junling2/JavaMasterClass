package com.yamcha;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in " + name);
            return false;
        }
        else {
            teams.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(teams);

        for (T t : teams) {
            System.out.println(t.getName() + " " + t.getPoints());
        }
    }

    public void matchResult(T team1, T team2, int score1, int score2) {
        team1.setGamesPlayed(team1.getGamesPlayed() + 1);
        team2.setGamesPlayed(team2.getGamesPlayed() + 1);

        if (score1 > score2) {
            team1.setWins(team1.getWins() + 1);
            team2.setLosses(team2.getLosses() + 1);
        }
        else if (score2 > score1) {
            team1.setLosses(team1.getLosses() + 1);
            team2.setWins(team2.getWins() + 1);
        }
        else {
            team1.setDraws(team1.getDraws() + 1);
            team2.setDraws(team2.getDraws() + 1);
        }
    }
}

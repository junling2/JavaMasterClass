package com.yamcha;

public class Main {

    public static void main(String[] args) {

        League<Team<SoccerPlayer>> premierLeague = new League<>("English Premier League");

        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        Team<SoccerPlayer> manU = new Team<>("Manchester United");
        Team<SoccerPlayer> manCity = new Team<>("Manchester City");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");

        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(manU);
        premierLeague.addTeam(manCity);
        premierLeague.addTeam(arsenal);

        premierLeague.matchResult(liverpool, chelsea, 2, 1);
        premierLeague.matchResult(manCity, manU, 3, 3);
        premierLeague.matchResult(liverpool, manCity, 1, 1);

        premierLeague.showLeagueTable();

    }
}

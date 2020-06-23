package com.rishiramgolam;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // Players
        FootballPlayer david = new FootballPlayer("David Beckham");
        FootballPlayer pogba = new FootballPlayer("Pogba");

        FootballPlayer robbie = new FootballPlayer("Robbie Fowler");
        FootballPlayer gerrard = new FootballPlayer("Steven Gerrard");

        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant");
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan");

        HockeyPlayer sandra = new HockeyPlayer("Sandra Pucker");
        HockeyPlayer billie = new HockeyPlayer("Billie Sticks");

        // Team
        Team<FootballPlayer> united = new Team<>("Manchester United");
        united.addPlayer(david);
        united.addPlayer(pogba);

        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
        liverpool.addPlayer(robbie);
        liverpool.addPlayer(gerrard);

        Team<BasketballPlayer> jets = new Team<>("The Jets");
        jets.addPlayer(kobe);
        jets.addPlayer(jordan);

        Team<HockeyPlayer> mightyDucks = new Team<>("The Mighty Ducks");
        mightyDucks.addPlayer(sandra);
        mightyDucks.addPlayer(billie);

        // Matches
        united.matchResult(liverpool,3,4);
        united.matchResult(liverpool,5,2);
        united.matchResult(liverpool,0,2);

        System.out.println("Manchester Ranking " + united.ranking());
        System.out.println("Liverpool Ranking " + liverpool.ranking());
        
//        ArrayList<Team> teams = new ArrayList<>();
//        teams.add(liverpool);
//        teams.add(united);
//
//        Collections.sort(teams);
//        System.out.println(teams.toString());

        League<Team<FootballPlayer>> theLeague = new League<>("The League of Legends");
        theLeague.addTeam(united);
        theLeague.addTeam(liverpool);
        theLeague.printLeagueTable();
    }
}

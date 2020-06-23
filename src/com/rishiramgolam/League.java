package com.rishiramgolam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {

    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (!teams.contains(team)) {
            teams.add(team);
            System.out.println("Team " + team.getName() + " added to league " + this.name);
            return true;
        } else {
            System.out.println("Team " + team.getName() + " is already in the league.");
            return false;
        }
    }

    public void printLeagueTable() {
        Collections.sort(teams);
        for (T t : teams) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }

}

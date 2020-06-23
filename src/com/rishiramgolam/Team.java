package com.rishiramgolam;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable <Team<T>> {

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (!members.contains(player)) {
            members.add(player);
            System.out.println("Player " + player.getName() + " added to Team " + this.name);
            return true;
        } else {
            System.out.println("Player already on the team.");
            return false;
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
            //opponent.lost++;
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
            //opponent.won++;
        } else {
            // draw
            tied++;
            message = " drew with ";
            //opponent.tied++;
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);    // recursion to update opponents score, rather than update individually.
        }
    }

    public int numPlayers() {
        return members.size();
    }

    public String getName() {
        return name;
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}

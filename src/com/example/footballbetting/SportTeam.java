package com.example.footballbetting;

import java.util.ArrayList;
import java.util.List;

public class SportTeam {
    String name;
    List<SportPlayer> playerList;
    List<Match> matchList;

    public SportTeam(String name, List<SportPlayer> playerList, List<Match> matchList) {
        this.name = name;
        this.playerList = playerList;
        this.matchList = matchList;
    }

    public void addMatch(Match new_match) {
        matchList.add(new_match);
    }

    public void addPlayer(SportPlayer new_player) {
        playerList.add(new_player);
    }

    public String getName() {
        return name;
    }

    public List<SportPlayer> getPlayerList() {
        return playerList;
    }

    public List<Match> getMatchList() {
        return matchList;
    }
}

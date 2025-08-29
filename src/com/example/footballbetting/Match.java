package com.example.footballbetting;

import java.util.ArrayList;
import java.util.List;

public class Match {
    public final SportTeam teamHome;
    public final SportTeam teamAway;
    public List<Goal> goalList;

    public Match(SportTeam teamHome, SportTeam teamAway) {
        this.teamHome = teamHome;
        this.teamAway = teamAway;
        this.goalList = new ArrayList<>();
    }

    public void newGoal(SportPlayer player, SportTeam goal_team, SportTeam opposite_team) {
        Goal new_Goal = new Goal(player, goal_team, opposite_team);
        goalList.add(new_Goal);
    }

    public void setGoalList(List<Goal> goalList) {
        this.goalList = goalList;
    }

    public SportTeam getTeamHome() {
        return teamHome;
    }

    public SportTeam getTeamAway() {
        return teamAway;
    }

    public List<Goal> getGoalList() {
        return goalList;
    }
}

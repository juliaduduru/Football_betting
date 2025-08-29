package com.example.footballbetting;

public class Goal {
    SportPlayer player;
    SportTeam player_team;
    SportTeam opposite_team;

    public Goal(SportPlayer player, SportTeam player_team, SportTeam opposite_team) {
        this.player = player;
        this.player_team = player_team;
        this.opposite_team = opposite_team;
        setPlayer_GoalCount(player);
    }

    private void setPlayer_GoalCount(SportPlayer player) {
        player.addGoal();
    }

    public SportPlayer getPlayer() {
        return player;
    }

    public SportTeam getPlayer_team() {
        return player_team;
    }

    public SportTeam getOpposite_team() {
        return opposite_team;
    }
}

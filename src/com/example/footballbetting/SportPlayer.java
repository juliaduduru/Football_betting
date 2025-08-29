package com.example.footballbetting;

public class SportPlayer {
    String name;
    String position;
    int goals;

    public SportPlayer(String name, String position){
        this.name = name;
        this.position = position;
        this.goals = 0;
    }

    public void addGoal() {
        this.goals = goals+1;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getGoals() {
        return goals;
    }
}



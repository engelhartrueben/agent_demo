package ruby.poker.agent_demo;

import java.util.LinkedList;

public class Agent {
    private String teamName;
    private LinkedList<String> teamMembers;

    Agent() {
        this.teamMembers = new LinkedList<>();

        // ADD YOUR TEAM NAME HERE
        this.teamName = "";

        // ADD YOUR TEAM MEMBERS HERE
        this.teamMembers.add("");
        this.teamMembers.add("");
    }

    // DO NOT CHANGE
    public String getTeamName() {
        if (this.teamName.isEmpty()) {
            System.out.println("Please set team name!");
        }
        return this.teamName;
    }

    // DO NOT CHANGE
    public LinkedList<String> getTeamMembers() {
        if (this.teamMembers.isEmpty()) {
            System.out.println("Please add team members!");
        }

        return this.teamMembers;
    }
}

package com.Insurance.Claims.Insurance.Models;

public class Agent {
    private int agentId;
    private String agentName;

    // Default constructor
    public Agent() {
    }

    // Parameterized constructor
    public Agent(int agentId, String agentName) {
        this.agentId = agentId;
        this.agentName = agentName;
    }

    // Getter for agentId
    public int getAgentId() {
        return agentId;
    }

    // Setter for agentId
    public void setAgentId(int agentId) {
        this.agentId = agentId;
    }

    // Getter for agentName
    public String getAgentName() {
        return agentName;
    }

    // Setter for agentName
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    @Override
    public String toString() {
        return "Agent{" +
               "agentId=" + agentId +
               ", agentName='" + agentName + '\'' +
               '}';
    }
}


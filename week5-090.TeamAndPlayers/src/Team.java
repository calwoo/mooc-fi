/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author calvi
 */
import java.util.*;

public class Team {
    private String name;
    private ArrayList<Player> members;
    private int maxSize;
    
    public Team(String teamName) {
        this.name = teamName;
        this.members = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public void addPlayer(Player player) {
        if (this.members.size() < this.maxSize) {
            members.add(player);
        }
        
    }
    
    public void printPlayers() {
        for (Player player : members) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.members.size();
    }
    
    public int goals() {
        int totalGoals = 0;
        for (Player player : members) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
    
    public String getName() {
        return this.name;
    }
}

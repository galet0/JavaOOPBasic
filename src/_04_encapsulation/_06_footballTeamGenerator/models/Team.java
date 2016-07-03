package _04_encapsulation._06_footballTeamGenerator.models;

import java.util.HashMap;

/**
 * Created by User on 02.07.2016.
 */
public class Team {
    private String name;
    private HashMap<String, Player> playersByName;

    public Team(String name) {
        this.setName(name);
        this.playersByName = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name == null || name.trim().length() == 0){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public double getRating(){
        if(this.playersByName.size() == 0){
            return 0;
        }
        double totalRating = 0;
        for (Player player : this.playersByName.values()) {
            totalRating += player.getSkillLevel();
        }
        return totalRating / this.playersByName.size();
    }
    public void addPlayer(Player player){
        this.playersByName.put(player.getName(),player);
    }
    public void removePlayer(String playerStr){
        if(!this.playersByName.containsKey(playerStr)){
            throw new IllegalArgumentException(String.format("Player %s is not in %s team.", playerStr, this.name));
        }
        this.playersByName.remove(playerStr);
    }
}

package _04_encapsulation._06_footballTeamGenerator;

import _04_encapsulation._06_footballTeamGenerator.models.Player;
import _04_encapsulation._06_footballTeamGenerator.models.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    private static BufferedReader reader;
    private static HashMap<String, Team> teams;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        teams = new HashMap<>();

        while (true){
            String[] input = reader.readLine().split(";");
            if(input[0].equals("END")){
                break;
            }
            try {
                switch (input[0]) {
                    case "Team":
                        Team team = tryMakeTeam(input);
                        teams.put(team.getName(), team);
                        break;
                    case "Add":
                        tryMakePlayer(input);
                        break;
                    case "Remove":
                        tryRemovePlayer(input);
                        break;
                    case "Rating":
                        double result = getTeamRating(input);
                        System.out.printf("%s - %.0f", input[1], result);
                        break;
                }

            } catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
    }

    private static double getTeamRating(String[] input) {
        String teamName = input[1];
        if(!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
        }
        Team team = teams.get(teamName);
        return team.getRating();
    }

    private static void tryRemovePlayer(String[] input) {
        String teamName = input[1];
        if(!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
        }
        String playerName = input[2];
        Team team = teams.get(teamName);
        team.removePlayer(playerName);
    }

    private static void tryMakePlayer(String[] input) {
        String teamName = input[1];
        if(!teams.containsKey(teamName)){
            throw new IllegalArgumentException(String.format("Team %s does not exist.", teamName));
        }
        //endurance, sprint, dribble, passing and shooting
        String playerName = input[2];
        double endurance = Double.parseDouble(input[3]);
        double sprint = Double.parseDouble(input[4]);
        double dribble = Double.parseDouble(input[5]);
        double passing = Double.parseDouble(input[6]);
        double shooting = Double.parseDouble(input[7]);
        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
        Team team = teams.get(teamName);
        team.addPlayer(player);
    }

    private static Team tryMakeTeam(String[] input) {
        String teamName = input[1];
        Team team = new Team(teamName);
        return team;
    }
}

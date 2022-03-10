package videos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {
	
	static Scanner scanner = new Scanner(System.in);
	static List<Team> teams = new ArrayList<>();
	
	public static void main(String[] args) {
//		
//		Player p1 = new Player("Thomas", "Full Back", "Running Fast");
//		Player p2 = new Player("Sally", "Quarterback", "Throwing Far");
//		
//		Team team = new Team("Really Good Football Team");
//		team.addPlayer(p1);
//		team.addPlayer(p2);
//		team.describe();
//		
//		team.removePlayer("Thomas");
//		team.describe();
		
		int decision = 0;
		
		while (true) {			
			printOptions();			
			decision = scanner.nextInt();
			if (decision == 1) {
				teams.add(createNewTeam());
			} else if (decision == 2) {
				addPlayerToTeam();
			} else if (decision == 3) {
				removePlayerFromTeam();
			} else if (decision == 4){
				describeTeam();
			} else {
				System.out.println("Please pick a valid option!");
			}
		}
		
	}
	
	private static void describeTeam() {
		printTeamNames();
		System.out.println("Which team would you like to see the infor for?");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void removePlayerFromTeam() {
		printTeamNames();
		System.out.println("Enter the name of the team you wish to remove a player to: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
			System.out.println("Which player would you like to remove?");
			String playerName = scanner.next();
			foundTeam.removePlayer(playerName);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private static void addPlayerToTeam() {
		printTeamNames();
		System.out.println("Enter the name of the team you wish to add a player to: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	private static Player createNewPlayer() {
		System.out.println("Enter player name:");
		String name = scanner.next();
		System.out.println("Enter player position:");
		String position = scanner.next();
		System.out.println("Enter player speciality: ");
		String specialty = scanner.next();
		return new Player(name, position, specialty);
		
	}

	private static void printTeamNames() {
		for (Team team : teams) {
			System.out.println(team.getName());
		}
	}
	
	private static Team findTeamByName(String name) throws Exception{
		for (Team team : teams) {
			if (team.getName().equals(name)) {
				return team;
			}
		}
		throw new Exception("Team Not Found: " + name);
	}

	private static void printOptions() {
		System.out.println("1) Create New Team");
		System.out.println("2) Add New Player to Team");
		System.out.println("3) Remove Player from Team");
		System.out.println("4) View Team Info");
	}
	
	private static Team createNewTeam() {
		System.out.println("Enter name of team you want to create: ");
		String name = scanner.next();
		return new Team(name);		
	}

}

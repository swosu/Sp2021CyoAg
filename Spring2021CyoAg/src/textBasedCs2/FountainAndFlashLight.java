package textBasedCs2;

import java.util.Scanner;

public class FountainAndFlashLight {

	public static void main(String[] args) {
		System.out.println("Create a character");
		
		GameCharacter mainPlayer = new GameCharacter();
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		mainPlayer.setName(input.next());
		
		System.out.println("Hello " + mainPlayer.getName());
		
		System.out.println("We give you a companion.");
		System.out.println("What is your companion's name?");
		CompanionCharacter sideKick = new CompanionCharacter();
		sideKick.setName(input.next());

		System.out.printf("%s and %s head off on the fountain and flashlight adventure.\n", mainPlayer.getName(), sideKick.getName());
		
		FountainAdventure sideQuest = new FountainAdventure(mainPlayer, sideKick);
		
		sideQuest.printMission();
	}

}

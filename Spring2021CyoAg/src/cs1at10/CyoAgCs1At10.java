package cs1at10;

import java.util.Scanner;

public class CyoAgCs1At10 {

	public static void main(String[] args) {
		System.out.println("You wake up under a tree. (Yeah! Rested.)");
		System.out.println("You are at the foot of a rainbow.");
		System.out.println("You also see a magnifying glass and a small city.");
		System.out.println("Please make a selection:");
		System.out.println("1: follow rainbow.");
		System.out.println("2: pick up magnifying glass.");

		Scanner input = new Scanner(System.in);

		int selection01 = input.nextInt();

		switch(selection01)
		{

		case 1: System.out.println("You choose to follow the rainbow.");
		System.out.println("You fall into a giant hole...");

		System.out.println("At the bottom of a hole, you wake up in a yard.");
		System.out.println("You see a small house in the yard.");
		System.out.println("You also see a small compas.");
		System.out.println("Please make a choice");
		System.out.println("1: house");
		System.out.println("2: compas");
		int selection02 = input.nextInt();

		switch(selection02)
		{
		case 1: 
			System.out.println("you decide to walk to the house.");
			System.out.println("out pops a vacuum sweeper!");
			break;
		case 2: 
			System.out.println("you pick up the small compas.");
			System.out.println("the compas points towards a path.");
			System.out.println("you start walking down the path...");
			break;
		default: System.out.println("you are a potato!");break;
		}		
		break; // end of following rainbow

		case 2: System.out.println("You pick up the magnifying glass.");
		System.out.println("An Ogre yells down from the tree.");
		System.out.println("\"You get out of my swamp!\"");
		System.out.println("\"And put down my magnifying glass!\"");
		break;


		default: System.out.println("Poof! You became a potato.");
		}

		System.out.println("Thank you for playing.");
	}

}

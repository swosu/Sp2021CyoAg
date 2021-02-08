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
		break;
		
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

package cs1at9;

import java.util.Scanner;

public class Cs1At9CyoAg {

	public static void main(String[] args) {
		System.out.println("You awaken in a cell.");
		System.out.println("You are sitting in a bunk next to a turtle woman.");
		System.out.println("They are unconcious.");

		System.out.println("Please make a selection:");
		System.out.println("1: jimmy the lock.");
		System.out.println("2: talk to the turtle.");

		Scanner input = new Scanner(System.in);


		int userSelect01 = input.nextInt();

		switch(userSelect01) {
		
		case 1: System.out.println("You tried to jimmy the lock. The gaurd comes..."); break;
		case 2: System.out.println("You tried to wake up the turle woman by talking to them."
				+ "\nThey wake up and tell you an escape plan."); 
		System.out.println("1: alert the gaurd.");
		System.out.println("2: listen and try to play along.");
		
		int userSelection02 = input.nextInt();
		switch(userSelection02) 
		{
		case 1: System.out.println("You call out to the guard. The gaurd comes..."); break;
		case 2: System.out.println("You listen and play along. They spring the escape.");
		System.out.println("They use you as a shield from the blast...");break;
		default: System.out.println("Poof! You are a super potato.");break;
		} break;
		
		default: System.out.println("Poof! You are a potato.");
				
		}
		
		System.out.println("Thank you for playing.");
	}

}

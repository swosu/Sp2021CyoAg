package cs2;

import java.awt.Component;

import javax.swing.JOptionPane;

public class GamePlay {
	Component frame = null;

	public void greetPlayer() {
		JOptionPane.showMessageDialog(
				frame, "Welcome to a choose your own adventure game.\nClick OK to continue.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
	}

	public void explainProcess() {
		JOptionPane.showMessageDialog(
				frame, "You are going to push buttons.\nClick OK to continue.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
	}

	public void lastPopUp() {
		JOptionPane.showMessageDialog(
				frame, "So long and thanks for all the fish.\nClick OK to close.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
	}

	public int keepPlaying() {

		Component frame = null;
		//Custom button text
		Object[] options = {"Yes, please",
				"No, thanks",
		"No eggs, no ham!"};
		int n = JOptionPane.showOptionDialog(frame,
				"Would you like to keep playing?",
				"Cs2CyoAg",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[2]);
		return n;

	}

	public int selectRoom() {

		Component frame = null;
		//Custom button text
		Object[] options = {"Blue Room",
				"Red Room",
		"Pink Room"};
		int n = JOptionPane.showOptionDialog(frame,
				"Which Room Would you like to go into?",
				"Cs2CyoAg",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[2]);
		return n;
	}

	public void blueRoom(PlayerGear player) {
		BlueRoorm blue = new BlueRoorm();
		
		boolean keepGoing = true;
		while(keepGoing) {
			int blueChoice = blue.welcomeToBlueRoom();
			
			switch(blueChoice) {
			case 0: blue.openTheBox(player); break;
			case 1: blue.goDownHall(); break;
			case 2: keepGoing = false; break; 
			}
		}
		
	}



	public void redRoom(PlayerGear player) {
		RedRoom red = new RedRoom();
		boolean keepGoing = true;
		while(keepGoing) {
			int blueChoice = red.welcomeToRedRoom();
			
			switch(blueChoice) {
			case 0: red.openTheBox(player); break;
			case 1: red.goDownHall(); break;
			case 2: keepGoing = false; break; 
			}
		}
	}
	
	public void youAreAPotato() {
		JOptionPane.showMessageDialog(
				frame, "You are a potato.\nClick OK to continue.","Curtains of Shame",JOptionPane.PLAIN_MESSAGE);
		
	}

	public void pinkRoom(PlayerGear player) {
		PinkRoom pink = new PinkRoom();
		boolean keepGoing = true;
		while(keepGoing) {
			int blueChoice = pink.welcomeToPinkRoom();
			
			switch(blueChoice) {
			case 0: pink.openTheBox(player); break;
			case 1: pink.goDownHall(); break;
			case 2: keepGoing = false; break; 
			}
		}
		
	}

}

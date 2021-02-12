package cs2;

import java.awt.Component;

import javax.swing.JOptionPane;

public class PinkRoom {
	Component frame = null;
	
	public int welcomeToPinkRoom() {
		JOptionPane.showMessageDialog(
				frame, "Back in the pink room again.\nClick OK to continue.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
		
		JOptionPane.showMessageDialog(
				frame, "There is a box and a smell.\nClick OK to continue.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
		
		//Custom button text
				Object[] options = {"Open the box",
						"Follow Smell",
				"Return"};
				int blueChoice = JOptionPane.showOptionDialog(frame,
						"Which would you like to do?",
						"Cs2CyoAg",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						options,
						options[2]);
				return blueChoice;
	}

	public void openTheBox(PlayerGear player) {
		JOptionPane.showMessageDialog(frame, "You open the box.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "You find a box of tape.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "This is not as interesting as the mystical butter.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		player.setHasTape(true);
		player.setHasButter(true);
		JOptionPane.showMessageDialog(frame, "You may go.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
	}

	public void goDownHall() {
		JOptionPane.showMessageDialog(frame, "You go down the hall.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "Dead end...\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "You go back to the blue room.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		
		
	}


}

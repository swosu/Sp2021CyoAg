package cs2;

import java.awt.Component;

import javax.swing.JOptionPane;

public class BlueRoorm {
	Component frame = null;

	public int welcomeToBlueRoom() {
		JOptionPane.showMessageDialog(frame, "Welcome to the Blue Room.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "You smell cinnamon coming from down the hall.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "You see a box on the floor.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);

		//Custom button text
		Object[] options = {"Open the box",
				"Go Down the hall",
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
		JOptionPane.showMessageDialog(frame, "You find a potato.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "This is not as interesting as the bright TI-84.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		player.setHasTI84(true);
		player.setHasPotato(true);
		JOptionPane.showMessageDialog(frame, "You may go.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		
		
	}

	public void goDownHall() {
		JOptionPane.showMessageDialog(frame, "You go down the hall.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "Dead end...\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "You go back to the blue room.\nClick OK to continue.","Blue Room",JOptionPane.PLAIN_MESSAGE);
		
	}

}

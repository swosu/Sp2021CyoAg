package cs2;

import java.awt.Component;

import javax.swing.JOptionPane;

public class GamePlay {

	public void greetPlayer() {
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "Welcome to a choose your own adventure game.\nClick OK to continue.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
		
	}

	public void explainProcess() {
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "You are going to push buttons.\nClick OK to continue.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
		
	}

	public void lastPopUp() {
		Component frame = null;
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

	public void fake() {
		// TODO Auto-generated method stub
		
	}

}

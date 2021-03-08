import java.awt.Component;

import javax.swing.JOptionPane;

public class HelloCyoAg {
	
	//https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

	public static void main(String[] args) {
		System.out.println("Hello Choose Your Own Adventure Game.");
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "Eggs are not supposed to be green.");
		System.out.println("Please try to have some fun with this project.");
		
		//Custom button text
		Object[] options = {"Yes, please",
		                    "No, thanks",
		                    "No eggs, no ham!"};
		int n = JOptionPane.showOptionDialog(frame,
		    "Would you like some green eggs to go "
		    + "with that ham?",
		    "A Silly Question",
		    JOptionPane.YES_NO_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,
		    options[2]);
		System.out.println("n" + n);
		
		//default icon, custom title
		int n2 = JOptionPane.showConfirmDialog(
		    frame,
		    "Would you like green eggs and ham?",
		    "An Inane Question",
		    JOptionPane.YES_NO_OPTION);

	}

}

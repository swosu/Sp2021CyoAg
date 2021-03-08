package cs2;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class GameData {

	public void getPlayerName() {
		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}

			private void createAndShowGUI() {
				//Create and set up the window.
				JFrame frame = new JFrame("TextInputDemo");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				//Add contents to the window.
				frame.add(new TextInputDemo());

				//Display the window.
				frame.pack();
				frame.setVisible(true);

			}
		});


	}



}

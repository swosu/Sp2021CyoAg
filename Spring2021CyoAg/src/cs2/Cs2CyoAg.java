package cs2;

import java.awt.Component;

import javax.swing.JOptionPane;

//https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

public class Cs2CyoAg {

	public static void main(String[] args) {
		System.out.println("Hello, World.");
		
		Component frame = null;
		JOptionPane.showMessageDialog(frame, "Hello, World.\nClick OK to continue.","Cs2CyoAg",JOptionPane.PLAIN_MESSAGE);
		
		GamePlay info = new GamePlay();
		
		info.greetPlayer();
		info.fake();
		
		info.explainProcess();
		int n = 0;
		while(true) {
			
			n = info.keepPlaying();
			
			
			if(1 == n) {
				break;
			}
		}
		
		info.lastPopUp();
		
		//GameData card = new GameData();
		
		//card.getPlayerName();

	}

}

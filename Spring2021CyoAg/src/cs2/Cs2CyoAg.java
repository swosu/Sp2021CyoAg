package cs2;

import java.awt.Component;

import javax.swing.JOptionPane;

//https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

public class Cs2CyoAg {

	public static void main(String[] args) {
		
		GamePlay info = new GamePlay();
		
		PlayerGear player = new PlayerGear();
		
		info.greetPlayer();
		
		info.explainProcess();
		int n = 0;
		int selectRoom = 0;
		while(true) {
			
			selectRoom = info.selectRoom();
			if(0 == selectRoom) {
				info.blueRoom(player);
			}
			
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

package cs2;

//https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

public class Cs2CyoAg {

	public static void main(String[] args) {
		System.out.println("Hello, World.");
		
		GamePlay info = new GamePlay();
		
		info.greetPlayer();
		
		info.explainProcess();
		int n = 0;
		int selectRoom = 0;
		while(true) {
			
			selectRoom = info.selectRoom();
			if(0 == selectRoom) {
				info.blueRoom();
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

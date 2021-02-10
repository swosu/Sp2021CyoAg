package cs2;

public class Cs2CyoAg {

	public static void main(String[] args) {
		System.out.println("Hello, World.");
		
		GamePlay info = new GamePlay();
		
		info.greetPlayer();
		
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

package textBasedCs2;

public class FountainAdventure {

	private GameCharacter lead;
	private GameCharacter side;

	public FountainAdventure(GameCharacter mainPlayer, CompanionCharacter sideKick) {
		this.lead = mainPlayer;
		this.side = sideKick;
	}

	public void printMission() {
		System.out.printf("%s and %s are looking for a fountain.\n", lead.getName(), side.getName());
		System.out.println("They will be required to answer simple math questios to earn points.");
		System.out.println("They can gamble their points at a craps table.");
		System.out.println("Once they have enough points, they can go to the horse races.");
		System.out.println("If they win the correct bet, the fountain will be revieled to them.");
	}



}

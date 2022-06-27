package demo;

public class SnakeAndLadder {

	static final int PlayersWinningPosition = 100;
	public static void main(String[] args) {

		int playerPosition = 0;
		System.out.println("Players starting Position is " + playerPosition);
		System.out.println("Roll dice to get number ");
		while (playerPosition != PlayersWinningPosition) {
			int number = 1 + (int) (Math.random() * 6);
			int option = (int) Math.floor(Math.random() * 3);
			if (option == 0) {
				playerPosition = playerPosition;
			} else if (option == 1) {
				System.out.println("climb Ladder");
				if (playerPosition < PlayersWinningPosition) {
					playerPosition = playerPosition + number;
				} else {
					playerPosition = playerPosition - number;
				}
			} else {
				System.out.println("Bite the Snake");
				playerPosition = playerPosition - number;
				if (playerPosition < 0)
					playerPosition = 0;
			}
		}
		System.out.println("Player's current position is " + playerPosition);
}
}

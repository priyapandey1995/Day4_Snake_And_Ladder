package demo;

public class SnakeAndLadder {

	static final int playersWinningPosition = 100;

    public static void main(String[] args) {
        int playerPosition = 0;
        int n;
        System.out.println(+playerPosition+" " + "players starting Position");
        System.out.println("Rolls the dice to get number ");
        int i = 0;
        while (playerPosition != playersWinningPosition) {
        	int dice = 1 + (int) (Math.random() * 6);
        	 int checkOption = (int) Math.floor(Math.random() * 3);
            
            switch (checkOption) {
                case 1:
                    System.out.println("Play");
                    System.out.println("Dice " + dice);
                   
                    if (checkOption == 0) {
                        System.out.println("No Play");
                        playerPosition = playerPosition;
                        System.out.println("Player position is " + playerPosition);
                    }
                    else if (checkOption == 1) {
                        System.out.println("Ladder came");
                        if (playerPosition < playersWinningPosition)
                            playerPosition = playerPosition + dice;
                        else
                            playerPosition = playerPosition - dice;
                            System.out.println("Player position is " + playerPosition);
                    }
                    else {
                        System.out.println("Snake came");
                        playerPosition = playerPosition - dice;
                        if (playerPosition < 0)
                            playerPosition=0;
                            System.out.println("position  of player is " + playerPosition);
                    }
                    break;
                case 2:
                    System.out.println("exit");
                    
                case 3:
                    System.out.println("Invalid input");
                    break;
            }
            i++ ;
        }
        System.out.println(" Position of player is " + playerPosition);
        System.out.println("Calculate Total Moves = " + i);
    }
}

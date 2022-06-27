package demo;

public class SnakeAndLadder {

	public static void main(String[] args) {
		//players initial position
		int playerposition=0;
		 System.out.println("welcome to snake and ladder game");
		 System.out.println("starting position of player is"+ " "+playerposition);
		 
		 //rolling the die 
		int dice =(int)(Math.random()*6)+1;
		System.out.println("the random dice generated is"+ " " + dice);

		//player checks for the position
		int checkOption=(int)(Math.random()*3);
		if(checkOption == 0 ) {
			System.out.println("No Play");
			//player position would be the same
			playerposition = playerposition;
			System.out.println("the current position of the player is"+ " "+playerposition);
			}
		else if(checkOption == 1) {
			System.out.println("Ladder");
			//position of the ladder would be
			playerposition = playerposition + dice;
			System.out.println("players position is"  +" "+ playerposition  );
		}
		else if(checkOption == 2 ) {
		 System.out.println("Snake");
		 //players position would be
		 playerposition=playerposition - dice;
		 System.out.println("playerposition for snke would be"+ " " +playerposition);
		}
			
			
	}

}

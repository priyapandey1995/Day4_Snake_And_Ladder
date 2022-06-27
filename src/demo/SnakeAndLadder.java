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

	}

}

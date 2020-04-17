import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {  
		Dice dice1 = new Dice();
		
		Player player = new Player();
		
		int numberPlayers;
		
		
		StdOut.println("Number of players in the game: ");
	    Scanner p = new Scanner(System.in);
	    numberPlayers = p.nextInt();
	    int count = 1;
	    for (count=1; count<=numberPlayers; count++) {
	    	StdOut.println("Type name of player " +count);
			Scanner pl = new Scanner(System.in);
			player.setName(pl.nextLine());
	      
	    }
	       
	    
	    StdOut.println("Would you like to know the rules?  (yes/no) ");
	    Scanner rules = new Scanner(System.in);
        String in = rules.nextLine();
	    if (in.equals("yes")) {
	    	StdOut.println("Rules: "
	    			+ "\nEvery player rolls dice twice per turn."
	    			+ "\nIf both rolls have the same value, the player scores twice the sum of the two dice rolls."
	    			+ "\nIf both rolls have different values, the player scores the sum of the rolls."
	    			+ "\nFor each player, the result is cummulated after each turn."
	    			+ "\nFirst player to reach or exceed 100 wins");
			}
		else if (in.equals("no")) {
			System.out.println("Then let's begin!");
			}	
		else {
				StdOut.println("Please type 'yes' or 'no' and hit enter");
		}
     ////////////
	    while(player.cummulativeScore <111) {
	    	
			if (player.cummulativeScore>=100) {
				StdOut.println("Winner winner we have a winner!!!!");
				StdOut.println("Game over.");
				break;
			}
			else
			{
				StdOut.println(player.getName()+ " " + "Will you roll? (yes/no)");
				Scanner scan = new Scanner(System.in);
		        String input = scan.nextLine();	
		        int turn = 0;
				if (input.equals("yes")) {
					dice1.roll();
					StdOut.println("Player " + player.getName()+ " rolled "+ dice1.getLastRoll());
					StdOut.println(dice1.toString());
					if (dice1.die1.getLastRoll() == 1 && dice1.die2.getLastRoll() == 1) {
						//if the 2 dice together = 2 then snake eyes
						player.cummulativeScore = 0;
						StdOut.println("Oh no!!! Double skunk thrown, lose all cummulative points.");
						StdOut.println("Current score: "+player.cummulativeScore);
					}
					else if (dice1.die1.getLastRoll() == 1 || dice1.die2.getLastRoll() == 1) {
						turn= 0;
						StdOut.println("So sad. Skunk thrown, no points this turn. Count yourself lucky.");
						StdOut.println("Current score: "+player.cummulativeScore);
					}
					else if (dice1.die1.getLastRoll()== dice1.die2.getLastRoll() && dice1.die1.getLastRoll() != 1) {
						turn = dice1.getLastRoll()*2;
						player.setTotalScore(turn);
						StdOut.println("Lucky you! Doubles means twice the points- Congrats");
						StdOut.println("Current score: "+player.cummulativeScore);
					}
					else {
						turn = dice1.getLastRoll();
						player.setTotalScore(turn);
						StdOut.println("Nice work. Face value is added to your cummulative score.");
						StdOut.println("Current score: "+player.cummulativeScore);
				}}
				else if (input.equals("no")) {
					System.out.println("Round complete");
					
					}	
				else {
					
						StdOut.println("Please type 'yes' or 'no' and hit enter");
					}
			}
			
	    }
		//as well as a final end-of-turn summary when the turn is over.  
		//Roll outcome reporting should include the name of the player, 
		//the value of each thrown die within a roll of the dice, 
		//what kind of Skunk is thrown (if any), 
		//and the current turn score thus accumulated for the player.  
		//The final end-of-turn summary should include the player's name, 
		//the complete sequence of roll outcomes during the turn, 
		//their final turn score, and how many chips they lost in the turn.
		
		
		//begins with the UI asking the player by name if they wish to roll 
		//and ends after either the user declines to roll again, 
		//or else throws a Skunk. 
		//Information should also be displayed about the outcome of each 
		//roll and the final outcome of the turn.
		

	}
}
import java.util.Scanner;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice1 = new Dice();
		Player player = new Player();
		String name;
		int winningScore;
		
		StdOut.println("Rules: Every player rolls dice twice per turn.");
        StdOut.println("If both rolls have the same value, the player scores twice the sum of the two dice rolls.");
        StdOut.println("If both rolls have different values, the player scores the sum of the rolls.");
        StdOut.println("For each player, the result is cummulated after each turn.");
        StdOut.println("First player to reach or exceed the chosen maxScore wins");

		player.setName();
		StdOut.println("Hello " +player.getName().toString());
		
//		Scanner n = new Scanner(System.in);
//		name = n.nextLine();
//		player.setName(n);
		
        StdOut.println("Please enter the maximum score required to win: ");
        Scanner sc = new Scanner(System.in);
        winningScore = sc.nextInt();

     
		
		StdOut.println(player.getName()+"Will you roll? (yes/no)");
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();	      
    
		if (input.equals("yes")) {
			dice1.roll();
			StdOut.println("Player " + player.getName()+ " rolled "+ dice1.getLastRoll());
			StdOut.println(dice1.toString());
			}
		else if (input.equals("no")) {
			System.out.println("Round complete");
			}	
		else {
				StdOut.println("Please type 'yes' or 'no' and hit enter");
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

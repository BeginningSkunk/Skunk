import java.util.Scanner;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class Player {	
	String name;	
	String name2;
	int cummulativeScore;
	Scanner Input = new Scanner(System.in);
		

	
	public String getName() {
		return name;
		
	}	

	
	
	public void setName(String string) {
		StdOut.println("Enter player name: ");
		this.name = string;
	
		this.name2 = string;
		
      /*name = Input.nextLine();
       *this.name = Input.toString();
	    Input.close();*/
		
	}	
	
	int getTotalScore(){
        return cummulativeScore;
    }
	
	public void setTotalScore(int turn){
        cummulativeScore += turn;
    }
		
	} 
 
import java.util.Scanner;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


public class Player {	
	String name;	
	Scanner Input = new Scanner(System.in);
		
	
	public String getName() {
		return name;
	}	
	
	
	public void setName() {
		StdOut.println("Enter player name: ");
		Scanner Input = new Scanner(System.in);
        name = Input.nextLine();
		
		this.name = Input.toString();
	}	
		
	} 
 
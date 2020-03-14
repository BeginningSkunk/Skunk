  
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.introcs.StdOut;

public class TestDie
{
	@Test
	void test1() {
        testableDie die = new testableDie();
        die.getLastRoll();
        assertEquals(die.getLastRoll(), 6);
	}
	
	@Test
	void test2() {
		testableDie die = new testableDie();
		die.getLastRoll();
		assertNotEquals(die.getLastRoll(), "A");
		
	}
	@Test
	void test3() {
		testableDie die = new testableDie();
		die.getLastRoll();
		assertNotEquals(die.getLastRoll(), "!");
	}
	@Test
	void test4() {
		testableDie die = new testableDie();
		die.getLastRoll();
		assertNotEquals(die.getLastRoll(), "?");
	}
	@Test
	void test5() {
		testableDie die = new testableDie();
		die.getLastRoll();
		assertNotEquals(die.getLastRoll(), -1);
	}
	


}

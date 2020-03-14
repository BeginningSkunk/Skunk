import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.introcs.StdOut;

class TestDice {

	@Test
	void test1() {
        testableDie die = new testableDie();
        die.getLastRoll();
        assertEquals(die.getLastRoll(), 6);
    
	}
	@Test
	void test2() {
		fail("Not yet implemented");
	}
	@Test
	void test3() {
		fail("Not yet implemented");
	}
	@Test
	void test4() {
		fail("Not yet implemented");
	}
	@Test
	void test5() {
		fail("Not yet implemented");
	}
	
}

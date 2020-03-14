import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.princeton.cs.introcs.StdOut;

class TestDice {

	@Test
	void test1() {
        testableDice dice = new testableDice();
        dice.getLastRoll();
        assertEquals(dice.getLastRoll(), 12);
    }
	@Test
	void test2() {
		testableDice dice = new testableDice();
        testableDie die1 = new testableDie();
        testableDie die2 = new testableDie();
        int total = die1.getLastRoll() + die2.getLastRoll();
		dice.getLastRoll();
		
		assertEquals(dice.getLastRoll(), total);
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

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class TestDie
{

	void test1() {
        testableDie die = new testableDie();
        die.getLastRoll();
        assertEquals(die.getLastRoll(), 6);
	}
	
	@Test
	void test2() {
		testableDie die = new testableDie();
		die.getLastRoll();
		assertNotEquals(die.getLastRoll(), A);
		
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

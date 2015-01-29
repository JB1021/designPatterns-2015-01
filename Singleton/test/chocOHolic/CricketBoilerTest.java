package chocOHolic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CricketBoilerTest {

	CricketBoiler cricketBoiler = CricketBoiler.getInstance();	
	@Test
	public void test() {
		assertEquals(cricketBoiler, CricketBoiler.getInstance());
	}


}

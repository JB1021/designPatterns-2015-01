package chocOHolic;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandyBoilerTest {

	CandyBoiler candyBoiler = CandyBoiler.getInstance();	
	@Test
	public void test() {
		assertEquals(candyBoiler, CandyBoiler.getInstance());
	}


}

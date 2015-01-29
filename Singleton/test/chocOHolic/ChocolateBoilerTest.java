package chocOHolic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChocolateBoilerTest {

	ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();	
	@Test
	public void test() {
		assertEquals(chocolateBoiler, ChocolateBoiler.getInstance());
	}

}

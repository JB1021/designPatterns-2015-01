package beverage;

import static org.junit.Assert.*;

import org.junit.Test;

import comdiment.CondimentDecorator;
import comdiment.Mocha;
import comdiment.Whip;

public class HouseBlendTest {


	
	@Test
	public void test() {
		Beverage beverage = new HouseBlend();
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		
		assertTrue(true);
		
	}

}

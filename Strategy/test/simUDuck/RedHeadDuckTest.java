package simUDuck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RedHeadDuckTest {

	Duck redHeadDuck = new RedHeadDuck();

	@BeforeClass
	public static void oneTimeSetUp() {
		// one-time initialization code
		System.out.println("@BeforeClass - oneTimeSetUp");
	}

	@AfterClass
	public static void oneTimeTearDown() {
		// one-time cleanup code
		System.out.println("@AfterClass - oneTimeTearDown");
	}

	@Before
	public void setUp() {
		System.out.println("@Before - setUp");
	}

	@After
	public void tearDown() {
		System.out.println("@After - tearDown");
	}

	@Test
	public void testEmptyCollection() {
		assertTrue(redHeadDuck.swim());
		System.out.println("@Test - testEmptyCollection");
	}

	@Test
	public void testOneItemCollection() {

		redHeadDuck.performFly();
		redHeadDuck.performQuack();
		redHeadDuck.display();
		assertTrue(redHeadDuck.swim());
		System.out.println("@Test - testOneItemCollection");
	}

}

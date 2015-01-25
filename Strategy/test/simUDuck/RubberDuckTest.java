package simUDuck;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RubberDuckTest {

	Duck rubberDuck = new RubberDuck();

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
		assertTrue(rubberDuck.swim());
		System.out.println("@Test - testEmptyCollection");
	}

	@Test
	public void testOneItemCollection() {

		rubberDuck.performFly();
		rubberDuck.performQuack();
		rubberDuck.display();
		assertTrue(rubberDuck.swim());
		System.out.println("@Test - testOneItemCollection");
	}


}

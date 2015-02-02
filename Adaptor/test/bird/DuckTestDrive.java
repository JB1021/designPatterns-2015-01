package bird;

import static org.junit.Assert.*;

import org.junit.Test;

import birds.Duck;
import birds.Turkey;
import birds.TurkeyAdaptor;
import birds.WildTurkey;

public class DuckTestDrive {

	Turkey turkey = new WildTurkey();
	Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
	
	@Test
	public void test() {

		turkeyAdaptor.fly();
		turkeyAdaptor.quack();
		assertTrue(true);
	}

}

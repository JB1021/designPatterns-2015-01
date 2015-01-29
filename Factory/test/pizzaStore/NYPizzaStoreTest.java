package pizzaStore;

import static org.junit.Assert.*;

import org.junit.Test;

import pizza.Pizza;

public class NYPizzaStoreTest {

	
	@Test
	public void test() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza("veggie");
		pizza.prepare();
		
		pizzaStore = new NYPizzaStore();
		pizza = pizzaStore.orderPizza("veggie");
		pizza.prepare();



		assertTrue(true);
	}

}

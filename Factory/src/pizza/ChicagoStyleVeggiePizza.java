package pizza;

import ingredient.IngredientFactory;


public class ChicagoStyleVeggiePizza extends Pizza {

	public ChicagoStyleVeggiePizza(IngredientFactory ingredientFactory) {
		name = "Chicago Style Veggie Pizza";
		dough = ingredientFactory.createDough();
		toppings = ingredientFactory.createTopping();
	}
}


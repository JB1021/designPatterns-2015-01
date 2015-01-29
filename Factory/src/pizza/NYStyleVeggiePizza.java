package pizza;

import ingredient.IngredientFactory;


public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza(IngredientFactory ingredientFactory) {
		name = "NY Style Veggie Pizza";
		dough = ingredientFactory.createDough();
		toppings = ingredientFactory.createTopping();
	}
}

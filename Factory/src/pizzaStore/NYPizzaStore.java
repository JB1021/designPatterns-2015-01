package pizzaStore;

import ingredient.IngredientFactory;
import ingredient.NYpizzaIngredientFactory;
import pizza.NYStyleVeggiePizza;
import pizza.Pizza;

public class NYPizzaStore extends PizzaStore{

	Pizza pizza;
	IngredientFactory ingredientFactory = new NYpizzaIngredientFactory();

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("veggie")){
			pizza = new NYStyleVeggiePizza(ingredientFactory);
		}else {
			pizza = null;
		}
		return pizza;		
	}

}

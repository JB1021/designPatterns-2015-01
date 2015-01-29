package pizzaStore;

import ingredient.IngredientFactory;
import ingredient.NYpizzaIngredientFactory;
import pizza.ChicagoStyleVeggiePizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
	
	Pizza pizza;
	IngredientFactory ingredientFactory = new NYpizzaIngredientFactory();

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("veggie")){
			pizza = new ChicagoStyleVeggiePizza(ingredientFactory);
		}else {
			pizza = null;
		}
		return pizza;		
	}
	
}

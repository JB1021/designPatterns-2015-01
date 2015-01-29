package ingredient;

import java.util.ArrayList;

public class NYpizzaIngredientFactory implements IngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Topping createVeggie() {
		return new Garlic();
	}

	@Override
	public ArrayList createTopping() {
		
		ArrayList toppings = new ArrayList();
		toppings.add(createVeggie());
		return toppings;
	}

}

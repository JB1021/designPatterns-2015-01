package ingredient;

import java.util.ArrayList;

public interface IngredientFactory {
	
	public Dough createDough();
	public ArrayList createTopping();
	Topping createVeggie();
	
}

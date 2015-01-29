package pizza;

import ingredient.Dough;

import java.util.ArrayList;

public abstract class Pizza {

	String name;
	protected Dough dough;
	ArrayList toppings = new ArrayList();
	
	public void prepare(){
		System.out.println("Preparing" + name);
		System.out.println("Adding toppings");
		for(int i =0; i < toppings.size(); i++){
			System.out.println("   " + toppings.get(i));
		}
		
	}
	
	public void bake(){
		System.out.println("bake...");
	};
	
	public void cut(){
		System.out.println("cut...");
	};
	
	public void box(){
		System.out.println("place pizza in PizzaStore box");
	};

}

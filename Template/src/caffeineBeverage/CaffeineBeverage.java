package caffeineBeverage;

public abstract class CaffeineBeverage {

	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	abstract void addCondiments();
	
	public boolean customerWantsCondiments() {
		return false;
	}
	
	abstract void brew();
	
	public void pourInCup(){
		System.out.println("컵에 따르고 있습니다...");
	}
	public void boilWater(){
		System.out.println("물을 끓이고 있습니다...");
	}
}

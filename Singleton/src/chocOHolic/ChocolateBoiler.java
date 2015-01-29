package chocOHolic;

public class ChocolateBoiler {

	private static ChocolateBoiler boiler = null;	
	private ChocolateBoiler(){}
	
	public static synchronized ChocolateBoiler getInstance(){
		
		if(boiler == null) {
			boiler = new ChocolateBoiler();
		}
		
		return boiler;
	}
}

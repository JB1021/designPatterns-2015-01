package chocOHolic;

public class CricketBoiler {

	private static CricketBoiler boiler;
	private CricketBoiler(){};
	
	public static CricketBoiler getInstance(){
		if(boiler == null){
			boiler = new CricketBoiler();
		}
		return boiler;
	}
	
}

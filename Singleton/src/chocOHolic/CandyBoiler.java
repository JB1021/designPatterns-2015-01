package chocOHolic;

public class CandyBoiler {

	private CandyBoiler() {}
	private volatile static CandyBoiler boiler;
	
	public static CandyBoiler getInstance(){
		if( boiler == null){
			synchronized (CandyBoiler.class) {
				if(boiler == null){
					boiler = new CandyBoiler();					
				}
			}
		}
		return boiler;
	}
	
}

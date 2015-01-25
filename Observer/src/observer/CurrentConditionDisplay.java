package observer;

import subject.Subject;

public class CurrentConditionDisplay implements Observer, DisPlay{

	float pressure;
	float temperature;
	float humidity;
	Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		display();
	}
	
	public void display(){
		System.out.println("Current Condition: "+humidity+temperature+pressure);
	}

}

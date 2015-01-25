package subject;

import java.util.ArrayList;

import observer.Observer;

public class WeatherData implements Subject{

	float temperature;
	float humidity;
	float pressure;
	ArrayList<Observer> observers;
	
	public WeatherData(){
		observers= new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int idx = observers.indexOf(observer);
		observers.remove(idx);
		
	}

	@Override
	public void notifyObserver(ArrayList<Observer> observers) {

		for(Observer each:observers){
			each.update(temperature,humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObserver(observers);
	}

	public void setMesurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	    measurementsChanged();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}

package observer;

import static org.junit.Assert.*;

import org.junit.Test;

import subject.Subject;
import subject.WeatherData;

public class CurrentConditionDisplayTest {

	CurrentConditionDisplay currentConditionDisplay;
	WeatherData weatherData;
	@Test
	public void test() {
		
		weatherData = new WeatherData();
		currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMesurements(1,2,3);
		currentConditionDisplay.display();
		assertTrue(true);
	}

}

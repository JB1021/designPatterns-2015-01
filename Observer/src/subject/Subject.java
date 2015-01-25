package subject;

import java.util.ArrayList;

import observer.Observer;

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver(ArrayList<Observer> Observers);

}

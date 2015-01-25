package simUDuck;

import QuackBehavior.QuackBehavior;
import flyBehavior.FlyBehavior;

public class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public boolean swim(){
		return true;
	}
		
	public void display(){
		
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
		
	}

}

package simUDuck;

import QuackBehavior.Quack;

import flyBehavior.FlyWithWings;

public class RubberDuck extends Duck{
	
	public RubberDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("저는 고무오리입니다.");
	}
}

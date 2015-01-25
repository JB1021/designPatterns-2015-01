package simUDuck;

import flyBehavior.FlyNoWay;
import QuackBehavior.Squeak;

public class RedHeadDuck extends Duck{
	
	public RedHeadDuck(){
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("저는 붉은머리오리입니다.");
	}
}

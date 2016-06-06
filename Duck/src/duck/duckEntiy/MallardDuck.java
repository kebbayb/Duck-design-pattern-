package duck.duckEntiy;

import duck.duckImpel.FlyWithWings;
import duck.duckImpel.Quack;

public class MallardDuck extends Duck {
	public MallardDuck(){
    quackBehavior=new Quack();
	    flyBehavior=new FlyWithWings();
	}
	public void display(){
		System.out.println("ҰѼ");
	}
	public void swim(){
		System.out.println("ҰѼ����Ӿ");
}
}
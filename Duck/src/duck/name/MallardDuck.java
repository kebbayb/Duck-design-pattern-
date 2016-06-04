package duck.name;

import duck.fly.FlyWithWings;
import duck.quack.Quack;

public class MallardDuck extends Duck {
	public MallardDuck(){
    quackBehavior=new Quack();
	    flyBehavior=new FlyWithWings();
	}
	public void display(){
		System.out.println("“∞—º");
	}
	public void swim(){
		System.out.println("“∞—ºª·”Œ”æ");
}
}
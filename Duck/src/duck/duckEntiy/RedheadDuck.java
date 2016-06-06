package duck.duckEntiy;

import duck.duckImpel.FlyWithRocket;
import duck.duckImpel.MuteQuack;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
	   quackBehavior=new MuteQuack();
	    flyBehavior=new FlyWithRocket();
	}
	public void display(){
		System.out.println("红头鸭");
	}
	public void swim(){
		System.out.println("红头鸭会游泳");
	}	
}

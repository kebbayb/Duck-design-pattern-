package duck.name;

import duck.fly.FlyWithRocket;
import duck.quack.MuteQuack;

public class RedheadDuck extends Duck{
	public RedheadDuck(){
	   quackBehavior=new MuteQuack();
	    flyBehavior=new FlyWithRocket();
	}
	public void display(){
		System.out.println("��ͷѼ");
	}
	public void swim(){
		System.out.println("��ͷѼ����Ӿ");
	}	
}

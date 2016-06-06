package duck.duckEntiy;

import duck.duckImpel.FlyWithRocket;
import duck.duckImpel.MuteQuack;

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

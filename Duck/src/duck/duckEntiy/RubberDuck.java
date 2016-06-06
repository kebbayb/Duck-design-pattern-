package duck.duckEntiy;
import duck.duckImpel.FlyWithNoWings;
import duck.duckImpel.Squeak;

public class RubberDuck extends Duck{
	public RubberDuck(){
	    quackBehavior=new Squeak();
	    flyBehavior=new FlyWithNoWings();
	}
	public void display(){
	    System.out.println("��ƤѼ");
	}
	public void swim(){
	    System.out.println("��ƤѼ����Ӿ");
}
}
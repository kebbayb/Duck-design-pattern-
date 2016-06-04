package duck.test;
import duck.fly.FlyWithNoWings;
import duck.fly.FlyWithRocket;
import duck.fly.FlyWithWings;
import duck.name.Duck;
import duck.name.MallardDuck;
import duck.name.RedheadDuck;
import duck.name.RubberDuck;
import duck.quack.MuteQuack;
import duck.quack.Quack;
import duck.quack.Squeak;


public class test {
	
		 public static void main(String[] args) {
		 Duck mallard=new MallardDuck();
		 mallard.display();
		 mallard.swim();
		 mallard.setQuackBehavior(new Quack());
	     mallard.setFlyBehavior(new FlyWithWings());
		 mallard.performFly();
		 mallard.performQuack();
		
		 Duck rubber=new RubberDuck();
		 rubber.display();
		 rubber.swim();
		 rubber.setQuackBehavior(new Squeak());
		 rubber.setFlyBehavior(new FlyWithNoWings());
		 rubber.performFly();
		 rubber.performQuack();
		 
		 Duck redhead=new RedheadDuck();
		 redhead.display();
		 redhead.swim();
		 redhead.setQuackBehavior(new MuteQuack());
	     redhead.setFlyBehavior(new FlyWithRocket());
		 redhead.performFly();
		 redhead.performQuack();
		 }
		}
		 

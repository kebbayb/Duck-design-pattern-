package duck.duckEntiy;
import duck.duckImpel.FlyBehavior;
import duck.duckImpel.QuackBehavior;
public abstract class Duck {
	QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
	
	public void swim() {
		System.out.println("All ducks float");
	}
    public abstract void display();
    
	public void performQuack(){
    quackBehavior.quack();
    }
    public void performFly(){
    flyBehavior.fly();
    }
   public void setQuackBehavior(QuackBehavior quackBehavior){
       this.quackBehavior=quackBehavior;
   }
   public void setFlyBehavior(FlyBehavior flyBehavior){
       this.flyBehavior=flyBehavior;
   }
}

package Duck;
import FlyBehavior.*;
import QuackBehavior.*;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am a mallard duck");
    }
}

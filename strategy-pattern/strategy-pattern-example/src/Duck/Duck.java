package Duck;
import FlyBehavior.*;
import QuackBehavior.*;

public abstract class Duck implements QuackBehavior, FlyBehavior {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck(){}
    public abstract void display();
    public void swim(){
        System.out.println("every duck can float on the water. Even fake duck can");
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior){            //동적으로 행동을 지정할 수 있는 setter method
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}

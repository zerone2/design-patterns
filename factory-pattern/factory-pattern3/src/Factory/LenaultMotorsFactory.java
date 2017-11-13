package Factory;

import Car.*;

public class LenaultMotorsFactory extends CarFactory {
    public Car buildCar(CarType carType){
        System.out.println("Welcome to Lenault Samsung's Motor shop");
        return new LenaultCar(carType);
    }
}

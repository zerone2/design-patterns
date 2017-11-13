package Factory;
import Car.*;

public class HyundaiMotorsFactory extends CarFactory {
    public Car buildCar(CarType carType){
        System.out.println("Welcome to Hyundai's Motor shop");
        return new HyundaiCar(carType);
    }
}

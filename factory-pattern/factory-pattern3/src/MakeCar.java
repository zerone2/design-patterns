import Car.*;
import Factory.*;

public class MakeCar {
    public static void main(String[] args){
        CarFactory hcf = new HyundaiMotorsFactory();
        CarFactory lcf = new LenaultMotorsFactory();

        Car car = hcf.buildCar(CarType.COUPE);
        System.out.println(car.toString());

        car = hcf.buildCar(CarType.SUV);
        System.out.println(car.toString());

        car = lcf.buildCar(CarType.SEDAN);
        System.out.println(car.toString());

        car = lcf.buildCar(CarType.OTHER);
        System.out.println(car.toString());
    }
}

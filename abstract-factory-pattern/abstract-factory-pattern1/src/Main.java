import carExperts.CarExpert;
import cars.Car;
import cars.CarType;

public class Main {
    public static void main(String args[]) {
        CarExpert abstractCarExpert = CarExpert.getCarExpert(150000);
        Car appropriateCar = abstractCarExpert.findAppropriateCar(CarType.CABRIOLET);
        appropriateCar.printCarDescription();

        CarExpert secondAbstractCarExpert = CarExpert.getCarExpert(300000);
        Car secondAppropriateCar = secondAbstractCarExpert.findAppropriateCar(CarType.SEDAN);
        secondAppropriateCar.printCarDescription();

    }
}

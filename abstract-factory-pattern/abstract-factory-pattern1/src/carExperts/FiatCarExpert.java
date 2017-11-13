package carExperts;


import cars.Aegea;
import cars.Car;
import cars.CarType;
import cars.Fiat500C;

public class FiatCarExpert extends CarExpert {
    @Override
    public Car findAppropriateCar(CarType carType) {
        switch(carType) {
            case CABRIOLET:
                return new Fiat500C();
            case SEDAN:
                return new Aegea();
            default:
                break;
        }
        return null;
    }
}

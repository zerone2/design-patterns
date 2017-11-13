package carExperts;

import cars.Car;
import cars.CarType;
import cars.GranCabrio;
import cars.GranTurismo;

public class MaseratiCarExpert extends CarExpert {
    @Override
    public Car findAppropriateCar(CarType carType) {
        switch(carType) {
            case CABRIOLET:
                return new GranCabrio();
            case SEDAN:
                return new GranTurismo();
            default:
                break;
        }
        return null;
    }
}

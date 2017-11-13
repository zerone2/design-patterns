package carExperts;

import cars.Car;
import cars.CarType;

public abstract class CarExpert {

    public static CarExpert getCarExpert(int carPrice) {
        if (carPrice < 200000) {
            return new FiatCarExpert();
        } else {
            return new MaseratiCarExpert();
        }
    }

    public abstract Car findAppropriateCar(CarType carType);
}

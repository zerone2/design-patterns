package Factory;
import Car.*;

public abstract class CarFactory {
    public abstract Car buildCar(CarType carType);
}

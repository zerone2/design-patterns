package Car;

public class LenaultCar implements Car {
    private CarType carType;

    public LenaultCar(CarType carType){
        this.carType = carType;
    }

    public String toString(){
        if(carType == CarType.SEDAN) {
            return ("Lenault luxurious " + carType + " SM6\n").toLowerCase();
        } else if(carType == CarType.SUV){
            return ("Lenault strong " + carType + " QM6\n").toLowerCase();
        } else if(carType == CarType.COUPE){
            return ("Lenault small elegant " + carType + " N4\n").toLowerCase();
        } else {
            return ("Lenault's " + carType + " car\n").toLowerCase();
        }
    }

    public CarType getCarType(){
        return carType;
    }
}

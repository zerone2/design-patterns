package Car;

public class HyundaiCar implements Car {
    private CarType carType;

    public HyundaiCar(CarType carType){
        this.carType = carType;
    }

    public String toString(){
        if(carType == CarType.SUV){
            return ("Hyundai strong " + carType + " kona\n").toLowerCase();
        } else if(carType == CarType.SEDAN){
            return ("Hyundai beautiful " + carType + " genesis\n").toLowerCase();
        } else if(carType == CarType.COUPE){
            return ("Hyundai small elegant " + carType + " genesis coupe\n").toLowerCase();
        } else {
            return ("Hyundai's " + carType + " car\n");
        }
    }

    public CarType getCarType(){
        return carType;
    }
}

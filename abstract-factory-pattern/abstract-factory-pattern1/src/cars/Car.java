package cars;

public abstract class Car {
    private int wheelsNumber;
    private int doorsNumber;
    private int maxSpeed;

    public abstract void printCarDescription();
    public int getWheelsNumber() {
        return wheelsNumber;
    }
    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }
    public int getDoorsNumber() {
        return doorsNumber;
    }
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

package Devices;

public class Television implements ElectronicDevice {

	boolean isOn=false;
	int volumeLevel=3;
	
	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("TV turned on");
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("TV turned off");
	}

	@Override
	public void volumeUp() {
		volumeLevel=(volumeLevel==5?5:++volumeLevel);
		System.out.println("TV volume level adjusted to " + volumeLevel);
	}

	@Override
	public void volumeDown() {
		volumeLevel=(volumeLevel==0?0:--volumeLevel);
		System.out.println("TV volume level lowed to " + volumeLevel);
	}
}

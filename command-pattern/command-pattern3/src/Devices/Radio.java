package Devices;

public class Radio implements ElectronicDevice {

	boolean isOn=false;
	int volumeLevel=3;
	
	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("Radio turned on");
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("Radio turned off");
	}

	@Override
	public void volumeUp() {
		volumeLevel=(volumeLevel==5?5:++volumeLevel);
		System.out.println("Radio volume level adjusted to " + volumeLevel);
	}

	@Override
	public void volumeDown() {
		volumeLevel=(volumeLevel==0?0:--volumeLevel);
		System.out.println("Radio volume level lowed to " + volumeLevel);
	}
}

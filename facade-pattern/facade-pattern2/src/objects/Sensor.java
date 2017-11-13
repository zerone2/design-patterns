package objects;

/**
Simple objects with properties
Can have other method that the client will just don't care 
**/

public class Sensor {

	public Sensor(){
		System.out.println("sensor init");
	}
	
	public void activate(){
		System.out.println("sensor activated");
	}
	
	public void desactivate(){
		System.out.println("sensor disactivated");
	}

	public void warn() { System.out.println("warning!! danger detected"); }
	
}

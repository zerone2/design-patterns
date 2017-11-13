package objects;

/**
 Simple objects with properties
 Can have other method that the client will just don't care 
 **/
public class Lamp {
	
	public Lamp(){
		System.out.println("lamp init");
	};
	
	public void activate(){
		System.out.println("lamp activated");
	}
	
	public void desactivate(){
		System.out.println("lamp disactivated");
	}
	
	public void otherMethod(){
		System.out.println("other method of lamp");
	}
	
}

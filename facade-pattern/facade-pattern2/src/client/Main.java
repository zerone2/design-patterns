package client;

import facade.*;


/**
The facade Pattern allow the client to have a simplify view of a system.
For this example, we have 2 objects (lamp and sensor) and the facade pattern
will allow the client to activate or desactivate all at the same time.
**/
public class Main {
	public static void main(String[] args) {

		Facade facade = new Facade(); 	//Initiate the Facade	
		facade.activate();				//Activate will activate both lamp and sensor
		facade.deastivate();			//Desactivate will desactivate both lamp and sensor
	}
}

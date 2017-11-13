package Commands;

import Devices.ElectronicDevice;

public abstract class AbstractCommand {
	protected ElectronicDevice device;
	public AbstractCommand(ElectronicDevice device){
		this.device=device;
	}
	public abstract void execute();
}

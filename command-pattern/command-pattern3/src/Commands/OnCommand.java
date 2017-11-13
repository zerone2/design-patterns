package Commands;

import Devices.ElectronicDevice;

public class OnCommand extends AbstractCommand {

	public OnCommand(ElectronicDevice device) {
		super(device);
	}

	@Override
	public void execute() {
		this.device.turnOn();
	}
}

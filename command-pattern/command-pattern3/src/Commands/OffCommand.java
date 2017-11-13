package Commands;

import Devices.ElectronicDevice;

public class OffCommand extends AbstractCommand {

	public OffCommand(ElectronicDevice device) {
		super(device);
	}

	@Override
	public void execute() {
		this.device.turnOff();
	}
}

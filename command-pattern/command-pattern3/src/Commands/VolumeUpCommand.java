package Commands;

import Devices.ElectronicDevice;

public class VolumeUpCommand extends AbstractCommand {

	public VolumeUpCommand(ElectronicDevice device) {
		super(device);
	}

	@Override
	public void execute() {
		this.device.volumeUp();
	}
}

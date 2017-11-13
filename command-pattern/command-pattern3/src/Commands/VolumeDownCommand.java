package Commands;

import Devices.ElectronicDevice;

public class VolumeDownCommand extends AbstractCommand {

	public VolumeDownCommand(ElectronicDevice device) {
		super(device);
	}

	@Override
	public void execute() {
		this.device.volumeDown();
	}
}

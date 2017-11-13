import java.util.ArrayList;
import java.util.List;

import Commands.AbstractCommand;
import Commands.OffCommand;
import Commands.OnCommand;
import Commands.VolumeDownCommand;
import Commands.VolumeUpCommand;
import Devices.ElectronicDevice;
import Devices.Radio;
import Devices.Television;

public class Test {
	public static void main(String[] args){
		List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
		devices.add(new Television());
		devices.add(new Radio());
		List<AbstractCommand> commands = new ArrayList<AbstractCommand>();
		commands.add(new OnCommand(devices.get(0)));
		commands.add(new OnCommand(devices.get(1)));
		commands.add(new OffCommand(devices.get(0)));
		commands.add(new OffCommand(devices.get(1)));
		commands.add(new VolumeUpCommand(devices.get(0)));
		commands.add(new VolumeUpCommand(devices.get(1)));
		commands.add(new VolumeDownCommand(devices.get(0)));
		commands.add(new VolumeDownCommand(devices.get(1)));
		List<Button> buttons = new ArrayList<Button>();
		for(AbstractCommand command:commands)
			buttons.add(new Button(command));
		for(Button button:buttons)
			button.press();
	}
}

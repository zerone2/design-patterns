public class RemoteControlTest {
    public static void main(String[] args){
        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {lightOn,doorOpen,stereoOnWithCd,ceilingFanHigh};
        Command[] partyOff = {lightOff,doorClose,stereoOff,ceilingFanOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        System.out.println(remote);
        remote.setCommand(0,partyOnMacro,partyOffMacro);
        remote.onButtonWasPushed(0);

        System.out.println(remote);
        remote.undoButtonWasPushed();

        System.out.println("");
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
    }
}

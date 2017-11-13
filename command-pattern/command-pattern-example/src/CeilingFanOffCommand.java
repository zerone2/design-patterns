public class CeilingFanOffCommand extends CeilingFanCommand {
    public CeilingFanOffCommand(CeilingFan ceilingFan){
        super(ceilingFan);
    }
    public void execute(){
        ceilingFan.off();
    }
}

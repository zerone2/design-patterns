public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        super(ceilingFan);
    }
    public void execute(){
        ceilingFan.low();
    }
}

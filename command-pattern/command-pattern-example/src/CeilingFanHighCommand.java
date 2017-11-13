public class CeilingFanHighCommand extends CeilingFanCommand{

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        super(ceilingFan);
    }
    public void execute(){
        ceilingFan.high();
    }
}

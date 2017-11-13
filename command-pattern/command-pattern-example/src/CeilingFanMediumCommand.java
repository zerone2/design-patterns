public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan){
        super(ceilingFan);
    }
    public void execute(){
        ceilingFan.medium();
    }
}

public class noCommand implements Command {
    public void execute(){
        System.out.println("NoCommand!");
    }
    public void undo(){}
}

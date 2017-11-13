import Commands.AbstractCommand;

public class Button {
	AbstractCommand command;

	public Button(AbstractCommand command){
		this.command=command;
	}
	public void press(){
	command.execute();
}
}

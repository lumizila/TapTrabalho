package tap;
import java.util.ArrayList;
import java.util.List;

public class Invoker{
	public List<Command> commandList;

	public Invoker(){
		this.commandList = new ArrayList<>();
	}

	public void addCommand(Command command){
		this.commandList.add(command);
	}

	public void executeCommands(){
		for(Command command: this.commandList){
			command.execute();
		}
	}
}

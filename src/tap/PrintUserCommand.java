package tap;

public class PrintUserCommand implements Command{
	private User user;
	private SaveStateSingleton saver;
	private PrintUserCommand(){}
	
	public PrintUserCommand(User u, SaveStateSingleton s){
		this.user = u;
		this.saver = s;
	}

	public void execute(){
		this.user.printUser();
		//Saving user into singleton
		this.saver.users.add(this.user); 
	}
}

package tap;

public class PrintUserCommand implements Command{
	private User user;

	public PrintUserCommand(User u){
		this.user = u;
	}

	public void execute(){
		this.user.printUser();
	}
}

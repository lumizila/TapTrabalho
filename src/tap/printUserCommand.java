package tap;

public class printUserCommand implements Command{
	private User user;

	public printUserCommand(User u){
		this.user = u;
	}

	public void execute(){
		this.user.printUser();
	}
}

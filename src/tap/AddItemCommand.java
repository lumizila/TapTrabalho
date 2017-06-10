package tap;

public class AddItemCommand implements Command{
	private Item item;

	
	private AddItemCommand(){}
	
	public AddItemCommand(Item i){
		this.item = i;
	}

	public void execute(){
		this.item.addItem();
	}
}

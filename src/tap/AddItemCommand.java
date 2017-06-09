package tap;

public class AddItemCommand implements Command{
	private Item item;

	public AddItemCommand(Item i){
		this.item = i;
	}

	public void execute(){
		this.item.addItem();
	}
}

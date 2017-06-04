package tap;

public class addItemCommand implements Command{
	private Item item;

	public addItemCommand(Item i){
		this.item = i;
	}

	public void execute(){
		this.item.addItem();
	}
}

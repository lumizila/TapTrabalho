package tap;

public class RemoveItemFromCartCommand implements Command {
	private Item item;
	private ShoppingCart cart;
	private SaveStateSingleton saver;
	
	private RemoveItemFromCartCommand(){}
	
	public RemoveItemFromCartCommand(Item i, ShoppingCart c, SaveStateSingleton s){
		this.item = i;
		this.cart = c;
		this.saver = s;
	}

	public void execute(){
		this.cart.removeItem(this.item); 
		this.saver.itens.remove(this.item);
	}
}

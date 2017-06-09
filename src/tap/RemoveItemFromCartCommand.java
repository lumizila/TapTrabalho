package tap;

public class RemoveItemFromCartCommand implements Command {
	Item item;
	ShoppingCart cart;
	
	public RemoveItemFromCartCommand(Item i, ShoppingCart c){
		this.item = i;
		this.cart = c;
	}

	public void execute(){
		this.cart.removeItem(this.item); 
	}
}

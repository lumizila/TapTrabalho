package tap;

public class removeItemFromCartCommand implements Command {
	Item item;
	ShoppingCart cart;
	
	public removeItemFromCartCommand(Item i, ShoppingCart c){
		this.item = i;
		this.cart = c;
	}

	public void execute(){
		this.cart.removeItem(this.item); 
	}
}

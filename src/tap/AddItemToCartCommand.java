package tap;

public class AddItemToCartCommand implements Command {
	private Item item;
	private ShoppingCart cart;
	
	private AddItemToCartCommand(){};
	public AddItemToCartCommand(Item i, ShoppingCart c){
		this.item = i;
		this.cart = c;
	}

	public void execute(){
		this.cart.addItem(this.item); 
	}

}

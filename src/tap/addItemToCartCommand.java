package tap;

public class addItemToCartCommand implements Command {
	private Item item;
	private ShoppingCart cart;
	
	private addItemToCartCommand(){};
	public addItemToCartCommand(Item i, ShoppingCart c){
		this.item = i;
		this.cart = c;
	}

	public void execute(){
		this.cart.addItem(this.item); 
	}

}

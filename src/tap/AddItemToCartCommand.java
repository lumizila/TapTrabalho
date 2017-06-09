package tap;

public class AddItemToCartCommand implements Command {
	private Item item;
	private ShoppingCart cart;
	private SaveStateSingleton saver;
	
	private AddItemToCartCommand(){};
	public AddItemToCartCommand(Item i, ShoppingCart c, SaveStateSingleton s){
		this.item = i;
		this.cart = c;
		this.saver = s;
	}

	public void execute(){
		this.cart.addItem(this.item); 
		this.saver.itens.add(this.item);
	}

}

package tap;

public class AddCartToPersonCommand implements Command{
	private User user;
	private ShoppingCart cart;
	private SaveStateSingleton saver;
	
	public AddCartToPersonCommand(ShoppingCart c, User u, SaveStateSingleton s){
		this.user = u;
		this.cart = c;
		this.saver = s;
	}

	public void execute(){
		this.user.addShoppingCart(this.cart);
		this.cart.addOwner(this.user);
		this.saver.carts.add(this.cart);
	}
}

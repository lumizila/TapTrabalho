package tap;

public class AddCartToPersonCommand implements Command{
	private User user;
	private ShoppingCart cart;
	
	public AddCartToPersonCommand(ShoppingCart c, User u){
		this.user = u;
		this.cart = c;
	}

	public void execute(){
		this.user.addShoppingCart(this.cart);
		this.cart.addOwner(this.user); 
	}
}

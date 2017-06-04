package tap;

public class addCartToPersonCommand implements Command{
	private User user;
	private ShoppingCart cart;
	
	public addCartToPersonCommand(ShoppingCart c, User u){
		this.user = u;
		this.cart = c;
	}

	public void execute(){
		this.user.addShoppingCart(this.cart);
		this.cart.addOwner(this.user); 
	}
}

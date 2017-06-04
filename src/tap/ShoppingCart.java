package tap;

public class ShoppingCart {
	private User user;
	public void addOwner(User u){
		this.user = u;
		System.out.println("Adding user: "+this.user.getName()+" to cart");
	}
}

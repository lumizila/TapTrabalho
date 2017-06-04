package tap;

public class User {
	
	private String name, email, shoppingCart;
	private int id;
	private ShoppingCart cart;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	
	private User() {
	}

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.id = GlobalId.user_id;
		GlobalId.updateUser_id();
	}
	public void printUser(){
		System.out.println("Usuario: " +this.name+", email: "+this.email+"\n");
	}
	public void addShoppingCart(ShoppingCart c){
		this.cart = c;
		System.out.println("Adicionando carrinho ao usuario "+this.name+"\n");
	}
}


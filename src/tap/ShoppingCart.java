package tap;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private User user;
	public List<Item> itens;
	
	public ShoppingCart(){
		this.itens = new ArrayList<Item>();
		
	}
	public void addOwner(User u){
		this.user = u;
		System.out.println("Adding user: "+this.user.getName()+" to cart");
	}
	public void addItem(Item i){
		itens.add(i);
		System.out.println("Adding item: "+i.getBrand()+" to cart.");
	}
	public void removeItem(Item i){
		itens.remove(i);
		System.out.println("Removing item: "+i.getBrand());
		System.out.println("The cart now contains the following itens: ");
		for(int counter = 0; counter < itens.size(); counter ++){
			System.out.println(itens.get(counter).getBrand());
		}
	}
}

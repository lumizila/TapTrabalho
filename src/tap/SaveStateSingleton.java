package tap;

import java.util.ArrayList;

/*This class will save the state of the application, by calling the command pattern in the main*/

public class SaveStateSingleton {
	private static SaveStateSingleton instance = new SaveStateSingleton(); 
	
	public ArrayList<Item> itens = new ArrayList<Item>(); 
	public ArrayList<User> users = new ArrayList<User>(); 
	public ArrayList<ShoppingCart> carts = new ArrayList<ShoppingCart>(); 
	
	protected SaveStateSingleton() {
	   // Exists only to defeat instantiation.
	}
	public static SaveStateSingleton getInstance() {
	   return instance;
	}
}

package tap;

import java.util.ArrayList;

/*This class will save the state of the application, by calling the command pattern in the main*/

public class SaveStateSingleton {
	private static SaveStateSingleton instance = null;
	
	public static ArrayList<Item> itens = null; 
	public static ArrayList<User> users = null;
	public static ArrayList<ShoppingCart> carts = null;
	
	protected SaveStateSingleton() {
	   // Exists only to defeat instantiation.
	}
	public static SaveStateSingleton getInstance() {
	   if(instance == null) {
	      instance = new SaveStateSingleton(); 
	   }
	   return instance;
	}
}

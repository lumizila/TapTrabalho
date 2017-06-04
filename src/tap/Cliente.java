package tap;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Cliente {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		GlobalId.initItem_id();
		GlobalId.initUser_id();
		
		// A classe cliente precisa realizar: 

		//criação de usuário u1, 
		User u1 = new User("Matheus", "email@bla.com");
		

		//criação de carrinho de compras c1 e produtos p1, p2, p3
		ShoppingCart c1 = new ShoppingCart();
		
		
		try {
			Item p1 = new Item(35.00, (Date)formatter.parse("03/03/2017"), "nike", "tenis azul de corrida");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Item p2 = new Item(321.00, (Date)formatter.parse("03/03/2017"), "nikee", "tenis azul de corrida");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Item p3 = new Item(434.00, (Date)formatter.parse("03/03/2017"), "nikeeee", "tenis azul de corrida");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*inclusão de produto p1, p2, p3; exclusao de p2 e alteracao de p1. */
		Command printUser = new printUserCommand(u1);
		/*Command addCart = new addCartToPersonCommand(c1);
		Command addItemP1 = new addItemToCartCommand(p1, c1);	
		Command addItemP2 = new addItemToCartCommand(p2, c1);	
		Command addItemP3 = new addItemToCartCommand(p3, c1);
		Command removeItemP2 = new removeItemFromCartCommand(p2, c1);
		Command alterItemP1 = new alterItemCommand(p1);
*/
		//adding itens to the invoker class. 
		invoker.addCommand(printUser);
/*		invoker.addCommand(addCart);
		invoker.addCommand(addItemP1);
		invoker.addCommand(addItemP2);
		invoker.addCommand(addItemP3);
		invoker.addCommand(removeItemP2);
		invoker.addCommand(alterItemP1);
*/
		//this will call all the commands at the end
		invoker.executeCommands();
	}
}

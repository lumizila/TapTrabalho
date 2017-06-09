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
		Item p1 = null;
		Item p2 = null;
		Item p3 = null;
		
		// A classe cliente precisa realizar: 

		//criação de usuário u1, 
		User u1 = new User("Matheus", "email@bla.com");
		

		//criação de carrinho de compras c1 e produtos p1, p2, p3
		ShoppingCart c1 = new ShoppingCart();

		//criação da instancia do singleton que salvará o estado da aplicação		
		SaveStateSingleton saver = new SaveStateSingleton();		

		try {
			p1 = new Item(35.00, (Date)formatter.parse("03/03/2017"), "nike", "tenis azul de corrida");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			p2 = new Item(321.00, (Date)formatter.parse("03/03/2017"), "nikee", "tenis azul de corrida");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			p3 = new Item(434.00, (Date)formatter.parse("03/03/2017"), "nikeeee", "tenis azul de corrida");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*inclusão de produto p1, p2, p3; exclusao de p2 e alteracao de p1. */
		Command printUser = new PrintUserCommand(u1);
		Command addCart = new AddCartToPersonCommand(c1, u1);
		Command addItemP1 = new AddItemToCartCommand(p1, c1);	
		Command addItemP2 = new AddItemToCartCommand(p2, c1);	
		Command addItemP3 = new AddItemToCartCommand(p3, c1);
		Command removeItemP2 = new RemoveItemFromCartCommand(p2, c1);
		
		/* Comandos para salvar o estado da aplicação no Singleton */
		Command saveUser = new SaveUserToSingleton(u1);
		Command saveCart = new SaveCartToSIngleton(c1);
		Command saveItemP1 = new SaveItemToSingleton(p1);
		Command saveItemP2 = new SaveItemToSingleton(p2);
		Command saveItemP3 = new SaveItemToSingleton(p3);
		Command deleteItemP2 = new DeleteItemFromSingleton(p2);	
	
		Date newDate = null;
		try {
			newDate = (Date)formatter.parse("05/04/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Command alterItemP1 = new AlterItemCommand(p1, 45.00, newDate, "casaco", "casaco preto do cei");

		//adding itens to the invoker class. 
		invoker.addCommand(printUser);
		invoker.addCommand(saveUser);
		invoker.addCommand(addCart);
		invoker.addCommand(saveCart);
		invoker.addCommand(addItemP1);
		invoker.addCommand(addItemP2);
		invoker.addCommand(addItemP3);
		invoker.addCommand(removeItemP2);
		invoker.addCommand(alterItemP1);

		//this will call all the commands at the end
		invoker.executeCommands();
	}
}

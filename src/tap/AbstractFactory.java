package tap;

import java.util.Date;

public interface AbstractFactory {

	public Command createAddCartToPersonCommand(ShoppingCart c, User u, SaveStateSingleton s) ;
	public Command createAddItemCommand(Item i);
	public Command createAddItemToCartCommand(Item i, ShoppingCart c, SaveStateSingleton s);
	public Command createAlterItemCommand(Item i, Double p, Date d, String b, String e);
	public Command createPrintUserCommand(User u, SaveStateSingleton s);
	public Command createRemoveItemFromCartCommand(Item i, ShoppingCart c, SaveStateSingleton s);
	
}

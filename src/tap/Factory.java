package tap;

import java.util.Date;

public class Factory implements AbstractFactory{

	@Override
	public Command createAddCartToPersonCommand(ShoppingCart c, User u,SaveStateSingleton s) {
		// TODO Auto-generated method stub
		return new AddCartToPersonCommand(c, u, s);
	}

	@Override
	public Command createAddItemCommand(Item i) {
		// TODO Auto-generated method stub
		return new AddItemCommand(i);
	}

	@Override
	public Command createAddItemToCartCommand(Item i, ShoppingCart c, SaveStateSingleton s) {
		// TODO Auto-generated method stub
		return new AddItemToCartCommand(i, c, s);
	}

	@Override
	public Command createAlterItemCommand(Item i, Double p, Date d, String b, String e) {
		// TODO Auto-generated method stub
		return new AlterItemCommand(i, p, d, b, e);
	}

	@Override
	public Command createPrintUserCommand(User u,SaveStateSingleton s) {
		// TODO Auto-generated method stub
		return new PrintUserCommand(u, s);
	}

	@Override
	public Command createRemoveItemFromCartCommand(Item i, ShoppingCart c, SaveStateSingleton s) {
		// TODO Auto-generated method stub
		return new RemoveItemFromCartCommand(i, c, s);
	}
}

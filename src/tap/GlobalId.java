package tap;

public class GlobalId {
	public static int user_id, item_id;

	public static void updateItem_id() {
		item_id++;
	}	

	public static void  initItem_id() {
		item_id = 1;
	}	

	public static void initUser_id(){
		user_id = 1;
	}
	public static void updateUser_id(){
		user_id++;
	}
}
package tap;

public class User {
	
	private String name,email;
	private int id;
	
	
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
		System.out.println("Adicionando pessoa: "+name+", cujo email eh:"+email+"\n");
		this.name = name;
		this.email = email;
		this.id = GlobalId.user_id;
		GlobalId.updateUser_id();
	}
	public void DeleteUser(){
		System.out.println("deletando usuario\n");
	}
	public void printUser(){
		System.out.println("Usuario: " +this.name+", email: "+this.email+"\n");
	}
}


package tap;

import java.util.Date;

public class Item {
	private Double price;
	private Date arrival_date;
	private String brand,especs;
	private int id;
	
	public void addItem(){
		System.out.println("adicionando item");
	}
    
	public void printItem(){
		System.out.println("the item is: "+this.brand);
		System.out.println("the item price is: "+this.price.toString());
		System.out.println("the item  date is: "+this.arrival_date.toString());
		System.out.println("the item especs is: "+this.especs.toString());
	}
	public void alterItem(Double p, Date d, String b, String e){
		this.price = p;
		this.arrival_date = d;
		this.brand = b;
		this.especs = e;
		System.out.println("An item was updated to: ");
		this.printItem();
	}
	
	public Item(Double price, Date arrival_date, String brand, String especs) {
		super();
		this.price = price;
		this.arrival_date = arrival_date;
		this.brand = brand;
		this.especs = especs;
		this.id = GlobalId.item_id;
		GlobalId.updateItem_id();
	}
	
	
	private Item() {
	}


	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getArrival_date() {
		return arrival_date;
	}
	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getEspecs() {
		return especs;
	}
	public void setEspecs(String especs) {
		this.especs = especs;
	}
	public int getId() {
		return id;
	}

}

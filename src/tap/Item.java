package tap;

import java.sql.Date;

public class Item {
	private Double price;
	private Date arrival_date;
	private String brand,especs;
	private int id;
	
	
	public Item(Double price, Date arrival_date, String brand, String especs,
			Integer id) {
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

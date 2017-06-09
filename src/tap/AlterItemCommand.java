package tap;

import java.util.Date;

public class AlterItemCommand implements Command {
	private Item item;
	private Double price;
	private Date arrival_date;
	private String brand,especs;
	private int id;
	
	public AlterItemCommand(Item i, Double p, Date d, String b, String e){
		this.item = i;
		this.price = p;
		this.arrival_date = d;
		this.brand = b;
		this.especs = e;
	}

	public void execute(){
		this.item.alterItem(this.price, this.arrival_date, this.brand, this.especs); 
		//the item is automatically saved in the singleton because singleton has a pointer to it
	}

}

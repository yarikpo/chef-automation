package domain;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProductType {
	private String name = "";
	private int price;					// price in cents
	private int count = 0;
	private Calendar spoilDate = new GregorianCalendar();
	
	public ProductType(){}
	
	public ProductType(String name, int price, int count, Calendar spoilDate) {
		this.name = name;
		this.price = price;
		this.count = count;
		this.spoilDate = spoilDate;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public Calendar getSpoilDate() {
		return this.spoilDate;
	}
	
	@Override
	public String toString() {
		return "pt:\nname: " + this.name + "\nprice: " + this.price + "\ncount: " + this.count + "\nspoilDate: " + this.spoilDate.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this.name == ((ProductType)o).getName()
				&& this.price == ((ProductType)o).getPrice()
				&& (this.spoilDate == null || ((ProductType)o).getSpoilDate() == null
				|| this.spoilDate.getTimeInMillis() == ((ProductType)o).getSpoilDate().getTimeInMillis())) 
		{
			return true;
		}
		return false;
	}
}

package com.company.example;

public class Item {
	String item_name;
	double price;
	String description;
	
	
	Item(String item_name, double price, String description){
		this.item_name = item_name;
		this.price = price;
		this.description = description;
	}
	
	
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Item [item_name=" + item_name + ", price=" + price + ", description=" + description + "]";
	}
	
	
	
}

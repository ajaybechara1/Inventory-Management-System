package com.ims.product.model;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		String str = "";
		str += "Id = " + Id;
		str += "\nPrice = " + Price;
		str += "\nQuantity = " + (int)Quantity;
		str += "\n";
		return str;
	}
	String Id;
	double Price;
	double Quantity;
	
	public Product(String id, double price, double quantity) {
		super();
		Id = id;
		Price = price;
		Quantity = quantity;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getQuantity() {
		return Quantity;
	}
	public void setQuantity(double quantity) {
		Quantity = quantity;
	}
	
	
	
}

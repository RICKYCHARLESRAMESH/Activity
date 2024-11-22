package com.model;

import javax.persistence.*;
@Entity
public class Item {
	@Id
	private int itemId;
	private String itemName;
	private double price;
	private int qunatity;
	private boolean availableInStock;
	
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	public boolean isAvailableInStock() {
		return availableInStock;
	}
	public void setAvailableInStock(boolean availableInStock) {
		this.availableInStock = availableInStock;
	}

}
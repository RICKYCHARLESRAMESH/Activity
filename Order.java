package com.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.*;
@Entity
@Table(name="Order123")
public class Order {
	public SalePerson getPerson() {
		return person;
	}
	public void setPerson(SalePerson person) {
		this.person = person;
	}
	@Id
	private int orderId;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<Item> itemList=new ArrayList<>();
	private Date dateofDelivery;
	private double total;
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name="salePersonId")
	private SalePerson person;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	public Date getDateofDelivery() {
		return dateofDelivery;
	}
	public void setDateofDelivery(Date dateofDelivery) {
		this.dateofDelivery = dateofDelivery;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
 
}
 
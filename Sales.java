package com.model;

import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Sales {
	@Id
	private int saleId;
	
	@OneToMany(mappedBy="sales",cascade=CascadeType.ALL)
	private List<SalePerson> salePersonList=new ArrayList<>();
	public TurnOver getT() {
		return t;
	}
	public void setT(TurnOver t) {
		this.t = t;
	}
	private int totalSales;
	
	@ManyToOne
	@JoinColumn(name="TurnOverId")
	private TurnOver t;
	
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public List<SalePerson> getSalePersonList() {
		return salePersonList;
	}
	public void setSalePersonList(List<SalePerson> salePersonList) {
		this.salePersonList = salePersonList;
	}
	public int getTotalSales() {
		return totalSales;
	}
	public void setTotalSales(int totalSales) {
		this.totalSales = totalSales;
	}	
}
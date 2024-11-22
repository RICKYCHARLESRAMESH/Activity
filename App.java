package activity.sampleactivity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
 

import com.model.Item;
import com.model.Order;
import com.model.SalePerson;
import com.model.Sales;
import com.model.TurnOver;
import com.service.ItemService;

public class App {
    public static void main(String[] args) {
 
		
    	Item q=new Item();
    	q.setItemId(1);
    	q.setItemName("Mango");
    	q.setPrice(100);
    	q.setAvailableInStock(true);
    	
    	List<Item> l1=new ArrayList<>();
    	l1.add(q);
    	Order o=new Order();
    	o.setOrderId(1);
    	o.setItemList(l1);
    	o.setDateofDelivery(Date.valueOf(LocalDate.now()));
    	o.setTotal(100);
    	o.setStatus(true);
    	
    	List<Order> l2=new ArrayList<>();
    	l2.add(o);
    	SalePerson s=new SalePerson();
    	s.setPersonId(1);
    	s.setPersonName("Ricky");
    	s.setOrderList(l2);
    	
    	List<SalePerson> l3=new ArrayList<>();
    	l3.add(s);
    	Sales s2=new Sales();
    	s2.setSaleId(1);
    	s2.setSalePersonList(l3);
    	s2.setTotalSales(100);
    	
    	List<Sales> l4=new ArrayList<>();
    	l4.add(s2);
    	TurnOver m=new TurnOver();
    	m.setYear(2024);
    	m.setL(l4);
    	
    	ItemService n=new ItemService();
    	n.saveItem(m);
    	
    	
    }
}
package com.example.charter.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.example.charter.Model.Customer;
import com.example.charter.Model.Item;
import com.example.charter.Model.Transaction;


@Service
public class CustomerService {
	
	
	
	
	
	public Customer findCustomerId(Integer id) {
		 List<Item> itemsList=new ArrayList<>();
		
		List<Transaction> transaction=new ArrayList<>();
		
		 List<Customer> customers=new ArrayList<>();
		itemsList.add(new Item(ThreadLocalRandom.current().nextInt(1, 10 + 1),"item"+id+1,ThreadLocalRandom.current().nextInt(1, 200 + 1)));
		itemsList.add(new Item(ThreadLocalRandom.current().nextInt(1, 10 + 1),"item"+id+2,ThreadLocalRandom.current().nextInt(1, 200 + 1)));
		itemsList.add(new Item(ThreadLocalRandom.current().nextInt(1, 10 + 1),"item"+id+3,ThreadLocalRandom.current().nextInt(1, 200 + 1)));
		itemsList.add(new Item(ThreadLocalRandom.current().nextInt(1, 10 + 1),"item"+id+4,ThreadLocalRandom.current().nextInt(1, 200 + 1)));
		itemsList.add(new Item(ThreadLocalRandom.current().nextInt(1, 10 + 1),"item"+id+5,ThreadLocalRandom.current().nextInt(1, 200 + 1)));
		transaction.add(new Transaction(ThreadLocalRandom.current().nextInt(100, 1000 + 1),LocalDate.of(2020, 8, 24),itemsList));
		customers.add(calculateCustomerPoints(new Customer(id,transaction,0)));
		for(Customer customer:customers) {
			if(customer.getId()==id) {
				return customer;
			}
		}
		return null;
	}

	public Customer calculateCustomerPoints(Customer customer ) {
		List<Transaction> transactions = customer.getTransactions();
		int prevPoint = customer.getPoint();
		int newPoint =0;
		double spent = transactions.stream()
									.map(Transaction::getItems)
									.flatMap(items -> items.stream())
									.mapToDouble(Item::getPrice)
									.sum();

		if(spent > 100) {
			newPoint = (int) (spent-100)*2 +50 + prevPoint;
		}
		if(spent>50 && spent< 100) {
			newPoint = prevPoint+50;
		}
		customer.setPoint(newPoint);
		return customer;

	}
	
	public Customer calculateCustomerPoint(Customer customer,List<Transaction> transactions  ) {
		
		
		return customer;

	}
}

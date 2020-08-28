package com.example.charter.Model;

import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class Customer {
	private Integer id;
	private List<Transaction> transactions;
	private Integer point;
	
	public Customer() {

	}

	public Customer(Integer id, List<Transaction> transactions, Integer point) {
	
		this.id = id;
		this.transactions = transactions;
		this.point = point;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	
}


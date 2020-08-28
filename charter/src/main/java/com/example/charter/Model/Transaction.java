package com.example.charter.Model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class Transaction {
	private Integer id;
	private LocalDate date;
	private List<Item> items;
	public Transaction() {
	
	}
	
	public Transaction(Integer id, LocalDate date, List<Item> items) {
		
		this.id = id;
		this.date = date;
		this.items = items;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
}

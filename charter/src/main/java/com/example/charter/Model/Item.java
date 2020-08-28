package com.example.charter.Model;

import org.springframework.stereotype.Component;

@Component
public class Item {

    private Integer id;
    private String name;
    private double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Item(Integer id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Item() {
	
	}
    
}

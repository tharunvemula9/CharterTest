package com.example.charter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.charter.Model.Customer;
import com.example.charter.Service.CustomerService;

@RestController
public class AppController {
	
	@Autowired
	private CustomerService customerService;
	@CrossOrigin(origins = "http://localhost:3000")
	 @GetMapping("/customers/totalPoints/{id}")
	    public ResponseEntity<Customer> getCustomerPoints(@PathVariable Integer id) {
	    	customerService.calculateCustomerPoints(customerService.findCustomerId(id));
	    	return ResponseEntity.ok(customerService.findCustomerId(id));
	    }
	    
	    


}

package data.model;

import sale.domain.Customer;


public class Data_Customer {
	
	public static Customer[] getCustomer() {
		Customer [] all = {new Customer("yaj", "0011", "vip","oily skin"), 
					new Customer("jjw", "0022", "vip","combination skin"),
					new Customer("ljm", "0033","vip","dry skin"), 
					new Customer("cjs", "0044","vip","sensitive skin")}; 
		
		return all;
	}
}




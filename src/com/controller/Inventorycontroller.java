package com.controller;

import java.util.List;
import java.util.Scanner;

import com.model.Inventory;
import com.service.InventoryService;
import com.service.InventoryServiceImpl;

public class Inventorycontroller {
    
	
	InventoryService ins =new InventoryServiceImpl();
	Inventory inv =new Inventory();
	Scanner sc = new Scanner(System.in);
	
	
	public void displaystock() {
		System.out.println("Display the Data of all Products:-");
		
		List<Inventory> list = ins.displaystock();
		
		for(Inventory inv : list )
		{
			System.out.println("id:- "+ inv.getId());
			System.out.println("name:- "+ inv.getProduct_name());
			System.out.println("quantity:- "+ inv.getQuantity());
			System.out.println("price:- "+inv.getPrice());
			System.out.println("-----------------");
			System.out.println("              ");
		}
		
	}

	
	public void addproduct() {
		System.out.println("Enter Product to Add:- ");
		String product_name = sc.next();
		
		System.out.println("Enter the Quantity:- ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter the Price :- ");
         int price = sc.nextInt();
		
		inv.setProduct_name(product_name);
	    inv.setQuantity(quantity);
	    inv.setPrice(price);
	    
	    String message = ins.addproduct(inv);
	    System.out.println(message);
		
	}

	public void removeproduct() {
	 System.out.println("Enter the product id to remove:-");
      int id = sc.nextInt();
      
      inv.setId(id);
      
      String rm = ins.removeproduct(inv);
      System.out.println(rm);
		
	}

	public void updatestock() {

        System.out.println("Enter the price to be updated:-");
        int pirce = sc.nextInt();
    
        inv.setPrice(pirce);
  
        System.out.println("enter the id where to update:-");
        int id = sc.nextInt();
        
        inv.setId(id);
        
        String msg = ins.updateproduct(inv);
        System.out.println(msg);
		
	}

}

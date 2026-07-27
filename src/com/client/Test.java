package com.client;

import java.util.Scanner;

import com.controller.Inventorycontroller;

public class Test {

	public static void main(String[] args) {
		
		Inventorycontroller ic = new Inventorycontroller();
		Scanner sc =new Scanner(System.in);
		System.out.println("* Inventory Management System *");
		System.out.println("- - - - - - - o - - - - - - - ");
		while(true)
		{
			System.out.println("Press 1:- To Get Stock");
			System.out.println("Press 2:- To Add Product");
			System.out.println("Press 3:- To Remove Product");
			System.out.println("Press 4:- To Update Stock(Quantity,Price)");
			System.out.println("====================================");
			System.out.println("Enter operation to perform:-");
			
			int choice = sc.nextInt();	
		
	
		switch(choice)
		{
		case 1:
			ic.displaystock();
			break;
			
		case 2:
			ic.addproduct();
			break;
		
		case 3:
			ic.removeproduct();
			break;
			
		case 4:
		       ic.updatestock();
		    break;
		
		case 5:
			System.exit(0);
		     break;
		     
		     default: 
		    	 System.out.println("--Invalid Option--");
		}
		}
	}
}

package com.service;

import java.util.List;

import com.model.Inventory;
import com.repositary.InventoryDao;

public class InventoryServiceImpl implements InventoryService {

	InventoryDao ind = new InventoryDao();

	@Override
	public List<Inventory> displaystock() {
		
		List<Inventory> list = ind.displaystock();
		return list;
		
	}
	
	
	@Override
	public String addproduct(Inventory inv) 
	{
		String message = ind.addproduct(inv);
		return message;	
	}

	
	@Override
	public String removeproduct(Inventory inv) {
		String removemessage = ind.removeproduct(inv);
		return removemessage;
	}
	

	@Override
	public String updateproduct(Inventory inv) {
		String msg = ind.updateproduct(inv);
		return msg;
	}




}

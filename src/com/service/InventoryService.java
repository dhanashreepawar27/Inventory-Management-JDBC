package com.service;

import java.util.List;

import com.model.Inventory;

public interface InventoryService {

	public List<Inventory> displaystock();
	
	public String addproduct(Inventory inv);

	public String removeproduct(Inventory inv);
	
	public String updateproduct(Inventory inv);
	
}

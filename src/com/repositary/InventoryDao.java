package com.repositary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connectionn.Jdbcconnection;
import com.model.Inventory;

public class InventoryDao 
{
   Connection con = Jdbcconnection.getConnection();
   

	public List<Inventory> displaystock() {
		
		List<Inventory> list = new ArrayList<Inventory>();
		
		String query="select * from inventory";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				Inventory inv = new Inventory();
			  inv.setId(rs.getInt(1));
			  inv.setProduct_name(rs.getString(2));
			  inv.setPrice(rs.getInt("price"));
			  inv.setQuantity(rs.getInt("quantity"));
			  list.add(inv);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
		
		
		
		
	}
   
   
   
   // --------------INSERT OOERATION---------------
   
   public String addproduct(Inventory inv) 
	{
	String message=null;	
	   String query="insert into inventory(product_name,quantity,price) values(?,?,?)";
		
	   try {
		PreparedStatement ps = con.prepareStatement(query);
		
		
		ps.setString(1, inv.getProduct_name());
		ps.setInt(2, inv.getQuantity());
		ps.setInt(3, inv.getPrice());
	
		int a = ps.executeUpdate();
		
		if(a>0)
		{
			message="Inserted successfuly";
			}
		else
		{
			message="Error !!";
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return message;
	      
	}

  //------------------------ DELETE OPERATION --------------------------------- 

	public String removeproduct(Inventory inv)
	{
		String removemessage=null;
		String query="delete from inventory where id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, inv.getId());
			
			int update = ps.executeUpdate();
			if(update>0)
			{
				removemessage="Product Removed Successfully";
			}
			else
			{
				removemessage="Error !!";
						
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return removemessage;	
	}
	
   
	//------------UPDATE OPERATION-------------------------------------
	
	
	public String updateproduct(Inventory inv)
	{
		String msg=null;
		
		String query= "update inventory set price=? where id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, inv.getPrice());
			ps.setInt(2, inv.getId());
			int r = ps.executeUpdate();
			
			if(r>0)
			{
				msg="Data is updated successfullyy";
			}
			
			else
			{
				msg="Error!!!";
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return msg;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
















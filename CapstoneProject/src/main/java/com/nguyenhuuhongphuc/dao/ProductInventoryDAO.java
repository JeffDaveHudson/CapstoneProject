package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.ProductInventory;

@Repository
public class ProductInventoryDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<ProductInventory> getProductInventory() {
		String sql = "SELECT * FROM productinventory";
		List<ProductInventory> productInventoryList = jdbcTemplate.query(sql, new RowMapper<ProductInventory>() {
			
			public ProductInventory mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductInventory productInventory = new ProductInventory();
				
				productInventory.setId(rs.getInt("ID"));
				productInventory.setQuantity(rs.getInt("Quantity"));
				
				//System.out.println("dao PInventory: "+productInventory.getId()+"-"+productInventory.getQuantity());
				return productInventory;
			}
		});
		return productInventoryList;
	}
}

package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Product;
import com.nguyenhuuhongphuc.bean.ProductType;

@Repository
public class InventoryDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Product> getInventory(){
		String sql = "SELECT * FROM product";
		List<Product> productList = jdbcTemplate.query(sql, new RowMapper<Product>() {
			
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				
				product.setId(rs.getInt("ID"));
				product.setProductName(rs.getString("ProductName"));
				product.setIdProductType(rs.getInt("IDProductType"));
				product.setIdSupplier(rs.getInt("IDSupplier"));
				product.setPrice(rs.getInt("Price"));
				product.setIdProductInventory(rs.getInt("IDProductInventory"));
				
				//System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return product;
			}
		});
		return productList;
	}

	public List<ProductType> getProductType() {
		String sql = "SELECT * FROM producttype";
		List<ProductType> productTypeList = jdbcTemplate.query(sql, new RowMapper<ProductType>() {
			
			public ProductType mapRow(ResultSet rs, int rowNum) throws SQLException {
				ProductType productType = new ProductType();
				
				productType.setId(rs.getInt("ID"));
				productType.setProductType(rs.getString("ProductType"));
				
				//System.out.println("dao: "+productType.getId()+"-"+productType.getProductType());
				return productType;
			}
		});
		return productTypeList;
	}

	public List<Product> getInventorySearch(String searchInventoryString) {
		String sql = "SELECT * FROM Product WHERE ProductName LIKE '%" + searchInventoryString + "%'";
		List<Product> productList = jdbcTemplate.query(sql, new RowMapper<Product>() {
			
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				
				product.setId(rs.getInt("ID"));
				product.setProductName(rs.getString("ProductName"));
				product.setIdProductType(rs.getInt("IDProductType"));
				product.setIdSupplier(rs.getInt("IDSupplier"));
				product.setPrice(rs.getInt("Price"));
				product.setIdProductInventory(rs.getInt("IDProductInventory"));
				
				//System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return product;
			}
		});
		return productList;
	}

	public List<Product> getInventoryByAttribute(int idProductType, int idSupplier) {
		String sql = "SELECT * FROM Product WHERE IDProductType = " + idProductType + " AND IDSupplier = "+ idSupplier;
		List<Product> productList = jdbcTemplate.query(sql, new RowMapper<Product>() {
			
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				
				product.setId(rs.getInt("ID"));
				product.setProductName(rs.getString("ProductName"));
				product.setIdProductType(rs.getInt("IDProductType"));
				product.setIdSupplier(rs.getInt("IDSupplier"));
				product.setPrice(rs.getInt("Price"));
				product.setIdProductInventory(rs.getInt("IDProductInventory"));
				
				//System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return product;
			}
		});
		return productList;
	}
}

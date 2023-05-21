package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Supplier;

@Repository
public class SupplierDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Supplier> getSupplier() {
		String sql = "SELECT * FROM supplier";
		List<Supplier> supplierList = jdbcTemplate.query(sql, new RowMapper<Supplier>() {
			
			public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
				Supplier supplier = new Supplier();
				
				supplier.setId(rs.getInt("ID"));
				supplier.setSupplierName(rs.getString("SupplierName"));
				supplier.setIdSupplierType(rs.getInt("IDSupplierType"));
				
				//System.out.println("dao: "+supplier.getId()+"-"+supplier.getSupplierName()+"-"+supplier.getIdSupplierType());
				return supplier;
			}
		});
		return supplierList;
	}
}

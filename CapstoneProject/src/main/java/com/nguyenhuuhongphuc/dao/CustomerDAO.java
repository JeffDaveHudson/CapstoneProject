package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Customer;

@Repository
public class CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Customer> getCustomer() {
		String sql = "SELECT * FROM Customer";
		List<Customer> customerList = jdbcTemplate.query(sql, new RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();

				customer.setId(rs.getInt("ID"));
				customer.setCustomerName(rs.getString("CustomerName"));
				customer.setPhone(rs.getInt("Phone"));
				customer.setAddress(rs.getString("Address"));
				customer.setEmail(rs.getString("Email"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return customer;
			}
		});
		return customerList;
	}
}

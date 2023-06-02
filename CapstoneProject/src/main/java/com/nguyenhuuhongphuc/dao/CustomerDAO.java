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
				customer.setIsSigned(rs.getBoolean("IsSigned"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return customer;
			}
		});
		return customerList;
	}

	public void updateCustomerWhenUpdatingContract(Customer customerUpdateContract) {
		String sql = "UPDATE Customer SET "
				+ "CustomerName = '" + customerUpdateContract.getCustomerName()      + "', "
				+ "Phone =         " + customerUpdateContract.getPhone()             + " , "
				+ "Address =      '" + customerUpdateContract.getAddress()           + "', "
				+ "Email =        '" + customerUpdateContract.getEmail()             + "'  "
				+ "WHERE ID =      " + customerUpdateContract.getId();
		jdbcTemplate.update(sql);
	}

	public void createCustomerWhenUpdatingContract(Customer customer) {
		String sql = "INSERT INTO Customer (CustomerName, Phone, Address, Email) VALUES ('"
					+ customer.getCustomerName() +"', "
					+ customer.getPhone()        +" ,'"
					+ customer.getAddress()      +"','"
					+ customer.getEmail()        +"')";
		jdbcTemplate.update(sql);
	}
	
	public List<Customer> getLastestCustomer() {
		String sql = "SELECT * FROM Customer ORDER BY ID DESC LIMIT 1";
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

	public void createCustomerIsNotSigned(Customer customer) {
		String sql = "INSERT INTO Customer (CustomerName, Phone, Address, Email, IsSigned) VALUES ('"
				+ customer.getCustomerName() +"', "
				+ customer.getPhone()        +" ,'"
				+ customer.getAddress()      +"','"
				+ customer.getEmail()        +"', "
				+ "false )";
		jdbcTemplate.update(sql);
	}
	
	public List<Customer> getIsNotSignedCustomer() {
		String sql = "SELECT * FROM Customer WHERE IsSigned = false";
		List<Customer> customerList = jdbcTemplate.query(sql, new RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer customer = new Customer();

				customer.setId(rs.getInt("ID"));
				customer.setCustomerName(rs.getString("CustomerName"));
				customer.setPhone(rs.getInt("Phone"));
				customer.setAddress(rs.getString("Address"));
				customer.setEmail(rs.getString("Email"));
				customer.setIsSigned(rs.getBoolean("IsSigned"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return customer;
			}
		});
		return customerList;
	}

	public List<Customer> getCustomerWithContract(int id) {
		String sql = "SELECT * FROM Customer WHERE ID = "+id;
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

	public void updateIsSignedCustomer(int idExistedCustomer) {
		String sql = "UPDATE Customer SET "
				+ "IsSigned = true "
				+ "WHERE ID =      " + idExistedCustomer;
		jdbcTemplate.update(sql);
	}
}

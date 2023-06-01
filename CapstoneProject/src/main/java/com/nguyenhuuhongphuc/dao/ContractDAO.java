package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Contract;
import com.nguyenhuuhongphuc.bean.Product;

@Repository
public class ContractDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Contract> getContract() {
		String sql = "SELECT * FROM Contract";
		List<Contract> contractList = jdbcTemplate.query(sql, new RowMapper<Contract>() {

			public Contract mapRow(ResultSet rs, int rowNum) throws SQLException {
				Contract contract = new Contract();

				contract.setId(rs.getInt("ID"));
				contract.setDetail(rs.getString("Detail"));
				contract.setIdCustomer(rs.getInt("IDCustomer"));
				contract.setSigningDate(rs.getDate("SigningDate"));
				contract.setPrice(rs.getInt("Price"));
				contract.setIdStaff(rs.getInt("IDStaff"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return contract;
			}
		});
		return contractList;
	}
	
	public List<Contract> getContractById(int id) {
		String sql = "SELECT * FROM Contract WHERE ID= "+id;
		List<Contract> contractList = jdbcTemplate.query(sql, new RowMapper<Contract>() {

			public Contract mapRow(ResultSet rs, int rowNum) throws SQLException {
				Contract contract = new Contract();

				contract.setId(rs.getInt("ID"));
				contract.setDetail(rs.getString("Detail"));
				contract.setIdCustomer(rs.getInt("IDCustomer"));
				contract.setSigningDate(rs.getDate("SigningDate"));
				contract.setPrice(rs.getInt("Price"));
				contract.setIdStaff(rs.getInt("IDStaff"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return contract;
			}
		});
		return contractList;
	}

	public List<Contract> getContractBySearch(String searchString) {
		String sql = "select co.* from contract co left join customer cu on co.IDCustomer = cu.ID "
				   + "where co.Detail LIKE '%" + searchString + "%' "
				   + "OR cu.CustomerName LIKE '%" + searchString + "%' "
				   + "OR cu.Address LIKE '%" + searchString + "%'";
		List<Contract> contractList = jdbcTemplate.query(sql, new RowMapper<Contract>() {

			public Contract mapRow(ResultSet rs, int rowNum) throws SQLException {
				Contract contract = new Contract();

				contract.setId(rs.getInt("ID"));
				contract.setDetail(rs.getString("Detail"));
				contract.setIdCustomer(rs.getInt("IDCustomer"));
				contract.setSigningDate(rs.getDate("SigningDate"));
				contract.setPrice(rs.getInt("Price"));
				contract.setIdStaff(rs.getInt("IDStaff"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return contract;
			}
		});
		return contractList;
	}

	public void removeContract(int id) {
		String sql = "DELETE FROM Contract WHERE ID = " + id;
        jdbcTemplate.update(sql);
	}

	public void updateContract(Contract contract) {
		String sql = "UPDATE Contract SET "
				+ "Detail =     '" + contract.getDetail()      + "', "
				+ "SigningDate ='" + contract.getSigningDate() + "', "
				+ "Price =       " + contract.getPrice()       + " , "
				+ "IDStaff =     " + contract.getIdStaff()     + " "
				+ "WHERE ID =    " + contract.getId();
		jdbcTemplate.update(sql);
	}

	public void createContract(Contract contract) {
		String sql = "INSERT INTO Contract (Detail, IDCustomer, SigningDate, Price, IDStaff) VALUES ('"
				+ contract.getDetail() 		+"', "
				+ contract.getIdCustomer()  +" ,'"
				+ contract.getSigningDate() +"', "
				+ contract.getPrice()       +" , "
				+ contract.getIdStaff()     +" ) ";
	jdbcTemplate.update(sql);
	}
}

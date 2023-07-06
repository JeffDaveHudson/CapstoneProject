package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Contract;

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
	
	public List<Contract> getCustomerContract(int searchString) {
		String sql = "select cu.CustomerName, cu.Phone, cu.Address, cu.Email, cu.IsSigned, "
				+ "co.ID, co.Detail, co.IDCustomer, co.SigningDate, co.Price, co.IDStaff "
				+ "from customer cu join contract co on cu.ID = co.IDCustomer where Phone = " + searchString ;
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
				System.out.println("cus: "+contract.getId());
				return contract;
			}
		});
		return contractList;
	}

	public List<Contract> getRevenueEachContractByMonth(String year, String month) {
		String sql = "SELECT * FROM contract WHERE year(SigningDate) = '"+ year +"' AND month(SigningDate)='"+ month +"'" ;
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
				System.out.println("get: "+contract.getId()+" - "+contract.getDetail()+" - "+contract.getIdCustomer()+" - "+contract.getIdStaff()+" - "+contract.getPrice()+" - "+contract.getSigningDate());
				return contract;
			}
		});
		return contractList;
	}
	
	public int getTotalRevenueByMonth(String year, String month) {
		String sql = "SELECT sum(Price) As Total FROM contract WHERE year(SigningDate) = '"+ year +"' AND month(SigningDate)='"+ month +"'" ;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}

	public int getRevenueBetween2Times(String startDate, String endDate) {
		String sql = "SELECT sum(Price) As Total FROM contract WHERE SigningDate BETWEEN '"+startDate+"' AND '"+endDate+"'" ;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}

	public int getTotalRevenueByQuarter1(String year) {
		String sql = "SELECT sum(Price) As Total FROM contract WHERE SigningDate BETWEEN  '"+year+"-01-01' AND '"+year+"-03-31'" ;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public int getTotalRevenueByQuarter2(String year) {
		String sql = "SELECT sum(Price) As Total FROM contract WHERE SigningDate BETWEEN  '"+year+"-04-01' AND '"+year+"-06-30'" ;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public int getTotalRevenueByQuarter3(String year) {
		String sql = "SELECT sum(Price) As Total FROM contract WHERE SigningDate BETWEEN  '"+year+"-07-01' AND '"+year+"-09-30'" ;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}
	
	public int getTotalRevenueByQuarter4(String year) {
		String sql = "SELECT sum(Price) As Total FROM contract WHERE SigningDate BETWEEN  '"+year+"-10-01' AND '"+year+"-12-31'" ;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}

	public List<Contract> getRevenueDetailByCurrentMonth(String year, String month) {
		String sql = "SELECT * FROM contract WHERE year(SigningDate) = '"+ year +"' AND month(SigningDate)='"+ month +"'" ;
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
				System.out.println("get: "+contract.getId()+" - "+contract.getDetail()+" - "+contract.getIdCustomer()+" - "+contract.getIdStaff()+" - "+contract.getPrice()+" - "+contract.getSigningDate());
				return contract;
			}
		});
		return contractList;
	}

	public List<Contract> getRevenueDetailByQuarter1(String year) {
		String sql = "SELECT * FROM contract WHERE SigningDate BETWEEN  '"+year+"-01-01' AND '"+year+"-03-31'" ;
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
				System.out.println("get: "+contract.getId()+" - "+contract.getDetail()+" - "+contract.getIdCustomer()+" - "+contract.getIdStaff()+" - "+contract.getPrice()+" - "+contract.getSigningDate());
				return contract;
			}
		});
		return contractList;
	}
	
	public List<Contract> getRevenueDetailByQuarter2(String year) {
		String sql = "SELECT * FROM contract WHERE SigningDate BETWEEN  '"+year+"-04-01' AND '"+year+"-06-30'" ;
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
				System.out.println("get: "+contract.getId()+" - "+contract.getDetail()+" - "+contract.getIdCustomer()+" - "+contract.getIdStaff()+" - "+contract.getPrice()+" - "+contract.getSigningDate());
				return contract;
			}
		});
		return contractList;
	}
	
	public List<Contract> getRevenueDetailByQuarter3(String year) {
		String sql = "SELECT * FROM contract WHERE SigningDate BETWEEN  '"+year+"-07-01' AND '"+year+"-09-30'" ;
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
				System.out.println("get: "+contract.getId()+" - "+contract.getDetail()+" - "+contract.getIdCustomer()+" - "+contract.getIdStaff()+" - "+contract.getPrice()+" - "+contract.getSigningDate());
				return contract;
			}
		});
		return contractList;
	}
	
	public List<Contract> getRevenueDetailByQuarter4(String year) {
		String sql = "SELECT * FROM contract WHERE SigningDate BETWEEN  '"+year+"-10-01' AND '"+year+"-12-31'" ;
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
				System.out.println("get: "+contract.getId()+" - "+contract.getDetail()+" - "+contract.getIdCustomer()+" - "+contract.getIdStaff()+" - "+contract.getPrice()+" - "+contract.getSigningDate());
				return contract;
			}
		});
		return contractList;
	}

	public List<Contract> getRevenueDetailBetween2Times(String startDate, String endDate) {
		String sql = "SELECT * FROM contract WHERE SigningDate BETWEEN '"+startDate+"' AND '"+endDate+"'" ;
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
				System.out.println("get: "+contract.getId()+" - "+contract.getDetail()+" - "+contract.getIdCustomer()+" - "+contract.getIdStaff()+" - "+contract.getPrice()+" - "+contract.getSigningDate());
				return contract;
			}
		});
		return contractList;
	}

	public void updatePrice(int cost, int idContract) {
		String sql = "UPDATE Contract SET "
				+ "Price = Price +  " + cost      + " "
				+ "WHERE ID =    " + idContract;
		jdbcTemplate.update(sql);
	}
	
	public int getIdContractByIdProcess(int idProcess) {
		String sql = "Select IDContract from process WHERE id = "+idProcess ;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}

	public void updateContractPriceWhenRemovingStep(int cost, int idContract) {
		String sql = "UPDATE Contract SET "
				+ "Price = Price -  " + cost      + " "
				+ "WHERE ID =    " + idContract;
		jdbcTemplate.update(sql);
	}

	public void updatePriceWhenUpdatingStep(int staticOldStepCost, int newStepCost, int staticOldStepProductQuantityCost, int newStepProductQuantity, int staticIdContract) {
		String sql = "UPDATE Contract SET "
				+ "Price = Price -  " + staticOldStepCost   + " + " + newStepCost + " - " + staticOldStepProductQuantityCost + " + " + newStepProductQuantity +" "
				+ "WHERE ID =    " + staticIdContract;
		jdbcTemplate.update(sql);
	}
}

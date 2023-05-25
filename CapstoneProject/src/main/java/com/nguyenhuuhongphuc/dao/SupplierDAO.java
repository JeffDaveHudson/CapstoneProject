package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Supplier;
import com.nguyenhuuhongphuc.bean.SupplierType;

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

				// System.out.println("dao:
				// "+supplier.getId()+"-"+supplier.getSupplierName()+"-"+supplier.getIdSupplierType());
				return supplier;
			}
		});
		return supplierList;
	}

	public List<SupplierType> getSupplierType() {
		String sql = "SELECT * FROM suppliertype";
		List<SupplierType> supplierTypeList = jdbcTemplate.query(sql, new RowMapper<SupplierType>() {

			public SupplierType mapRow(ResultSet rs, int rowNum) throws SQLException {
				SupplierType supplierType = new SupplierType();

				supplierType.setId(rs.getInt("ID"));
				supplierType.setSupplierType(rs.getString("SupplierType"));

				// System.out.println("dao:
				// "+supplier.getId()+"-"+supplier.getSupplierName()+"-"+supplier.getIdSupplierType());
				return supplierType;
			}
		});
		return supplierTypeList;
	}

	public List<Supplier> getSupplierById(int id) {
		String sql = "SELECT * FROM supplier WHERE ID = " + id;
		List<Supplier> supplierList = jdbcTemplate.query(sql, new RowMapper<Supplier>() {

			public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
				Supplier supplier = new Supplier();

				supplier.setId(rs.getInt("ID"));
				supplier.setSupplierName(rs.getString("SupplierName"));
				supplier.setIdSupplierType(rs.getInt("IDSupplierType"));

				// System.out.println("dao:
				// "+supplier.getId()+"-"+supplier.getSupplierName()+"-"+supplier.getIdSupplierType());
				return supplier;
			}
		});
		return supplierList;
	}

	public void deleteSupplier(int id) {
		String sql = "DELETE FROM Supplier WHERE ID = " + id;
		jdbcTemplate.update(sql);
	}

	public void updateSupplier(Supplier supplier) {
		String sql = "UPDATE Supplier SET SupplierName = '" +supplier.getSupplierName() + "', IDSupplierType = " + supplier.getIdSupplierType() + " WHERE ID = " + supplier.getId();
		jdbcTemplate.update(sql);
	}

	public void createSupplier(Supplier supplier) {
		String sql = "INSERT INTO Supplier (SupplierName, IDSupplierType) VALUES ('"
                + supplier.getSupplierName()+"',"
                + supplier.getIdSupplierType()+ ")";
        jdbcTemplate.update(sql);
	}
}

package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Problem;

@Repository
public class ProblemDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createProblem(Problem problem) {
		String sql = "INSERT INTO Problem (Detail, IDCustomer, IsSigned) VALUES ('"
				+ problem.getDetail() + "'," 
				+ problem.getIdCustomer() + ", "
				+ "false)";
		jdbcTemplate.update(sql);

	}
	
	public List<Problem> getProblemIsNotSigned() {
		String sql = "SELECT * FROM problem WHERE IsSigned = false";
		List<Problem> problemList = jdbcTemplate.query(sql, new RowMapper<Problem>() {

			public Problem mapRow(ResultSet rs, int rowNum) throws SQLException {
				Problem problem = new Problem();

				problem.setId(rs.getInt("ID"));
				problem.setDetail(rs.getString("Detail"));
				problem.setIdCustomer(rs.getInt("IDCustomer"));
				problem.setSigned(rs.getBoolean("IsSigned"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return problem;
			}
		});
		return problemList;
	}

	public List<Problem> getProblemByIdCustomer(int id) {
		String sql = "SELECT * FROM problem WHERE IDCustomer = "+id;
		List<Problem> problemList = jdbcTemplate.query(sql, new RowMapper<Problem>() {

			public Problem mapRow(ResultSet rs, int rowNum) throws SQLException {
				Problem problem = new Problem();

				problem.setId(rs.getInt("ID"));
				problem.setDetail(rs.getString("Detail"));
				problem.setIdCustomer(rs.getInt("IDCustomer"));
				problem.setSigned(rs.getBoolean("IsSigned"));

				// System.out.println(product.getId()+"-"+product.getProductName()+"-"+product.getIdProductType()+"-"+product.getIdSupplier()+"-"+product.getPrice()+"-"+product.getIdProductInventory());
				return problem;
			}
		});
		return problemList;
	}
}
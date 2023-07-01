package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Step;

@Repository
public class StepDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Step> getStepList() {
		String sql = "SELECT * FROM Step";
		List<Step> stepList = jdbcTemplate.query(sql, new RowMapper<Step>() {

			public Step mapRow(ResultSet rs, int rowNum) throws SQLException {
				Step step = new Step();

				step.setId(rs.getInt("ID"));
				step.setDetail(rs.getString("Detail"));
				step.setIdProcess(rs.getInt("IDProcess"));
				step.setIdProduct(rs.getInt("IDProduct"));
				step.setCost(rs.getInt("Cost"));
				step.setIdState(rs.getInt("IDState"));
				
				System.out.println("stepDAO: "+step.getId()+" - "+step.getDetail()+" - "+step.getIdProcess()+" - "+step.getIdProduct()+" - "+step.getCost()+" - "+step.getCost());
				return step;
			}
		});
		return stepList;
	}

	public List<Step> getStepByIdProcess(int idProcess) {
		String sql = "SELECT * FROM Step WHERE IDProcess = "+idProcess;
		List<Step> stepList = jdbcTemplate.query(sql, new RowMapper<Step>() {

			public Step mapRow(ResultSet rs, int rowNum) throws SQLException {
				Step step = new Step();

				step.setId(rs.getInt("ID"));
				step.setDetail(rs.getString("Detail"));
				step.setIdProcess(rs.getInt("IDProcess"));
				step.setIdProduct(rs.getInt("IDProduct"));
				step.setCost(rs.getInt("Cost"));
				step.setIdState(rs.getInt("IDState"));
				
				//System.out.println("stepDAO: "+step.getId()+" - "+step.getDetail()+" - "+step.getIdProcess()+" - "+step.getIdProduct()+" - "+step.getCost()+" - "+step.getCost());
				return step;
			}
		});
		return stepList;
	}
}

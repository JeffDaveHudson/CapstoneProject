package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Customer;
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
				
				//System.out.println("stepDAO: "+step.getId()+" - "+step.getDetail()+" - "+step.getIdProcess()+" - "+step.getIdProduct()+" - "+step.getCost()+" - "+step.getCost());
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

	public void createStep(Step step) {
		String sql = "INSERT INTO Step (Detail, IDProcess, IDProduct, Cost, IDState) VALUES ('"
                + step.getDetail() + "', " +step.getIdProcess() + ", "
                + step.getIdProduct() + ", "+ step.getCost()+"," + step.getIdState() + ")";
		
		 jdbcTemplate.update(sql);
	}

	public void removeStep(int idStep) {
		String sql = "DELETE FROM Step WHERE ID = " + idStep;
        jdbcTemplate.update(sql);
	}

	public int getCostByIdStep(int idStep) {
		String sql = "SELECT Cost FROM Step WHERE ID = "+idStep;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}

	public List<Step> getStepByIdStep(int idStep) {
		String sql = "SELECT * FROM Step WHERE ID = "+idStep;
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

	public void updateStep(Step step, int staticOldStepCost) {
		String sql = "UPDATE Step SET "
				+ "Detail = '"+ step.getDetail() +"', "
				+ "IDProduct = "+ step.getIdProduct() + ", "
				+ "Cost = Cost - " + staticOldStepCost  +" + "+ step.getCost() +", "
				+ "IDState = "+ step.getIdState() + " "
				+ "WHERE ID = " + step.getId();
		jdbcTemplate.update(sql);
	}
	
	public List<Step> getLastestStep() {
		String sql = "SELECT * FROM Step ORDER BY ID DESC LIMIT 1";
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

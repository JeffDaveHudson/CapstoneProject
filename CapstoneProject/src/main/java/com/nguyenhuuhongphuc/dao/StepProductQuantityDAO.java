package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Step;
import com.nguyenhuuhongphuc.bean.StepProductQuantity;

@Repository
public class StepProductQuantityDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<StepProductQuantity> getStepProductQuantity() {
		String sql = "SELECT * FROM StepProductQuantity";
		List<StepProductQuantity> stepProductQuantityList = jdbcTemplate.query(sql, new RowMapper<StepProductQuantity>() {

			public StepProductQuantity mapRow(ResultSet rs, int rowNum) throws SQLException {
				StepProductQuantity stepProductQuantity = new StepProductQuantity();

				stepProductQuantity.setId(rs.getInt("ID"));
				stepProductQuantity.setQuantity(rs.getInt("Quantity"));
				stepProductQuantity.setIdStep(rs.getInt("IDStep"));
				stepProductQuantity.setCost(rs.getInt("Cost"));
				
				//System.out.println("DAODAO: "+stepProductQuantity.getId()+" - "+stepProductQuantity.getQuantity()+" - "+stepProductQuantity.getIdStep());
				//System.out.println("stepDAO: "+step.getId()+" - "+step.getDetail()+" - "+step.getIdProcess()+" - "+step.getIdProduct()+" - "+step.getCost()+" - "+step.getCost());
				return stepProductQuantity;
			}
		});
		return stepProductQuantityList;
	}
	
	public void createStepProductQuantity(StepProductQuantity stepProductQuantity) {
		String sql = "INSERT INTO StepProductQuantity (Quantity, IDStep, Cost) VALUES ("
                + stepProductQuantity.getQuantity() + ", " + stepProductQuantity.getIdStep() + ", " + stepProductQuantity.getCost() + ")";
		
		 jdbcTemplate.update(sql);
	}

	public int getCostProductByIdStep(int idStep) {
		String sql = "SELECT Cost FROM StepProductQuantity WHERE IDStep = "+idStep;
		try {
			return jdbcTemplate.queryForObject(sql, int.class);
		} catch (Exception e) {
			return 0;
		}
	}

	public void removeStepProductQuantity(int idStep) {
		String sql = "DELETE FROM StepProductQuantity WHERE IDStep = " + idStep;
        jdbcTemplate.update(sql);
	}

	public void updateStepProductQuantityCost(StepProductQuantity stepProductQuantity, int staticOldStepProductQuantityCost) {
		String sql = "UPDATE StepProductQuantity SET "
				+ "Cost = Cost - " + staticOldStepProductQuantityCost  +" + "+ stepProductQuantity.getCost() +", "
				+ "Quantity = "+ stepProductQuantity.getQuantity() + " "
				+ "WHERE IDStep = " + stepProductQuantity.getIdStep();
		jdbcTemplate.update(sql);
	}

	public void removeStepProductQuantityByIdStep(int idStep) {
		String sql = "DELETE FROM StepProductQuantity WHERE IDStep = " + idStep;
        jdbcTemplate.update(sql);
	}

}

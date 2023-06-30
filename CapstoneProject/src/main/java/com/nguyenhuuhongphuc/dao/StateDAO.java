package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.State;

@Repository
public class StateDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<State> getStateList(){
		String sql = "SELECT * FROM state";
		List<State> stateList = jdbcTemplate.query(sql, new RowMapper<State>() {
			
			public State mapRow(ResultSet rs, int rowNum) throws SQLException {
				State state = new State();
				
				state.setId(rs.getInt("ID"));
				state.setDetail(rs.getString("Detail"));
				
				//System.out.println(staff.getId()+"-"+staff.getStaffName()+"-"+staff.getIdStaffType()+"-"+staff.getSalary()+"-"+staff.getUserName());
				return state;
			}
		});
		return stateList;
	}
}

package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.nguyenhuuhongphuc.bean.Processs;

@Repository
public class ProcesssDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Processs> showProcess(int id){
		String sql = "SELECT * FROM Process WHERE IDContract = "+ id;
        List<Processs> processsList = jdbcTemplate.query(sql, new RowMapper<Processs>() {

            public Processs mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Processs process = new Processs();

            	process.setId(rs.getInt("ID"));
            	process.setDetail(rs.getString("Detail"));
            	process.setStartDate(rs.getDate("StartDate"));
            	process.setEndDate(rs.getDate("EndDate"));
            	process.setIdContract(rs.getInt("IDContract"));

            	//System.out.println("DAOLastestbill: "+bill.getId()+"-"+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getTotal()+"-"+bill.getDateTransfer());
            	System.out.println("dd: "+process.getEndDate());
            	
            	
            	return process;

            }
        });
        return processsList;
	}
}
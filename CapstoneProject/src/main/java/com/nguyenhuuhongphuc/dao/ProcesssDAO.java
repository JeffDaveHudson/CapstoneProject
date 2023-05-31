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

	public List<Processs> showProcess(int id) {
		String sql = "SELECT * FROM Process WHERE IDContract = " + id +" ORDER BY EndDate";
		List<Processs> processsList = jdbcTemplate.query(sql, new RowMapper<Processs>() {

			public Processs mapRow(ResultSet rs, int rowNum) throws SQLException {
				Processs process = new Processs();

				process.setId(rs.getInt("ID"));
				process.setDetail(rs.getString("Detail"));
				process.setStartDate(rs.getDate("StartDate"));
				process.setEndDate(rs.getDate("EndDate"));
				process.setIdContract(rs.getInt("IDContract"));

				// System.out.println("DAOLastestbill:
				// "+bill.getId()+"-"+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getTotal()+"-"+bill.getDateTransfer());
				// System.out.println("dd: "+process.getEndDate());

				return process;

			}
		});
		return processsList;
	}
	
	public List<Processs> getProcessById(int id) {
		String sql = "SELECT * FROM Process WHERE ID = " + id;
		List<Processs> processsList = jdbcTemplate.query(sql, new RowMapper<Processs>() {

			public Processs mapRow(ResultSet rs, int rowNum) throws SQLException {
				Processs process = new Processs();

				process.setId(rs.getInt("ID"));
				process.setDetail(rs.getString("Detail"));
				process.setStartDate(rs.getDate("StartDate"));
				process.setEndDate(rs.getDate("EndDate"));
				process.setIdContract(rs.getInt("IDContract"));

				// System.out.println("DAOLastestbill:
				// "+bill.getId()+"-"+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getTotal()+"-"+bill.getDateTransfer());
				// System.out.println("dd: "+process.getEndDate());

				return process;

			}
		});
		return processsList;
	}

	public void createNewProcess(Processs processs) {
		//System.out.println("DAO: "+processs.getDetail()+processs.getStartDate()+processs.getEndDate()+"==="+processs.getIdContract());
		/*
		 * String sql =
		 * "INSERT INTO Process (Detail, StartDate, EndDate, IDContract) VALUES ('" +
		 * processs.getDetail() + "', " +processs.getStartDate() + "," +
		 * processs.getEndDate() + ", " + processs.getIdContract() + ")";
		 */
		String sql = "INSERT INTO Process (Detail, StartDate, EndDate, IDContract) VALUES ('"
                + processs.getDetail() + "', '" +processs.getStartDate() + "', '"
                + processs.getEndDate() + "', " + processs.getIdContract() + ")";
		
		 jdbcTemplate.update(sql);
	}

	public void removeProcess(int id) {
		String sql = "DELETE FROM Process WHERE ID = " + id;
        jdbcTemplate.update(sql);
	}

	public void updateProcess(Processs processs) {
		String sql = "UPDATE Process SET "
				+ "Detail = '" + processs.getDetail() + "', "
				+ "StartDate ='" + processs.getStartDate() + "', "
				+ "EndDate = '" + processs.getEndDate() + "' "
				+ "WHERE ID = " + processs.getId();
		jdbcTemplate.update(sql);
	}
}

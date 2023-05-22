package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Bill;
import com.nguyenhuuhongphuc.bean.Staff;

@Repository
public class BillDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Bill> getBillList(){
		String sql = "SELECT * FROM bill";
		List<Bill> billList = jdbcTemplate.query(sql, new RowMapper<Bill>() {
			
			public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
				Bill bill = new Bill();
				
				bill.setId(rs.getInt("ID"));
				bill.setBillName(rs.getString("BillName"));
				bill.setIdSupplier(rs.getInt("IDSupplier"));
				bill.setIdStaff(rs.getInt("IDStaff"));
				bill.setTotal(rs.getInt("Total"));
				bill.setDateTransfer(rs.getDate("DateTransfer"));
				
				System.out.println("bill: "+bill.getId()+"-"+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getTotal()+"-"+bill.getDateTransfer());
				return bill;
			}
		});
		return billList;
	}
	
	public List<Bill> getBillSearch(String searchString) {
        String sql = "SELECT * FROM Bill WHERE BillName LIKE '%" + searchString + "%'";
        List<Bill> billList = jdbcTemplate.query(sql, new RowMapper<Bill>() {

            public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Bill bill = new Bill();

            	bill.setId(rs.getInt("ID"));
            	bill.setBillName(rs.getString("BillName"));
            	bill.setIdSupplier(rs.getInt("IDSupplier"));
            	bill.setIdStaff(rs.getInt("IDStaff"));
            	bill.setTotal(rs.getInt("Total"));
            	bill.setDateTransfer(rs.getDate("DateTransfer"));

//                System.out.println(
//                        "search: " + staff.getId() + "-" + staff.getStaffName() + "-" + staff.getIdStaffType() + "-" + staff.getSalary() + "-" + staff.getUserName());
                return bill;

            }
        });
        return billList;
    }
}

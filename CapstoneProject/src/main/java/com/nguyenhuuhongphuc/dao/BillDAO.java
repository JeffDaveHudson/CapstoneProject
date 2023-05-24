package com.nguyenhuuhongphuc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nguyenhuuhongphuc.bean.Bill;
import com.nguyenhuuhongphuc.bean.BillDetail;
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
				
				//System.out.println("bill: "+bill.getId()+"-"+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getTotal()+"-"+bill.getDateTransfer());
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

	public void createNewBill(Bill bill) {
		String sql = "INSERT INTO Bill (BillName, IDSupplier, IDStaff, DateTransfer) VALUES ('"
                + bill.getBillName() + "', " + bill.getIdSupplier() + ","
                + bill.getIdStaff() + ", '" + bill.getDateTransfer() + "')";
		//System.out.println("bill   ++   =="+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getDateTransfer());	
        jdbcTemplate.update(sql);
	}
	
	public List<Bill> getTheLastestBill() {
        String sql = "SELECT * FROM Bill order by ID DESC LIMIT 1";
        List<Bill> billList = jdbcTemplate.query(sql, new RowMapper<Bill>() {

            public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Bill bill = new Bill();

            	bill.setId(rs.getInt("ID"));
            	bill.setBillName(rs.getString("BillName"));
            	bill.setIdSupplier(rs.getInt("IDSupplier"));
            	bill.setIdStaff(rs.getInt("IDStaff"));
            	bill.setTotal(rs.getInt("Total"));
            	bill.setDateTransfer(rs.getDate("DateTransfer"));

            	//System.out.println("DAOLastestbill: "+bill.getId()+"-"+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getTotal()+"-"+bill.getDateTransfer());
            	return bill;

            }
        });
        return billList;
    }
	
	public List<Bill> getBillById(int id) {
        String sql = "SELECT * FROM Bill WHERE ID = "+ id;
        List<Bill> billList = jdbcTemplate.query(sql, new RowMapper<Bill>() {

            public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Bill bill = new Bill();

            	bill.setId(rs.getInt("ID"));
            	bill.setBillName(rs.getString("BillName"));
            	bill.setIdSupplier(rs.getInt("IDSupplier"));
            	bill.setIdStaff(rs.getInt("IDStaff"));
            	bill.setTotal(rs.getInt("Total"));
            	bill.setDateTransfer(rs.getDate("DateTransfer"));

            	//System.out.println("DAOLastestbill: "+bill.getId()+"-"+bill.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getTotal()+"-"+bill.getDateTransfer());
            	return bill;

            }
        });
        return billList;
    }

	public void createNewBillDetail(BillDetail billDetail) {
		String sql = "INSERT INTO BillDetail (IDProduct, IDBill, Price, Quantity) VALUES ('"
                + billDetail.getIdProduct() + "', " + billDetail.getIdBill() + ","
                + billDetail.getPrice() + ", '" + billDetail.getQuantity() + "')";
		//System.out.println("bill   ++   =="+billDetail.getBillName()+"-"+bill.getIdSupplier()+"-"+bill.getIdStaff()+"-"+bill.getDateTransfer());	
        jdbcTemplate.update(sql);
	} 
	
	public List<BillDetail> getBillDetail() {
        String sql = "SELECT * FROM BillDetail";
        List<BillDetail> billDetailList = jdbcTemplate.query(sql, new RowMapper<BillDetail>() {

            public BillDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
            	BillDetail billDetail = new BillDetail();

            	billDetail.setId(rs.getInt("ID"));
            	billDetail.setIdProduct(rs.getInt("IDProduct"));
            	billDetail.setIdBill(rs.getInt("IDBill"));
            	billDetail.setPrice(rs.getInt("Price"));
            	billDetail.setQuantity(rs.getInt("Quantity"));

            	//System.out.println("DAO: "+billDetail.getId()+"-"+billDetail.getIdProduct()+"-"+billDetail.getIdBill()+"-"+billDetail.getPrice()+"-"+billDetail.getQuantity());
            	return billDetail;

            }
        });
        return billDetailList;
    }
	
	public List<BillDetail> getBillDetailWhenCreating(int idBill) {
        String sql = "SELECT * FROM BillDetail WHERE IDBill = "+idBill;
        List<BillDetail> billDetailList = jdbcTemplate.query(sql, new RowMapper<BillDetail>() {

            public BillDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
            	BillDetail billDetail = new BillDetail();

            	billDetail.setId(rs.getInt("ID"));
            	billDetail.setIdProduct(rs.getInt("IDProduct"));
            	billDetail.setIdBill(rs.getInt("IDBill"));
            	billDetail.setPrice(rs.getInt("Price"));
            	billDetail.setQuantity(rs.getInt("Quantity"));

            	return billDetail;
            }
        });
        return billDetailList;
    }
	
	public void updateToTalWhenCreating(int total, int idBill) {
		String sql = "UPDATE Bill SET Total = "+total+" WHERE ID = "+idBill;
		jdbcTemplate.update(sql);
	}
	
	public List<Bill> getTotalInBill(int idBill) {
		String sql = "SELECT SUM(Price*Quantity) AS TotalBillDetail FROM billdetail WHERE IDBill = "+idBill;
		List<Bill> billList =  jdbcTemplate.query(sql, new RowMapper<Bill>() {

            public Bill mapRow(ResultSet rs, int rowNum) throws SQLException {
            	Bill bill = new Bill();
            	bill.setTotal(rs.getInt("TotalBillDetail"));
            	return bill;
            }
        });
        return billList;
		
	}
	
	public void updateProductStock(int newQuantity, int idProduct) {
		String sql = "update product set Stock = Stock + "+newQuantity+" where id="+idProduct;
		jdbcTemplate.update(sql);
	}
	 
}

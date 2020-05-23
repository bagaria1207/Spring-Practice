package com.psl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.psl.pojo.Employee;

public class EmployeeDao {
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//DataSource dataSource;
	public EmployeeDao() throws ClassNotFoundException, SQLException{
//		con = DBUtil.getConnection();
	}
	
//	public DataSource getDataSource() {
//		return dataSource;
//	}
//
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}

/*	public boolean insert(Employee bean){
		String sql = "INSERT INTO Employee VALUES(?,?,?,?)";
		try{
			Connection con = dataSource.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bean.getEmpId());
			pstmt.setString(2, bean.getEmpName());
			pstmt.setInt(3, bean.getEmpSal());
			pstmt.setString(4, bean.getDesignation());
			int row = pstmt.executeUpdate();
			if(row>0){
				return true;
			}
			else{
				return false;
			}
		}	
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return false;
	}
	public ArrayList<Employee> getAllEmployee(){
		ArrayList<Employee> list = new ArrayList<Employee>();
		try{
			Connection con = dataSource.getConnection();
			String sql = "SELECT * FROM Employee";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				Employee e = new Employee();
				e.setEmpId(rs.getInt(1));
				e.setEmpName(rs.getString(2));
				e.setEmpSal(rs.getInt(3));
				e.setDesignation(rs.getString(4));
				list.add(e);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return list;
	}
*/
	
	public boolean insert(final Employee bean){
		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, bean.getEmpId());
				pstmt.setString(2, bean.getEmpName());
				pstmt.setInt(3, bean.getEmpSal());
				pstmt.setString(4, bean.getDesignation());
				int row = pstmt.executeUpdate();
				if(row>0){
					return true;
				}
				else{
					return false;
				}
//				return pstmt.execute();
			}
		});
	}
	
	public List<Employee> getAllEmployee(){
		String sql = "SELECT * FROM EMPLOYEE";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Employee>>(){

			List<Employee> list = new ArrayList<Employee>();
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				// TODO Auto-generated method stub
			
				while(rs.next()){
					Employee e = new Employee();
					e.setEmpId(rs.getInt(1));
					e.setEmpName(rs.getString(2));
					e.setEmpSal(rs.getInt(3));
					e.setDesignation(rs.getString(4));
					list.add(e);
				}
				return list;
			}
		});
	}
	
	public List<Employee> getAllUsingRowMapper(){
		String sql = "SELECT * FROM EMPLOYEE";
		return jdbcTemplate.query(sql, new RowMapper<Employee>(){
			@Override
			public Employee mapRow(ResultSet rs, int noOfRows)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				emp.setDesignation(rs.getString(4));
				return emp;
			}
		});	
	}
	
	public int update(Employee bean){
		String sql = "UPDATE EMPLOYEE SET empSal=? where empId=?";
		return jdbcTemplate.update(sql, new Object[]{bean.getEmpSal(),bean.getEmpId()});
	}
	
	public int delete(Employee bean){
		String sql = "DELETE FROM EMPLOYEE WHERE empId=?";
		return jdbcTemplate.update(sql, new Object[]{bean.getEmpId()});
	}

}


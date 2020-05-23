package com.psl.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.bean.Employee;

public class EmployeeDao extends JdbcDaoSupport{
	
	public List<Employee> fetchEmployee(){
		String sql = "SELECT * FROM Employee";
		return this.getJdbcTemplate().query(sql, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rows) throws SQLException {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				emp.setDesignation(rs.getString(4));
				return emp;
			}
		});
	}
	
	public boolean insert(final Employee bean){
		String sql = "INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
		return this.getJdbcTemplate().execute(sql, new PreparedStatementCallback<Boolean>(){

			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt)
					throws SQLException, DataAccessException {
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
		});
	}
}

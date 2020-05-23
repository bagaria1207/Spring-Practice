package com.psl.emp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.emp.bean.Employee;

@Repository("dao")
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void init(){
		this.setDataSource(dataSource);
	}
	
	@Override
	public Employee addEmployee(final Employee emp) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Empl values(?,?,?)";
		return this.getJdbcTemplate().execute(sql, new PreparedStatementCallback<Employee>(){

			@Override
			public Employee doInPreparedStatement(PreparedStatement pstmt)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, emp.getEmpId());
				pstmt.setString(2, emp.getEmpName());
				pstmt.setInt(3, emp.getEmpSal());
//				pstmt.execute();
//				return emp;
				int row = pstmt.executeUpdate();
				if(row>0){
					return emp;
				}
				else{
					return null;
				}
			}
			
		});
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM EMPL";
		return this.getJdbcTemplate().query(sql, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int row)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setEmpSal(rs.getInt(3));
				return emp;
			}
	
		});
	}

}

package com.psl.emp.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.psl.emp.bean.Employee;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void initialize(){
		this.setDataSource(dataSource);
	}
	
//	public JdbcTemplate getJdbcTemplate() {
//		return jdbcTemplate;
//	}
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//	static HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
//	static{
//		Employee emp1 = new Employee(101, "Abhay", 48500);
//		Employee emp2 = new Employee(102, "Mansi", 88500);
//		Employee emp3 = new Employee(103, "Pranjal", 38500);
//		Employee emp4 = new Employee(104, "Prajjawal", 118500);
//		Employee emp5 = new Employee(105, "Sahil", 42500);
//		empMap.put(emp1.getEmpId(), emp1);
//		empMap.put(emp2.getEmpId(), emp2);
//		empMap.put(emp3.getEmpId(), emp3);
//		empMap.put(emp4.getEmpId(), emp4);
//		empMap.put(emp5.getEmpId(), emp5);
//	}
	
	@Override
	public Employee getEmployeeById(final int empId) {
		// TODO Auto-generated method stub
		String sql = "Select * from Empl where empId=106";
		return this.getJdbcTemplate().query(sql, new ResultSetExtractor<Employee>(){

			@Override
			public Employee extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				// TODO Auto-generated method stub
				Employee emp = new Employee();
				while(rs.next()){
					if(rs.getInt(1)==empId){
						emp.setEmpId(empId);
						emp.setEmpName(rs.getString(2));
						emp.setEmpSal(rs.getInt(3));
					}
				}
				return emp;
			}
			
		});
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM EMPL";
		return this.getJdbcTemplate().query(sql, new ResultSetExtractor<HashMap<Integer, Employee>>(){
			HashMap<Integer, Employee> empMap = new HashMap<Integer, Employee>();
			@Override
			public HashMap<Integer, Employee> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				// TODO Auto-generated method stub
			
				while(rs.next()){
					Employee e = new Employee();
					e.setEmpId(rs.getInt(1));
					e.setEmpName(rs.getString(2));
					e.setEmpSal(rs.getInt(3));
					empMap.put(e.getEmpId(), e);
				}
				return empMap;
			}
		});
	}

	@Override
	public Employee addEmployee(final Employee emp) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO EMPL VALUES(?,?,?)";
		return this.getJdbcTemplate().execute(sql, new PreparedStatementCallback<Employee>(){

			@Override
			public Employee doInPreparedStatement(PreparedStatement pstmt)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, emp.getEmpId());
				pstmt.setString(2, emp.getEmpName());
				pstmt.setInt(3, emp.getEmpSal());
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
	public Employee removeEmployee(int empId) {
//		TODO Auto-generated method stub
		Employee e = getEmployeeById(empId);
		String sql = "DELETE FROM EMPL WHERE empId=106";
		this.getJdbcTemplate().execute(sql);
		return e;
//		String sql = "DELETE FROM EMPL WHERE empId=105";
//		return jdbcTemplate.queryForObject(sql, new RowMapper<Employee>(){
//
//			@Override
//			public Employee mapRow(ResultSet rs, int row)throws SQLException {
//				// TODO Auto-generated method stub
//				Employee e = new Employee();
//				e.setEmpId(rs.getInt(1));
//				e.setEmpName(rs.getString(2));
//				e.setEmpSal(rs.getInt(3));
//				return e;
//			}
//		});
	}
	
}

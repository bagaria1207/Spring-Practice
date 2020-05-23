package com.psl.tx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.psl.tx.bean.StudentMarks;
import com.psl.tx.bean.StudentMarksMapper;

public class StudentJDBCTemplate implements StudentDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public List<StudentMarks> listStudents() {
		String sql = "select * from student,marks where student.studid = marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplateObject.query(sql, new StudentMarksMapper());
		return studentMarks;
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		
		/*
		 * Interface that defines Spring-complaint transaction properties
		 * Default implementation of the transactiondefinition interface, offering bean
		 * (PROPAGATION_REQUIRED, ISOLATION_DEFAULT, TIMEOUT_DEFAULT, readOnly=false;
		 */
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try{
			String sql1 = "insert into Student (stuname, marks, age) values (?, ?, ?)";
			jdbcTemplateObject.update(sql1, name, marks, age);
			
			String sql2 = "select max(studid) from Student";
			int sid = jdbcTemplateObject.queryForInt(sql2);
			
			String sql3 = "insert into Marks(sid, marks, year) "+"values (?, ?, ?)";
			jdbcTemplateObject.update(sql3, sid, marks, year);
			
			System.out.println("Created Name = "+ name +", Age = "+age);
			transactionManager.commit(status);
		}
		catch(DataAccessException e){
			System.out.println("Error in creating record, rolling back");
			transactionManager.rollback(status);
			throw e;
		}
		return;	
	}

}

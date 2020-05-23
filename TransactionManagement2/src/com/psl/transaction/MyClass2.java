package com.psl.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MyClass2 extends JdbcDaoSupport implements MyInterface {

	static int id = 0;
	
	@Override
	public void method1() {	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void method2() {
		String sql = "insert into table2(idl, name) values(?, ?)";
		this.getJdbcTemplate().update(sql, new Object[]{++id, "name"});
		System.out.println("record added with id = "+id);
	}

}

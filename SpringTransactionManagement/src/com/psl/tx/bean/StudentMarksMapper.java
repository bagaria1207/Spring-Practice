package com.psl.tx.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMarksMapper implements RowMapper<StudentMarks>{

	@Override
	public StudentMarks mapRow(ResultSet rs, int row) throws SQLException {
		// TODO Auto-generated method stub
		StudentMarks obj = new StudentMarks();
		obj.setId(rs.getInt("studid"));
		obj.setAge(rs.getInt("age"));
		obj.setMarks(rs.getInt("marks"));
		obj.setName(rs.getString("stuname"));
		obj.setSid(rs.getInt("sid"));
		obj.setYear(rs.getInt("year"));
		return obj;
	}
}

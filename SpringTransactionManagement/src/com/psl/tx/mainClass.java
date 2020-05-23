package com.psl.tx;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.tx.bean.StudentMarks;
import com.psl.tx.dao.StudentJDBCTemplate;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		System.out.println("<<<<<<<<Records Creation>>>>>>>>");
		studentJDBCTemplate.create("Priya", 11, 99, 2010);
		studentJDBCTemplate.create("Nina", 20, 97, 2010);
		studentJDBCTemplate.create("Anas", 25, 100, 2011);
		
		System.out.println("<<<<<<<<Listing all the Records>>>>>>>>");
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
		for(StudentMarks record : studentMarks) {
			System.out.print("ID -> "+record.getId());
			System.out.print(", Name -> "+record.getName());
			System.out.print(", Marks -> "+record.getMarks());
			System.out.print(", Year -> "+record.getYear());
			System.out.println(", Age -> "+record.getAge());
		}
	}

}

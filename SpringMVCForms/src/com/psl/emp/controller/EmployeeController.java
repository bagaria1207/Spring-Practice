package com.psl.emp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psl.emp.bean.Employee;
import com.psl.emp.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("index")
	public String goToHomePage(Model model){
		return "home";
	}
	
	@RequestMapping("addEmployee")
	public String goToAddEmployee(Model model){
		Employee emp = new Employee();
		model.addAttribute("newEmp", emp);
		return "addEmp";
	}
	
	@RequestMapping("addEmp")
	public String addEmployee(@ModelAttribute("newEmp") @Valid Employee emp, BindingResult result, Model model){
		if(result.hasErrors()){
			return "addEmp";
		}
		else{
			emp = service.addEmployee(emp);
			model.addAttribute("addedEmp", emp);
			return "addEmp";
		}
	}
	
	@RequestMapping("showAllEmps")
	public String goToGetAllEmployees(Model model){
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("emplist", list);
		return "showEmp";
	}
	
}

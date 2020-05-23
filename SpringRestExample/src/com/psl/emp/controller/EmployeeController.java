package com.psl.emp.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.psl.emp.bean.Employee;
import com.psl.emp.service.EmpService;

@RestController
public class EmployeeController {

	@Autowired
	EmpService service;
	
	
	public EmpService getService() {
		return service;
	}
	public void setService(EmpService service) {
		this.service = service;
	}
	@RequestMapping("deleteEmp")
	public ModelAndView deleteEmployee(@RequestParam("id") int id)
	{
	
		service.deleteEmp(id);
		String msg = "Employee with id = "+id+"is deleted successfully";
		return new ModelAndView("deleteEmp","message",msg);
	}
	
	@RequestMapping("updateEm")
	public ModelAndView goToUpdatePage()
	{
		return new ModelAndView("update","","");
	}
	@RequestMapping("getAll")
	public ModelAndView getAllEmployee()
	{
		HashMap<Integer,Employee> map = service.getAllEmployee();
		//model.addAttribute("empMap", map);
		return new ModelAndView("showAll","empMap",map);
	}
	@RequestMapping("updateEmp")
	public ModelAndView updateEmployee(Model model,@RequestParam("id")int id,@RequestParam("sal") int sal)
	{
		Employee emp = service.getEmployeeById(id);
		emp.setEmpSal(sal);
		Employee e = service.updateEmployee(emp);
		return  new ModelAndView("updateSuccess","newEmp",e);
	}
	@RequestMapping("addEmp")
	public ModelAndView goToAddEmployeePage()
	{
		return new ModelAndView("addEmp","","");
	}
	@RequestMapping("addEmployee")
	public ModelAndView addEmployee(HttpServletRequest request)
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int sal = Integer.parseInt(request.getParameter("sal"));
		Employee emp = new Employee(id,name,sal);
		service.addEmployee(emp);
		return new ModelAndView("addSuccess","emp",emp);
	}
	@RequestMapping("home")
	public ModelAndView goToHomePage()
	{
		return new ModelAndView("index","","");
	}
}

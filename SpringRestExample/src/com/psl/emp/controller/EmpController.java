package com.psl.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.psl.emp.bean.Employee;
import com.psl.emp.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService service;

	public EmpService getService() {
		return service;
	}

	public void setService(EmpService service) {
		this.service = service;
	}
	@RequestMapping(value="/Employee/{id}",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
//	public ModelAndView getEmployee(@PathVariable("id")int id)
	public Employee getEmployee(@PathVariable("id")int id)
	{
//		Employee emp = service.getEmployeeById(id);
//		ModelAndView model = new ModelAndView();
//		model.setViewName("showEmp");
//		model.addObject("emp", emp);
//		return model;
		return service.getEmployeeById(id);
	}
	@RequestMapping(value="/Employee", method=RequestMethod.POST)
	public ModelAndView addEmployee(@RequestBody Employee emp)
	{
		service.addEmployee(emp);
		return new ModelAndView("showAll","","");
		
	}
}

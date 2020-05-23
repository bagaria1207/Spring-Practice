package com.psl.ekart.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.ekart.bean.Customer;
import com.psl.ekart.bean.Product;
import com.psl.ekart.service.EkartService;

@Controller
public class MyController {

	
	@Autowired
	EkartService service;
	static Map<Integer,Product> pMap = new HashMap<Integer,Product>();
	static Map<Integer,Product> cartMap = new HashMap<Integer,Product>();
	
	@RequestMapping("cust")
	public String gotoLoginPage(Model model){
		Customer cust = new Customer();
		model.addAttribute("newCust", cust);
		return "login";
	}
	
	@RequestMapping("checkCust")
	public String validateEmployee(@ModelAttribute("newCust") @Valid Customer customer, BindingResult result, Model model){
		if(result.hasErrors()){
			return "checkCust";
		}
		else{
			Customer cust = service.loginCustomer(customer);
			if(cust==null){
				return "checkCust";
			}
			else{
				pMap = service.getAllProduct();
				model.addAttribute("prodMap", pMap);
				Product key = new Product();
				model.addAttribute("aProd", key);
				model.addAttribute("cartMaps",cartMap);
				return "showProduct";
			}
		}
	}
	
	@RequestMapping("addtoCart")
	public String addDetails(@RequestParam("id") int id, Model model){
		Product p = pMap.get(id);
		cartMap.put(p.getProdId(), p);
		model.addAttribute("cartMaps",cartMap);
		return "cartDetails";
	}
	
	@RequestMapping("cartDetail")
	public String gotoProductPage(Model model){
		model.addAttribute("prodMap", pMap);
		return "showProduct";
	}
	
	@RequestMapping("viewCart")
	public String view(Model model){
		model.addAttribute("cartMaps",cartMap);
		return "cartDetails";
	}
	
	@RequestMapping("deletefromCart")
	public String deleteFromCart(@RequestParam("id") int id, Model model){
		cartMap.remove(id);
		model.addAttribute("cartMaps",cartMap);
		return "cartDetails";
	}
	
}

package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.EmployeeValidator;
import com.bean.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeValidator employeeValidator;

//	public static void main(String[] args) {
//	ResourceBundleMessageSource r=new ResourceBundleMessageSource();
//	r.setb
//	 }

	List<Employee> empList = new ArrayList<>();

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public String registerEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "registerEmployee";
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String registerEmployeeSubmit( @ModelAttribute  Employee employee,BindingResult bindingResult,
			Model model) {
		if(bindingResult.hasErrors()){
			return "registerEmployee";
		}
		model.addAttribute("employee", employee);
		empList.add(employee);
		return "redirect:list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String fetchEmployee(Model model) {
		model.addAttribute("employeeList", empList);
		return "employeeList";
	}

	@ModelAttribute("countryList")
	public List<String> countryList() {
		List<String> countryList = new ArrayList<>();
		countryList.add("usa");
		countryList.add("uk");
		countryList.add("france");
		return countryList;
	}

	@ModelAttribute("skillList")
	public List<String> skillList() {
		List<String> skillList = new ArrayList<>();
		skillList.add("java");
		skillList.add("scala");
		skillList.add("groovy");
		return skillList;
	}

	@InitBinder
	public void initBind(WebDataBinder webDataBinder) {
		webDataBinder.setValidator(employeeValidator);

	}
}

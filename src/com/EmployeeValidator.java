package com;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bean.Employee;
@Component
public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Employee employee=(Employee)obj;
		if(employee.getEname()==null){
			errors.reject("ename", "ename.required");	
		}
		
	}

}

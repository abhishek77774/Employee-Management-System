package com.cognizant.employeemngt.main;

import com.cognizant.employeemngt.bean.Employee;
import com.cognizant.employeemngt.service.EmployeeService;
import com.cognizant.employeemngt.service.EmployeeServiceImpl;

public class Main {
	public static void main(String args[])
	{
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = new Employee();
		String result = employeeService.addEmployee(employee);
		if("success".equals(result))
		{
			System.out.println("record added successfully");
		}
		
		else
		{
			System.out.println("not done");
		}
		
	}

}

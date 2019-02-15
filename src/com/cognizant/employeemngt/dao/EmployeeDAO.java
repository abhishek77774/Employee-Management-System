package com.cognizant.employeemngt.dao;

import java.util.List;

import com.cognizant.employeemngt.bean.Employee;

public interface EmployeeDAO {
	public String addEmployee(Employee employee);
	public String updateEmployee(String id, Employee employee);
	public String deleteEmployee(String id);
	public Employee getEmployee(String id);
	public List<Employee> getEmployeeByName(String name);
	public List<Employee> getEmployees();
}

package com.cognizant.employeemngt.dao;
import java.sql.*;
import java.util.List;

import com.cognizant.employeemngt.bean.Employee;
import com.cognizant.employeemngt.utils.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Connection connection;
	
	@Override
	public String addEmployee(Employee employee) {
	
		PreparedStatement preparedStatement = null;
		connection  = DBUtils.getConnection();
		
		String insertStatement ="insert into employee (empid,firstname,lastname,salary)" +"values(?,?,?,?)";
		
		try {
			connection.setAutoCommit(true);
			preparedStatement = connection.prepareStatement(insertStatement);
			
			preparedStatement.setInt(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setFloat(4, employee.getSalary());

			int res = preparedStatement.executeUpdate();
			return "success";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeConnection(connection);
		}
		return "fail";
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}

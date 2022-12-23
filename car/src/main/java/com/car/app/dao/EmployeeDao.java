package com.car.app.dao;

import java.util.List;

import com.car.app.entity.Employee;

public interface EmployeeDao {
	
	public boolean createEmployee(Employee employee);

	public boolean deleteEmployee(int no);

	public boolean updateEmployee(Employee employee);

	public Employee findEmployee(int no);
	
	public List<Employee> findAllEmployee();
}

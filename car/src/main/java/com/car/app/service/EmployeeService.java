package com.car.app.service;

import com.car.app.util.EMUtils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.car.app.dao.EmployeeDao;
import com.car.app.entity.Car;
import com.car.app.entity.Employee;

public class EmployeeService implements EmployeeDao {
	public boolean createEmployee(Employee employee) {
		boolean employeeCreated =false;
		EntityManager em = EMUtils.provideEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		employeeCreated = true;
		System.out.println("Employee created");
		em.getTransaction().commit();
		em.close();
		return employeeCreated;
	}

	public boolean deleteEmployee(int no) {
		boolean carDeleted = false;
		EntityManager em = EMUtils.provideEntityManager();
		Employee emp = em.find(Employee.class, no);
		if (emp != null) {
			em.getTransaction().begin();
			em.remove(emp);
			carDeleted = true;
			System.out.println("Employee Deleted");
			em.getTransaction().commit();
			em.close();
		}
		return carDeleted;
	}

	public boolean updateEmployee(Employee employee) {
		boolean employeeCreated =false;
		EntityManager em = EMUtils.provideEntityManager();
		em.getTransaction().begin();
		em.merge(employee);
		employeeCreated = true;
		System.out.println("Employee Updated");
		em.getTransaction().commit();
		em.close();
		return employeeCreated;
	}

	public Employee findEmployee(int no) {
		EntityManager em=EMUtils.provideEntityManager();
		String findEmployee="from Employee where id='"+no+"'"; 
		Query query=em.createQuery(findEmployee);
		return (Employee) query.getSingleResult();
	}

	public List<Employee> findAllEmployee() {
		EntityManager em=EMUtils.provideEntityManager();
		String findEmployee="from Employee"; 
		Query query=em.createQuery(findEmployee); 
		List<Employee> emp=query.getResultList();
		return emp;
	}
}

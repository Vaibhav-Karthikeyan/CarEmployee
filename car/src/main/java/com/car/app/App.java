package com.car.app;

import com.car.app.dao.CarDao;
import com.car.app.dao.EmployeeDao;
import com.car.app.entity.Car;
import com.car.app.entity.Employee;
import com.car.app.service.CarService;
import com.car.app.service.EmployeeService;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarDao dao = new CarService();
		Car car=new Car(1,"ingis","grey",java.sql.Date.valueOf("2017-11-15"));
		dao.updateCar(car);
		EmployeeDao emdao=new EmployeeService();
		Employee emp=new Employee(1,"vaibhav","java",1100,java.sql.Date.valueOf("2017-11-15"));
		emdao.updateEmployee(emp);
		System.out.println(emdao.findEmployee(2));
	}

}

package com.car.app.dao;

import java.util.List;

import com.car.app.entity.Car;

public interface CarDao {

	public boolean createCar(Car car);

	public boolean deleteCar(int no);

	public boolean updateCar(Car car);

	public Car findCar(int no);
	
	public List<Car> findAll();
	
}

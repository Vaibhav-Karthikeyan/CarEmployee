package com.car.app.service;

import com.car.app.util.EMUtils;
import com.car.app.dao.CarDao;
import com.car.app.entity.Car;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CarService implements CarDao {

	@Override
	public boolean createCar(Car car) {
		boolean carCreated = false;
		EntityManager em = EMUtils.provideEntityManager();
		em.getTransaction().begin();
		em.persist(car);
		carCreated = true;
		System.out.println("Car created");
		em.getTransaction().commit();
		em.close();
		return carCreated;
	}

	@Override
	public boolean deleteCar(int no) {
		boolean carDeleted = false;
		EntityManager em = EMUtils.provideEntityManager();
		Car car = em.find(Car.class, no);
		if (car != null) {
			em.getTransaction().begin();
			em.remove(car);
			carDeleted = true;
			System.out.println("Car Deleted");
			em.getTransaction().commit();
			em.close();
		}
		return carDeleted;
	}

	@Override
	public boolean updateCar(Car car) {
		boolean carCreated = false;
		EntityManager em = EMUtils.provideEntityManager();
		em.getTransaction().begin();
		em.merge(car);
		carCreated = true;
		System.out.println("Car updated");
		em.getTransaction().commit();
		em.close();
		return carCreated;
		
	}

	@Override
	public Car findCar(int no) {
		return EMUtils.provideEntityManager().find(Car.class, no);
	}
	
	public List<Car> findAll(){
		EntityManager em=EMUtils.provideEntityManager();
		String findCars="from Car"; 
		Query query=em.createQuery(findCars); 
		List<Car> car=query.getResultList();
		return car;
	}
}

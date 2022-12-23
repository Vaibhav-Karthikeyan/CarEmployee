package com.car.app.entity;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String modelName, color;
	private java.sql.Date makeYear;

	public Car() {

	}

	public Car(int id, String modelName, String color, Date makeYear) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.color = color;
		this.makeYear = makeYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public java.sql.Date getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(java.sql.Date makeYear) {
		this.makeYear = makeYear;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", modelName=" + modelName + ", color=" + color + ", makeYear=" + makeYear + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, id, makeYear, modelName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && id == other.id && Objects.equals(makeYear, other.makeYear)
				&& Objects.equals(modelName, other.modelName);
	}
}

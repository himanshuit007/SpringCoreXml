package com.him.spring.applicationcontext.autowiring;

public class Person {

	Car car;
	Address add;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Address getAdd() {
		return add;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [car=").append(car).append(", add=").append(add).append("]");
		return builder.toString();
	}
	
	public Person(Car car1) {
        this.car=car;
    }

}
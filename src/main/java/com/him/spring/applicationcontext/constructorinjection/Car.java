package com.him.spring.applicationcontext.constructorinjection;

public class Car {
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [name=").append(name).append("]");
		return builder.toString();
	}
	
	
}

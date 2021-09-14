package com.him.spring.applicationcontext.constructorinjection;

public class Contact {
	private int number;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [number=").append(number).append("]");
		return builder.toString();
	}

	public Contact(int number) {
		super();
		this.number = number;
	}
	
}

package com.him.spring.applicationcontext.constructorinjection.inheritance;

public class Customer {

	private String name;

	private String email;

	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {

		return "Name :" + name + " Email :" + email + " Country :" + country;
	}
}
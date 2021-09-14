package com.him.spring.applicationcontext.constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street, city, state, country;

	{
		street = "1";
		city = "Junagadh";
		state = "Gujarat";
		country = "India";
	}

	
	public Address(String street, String city, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [street=").append(street).append(", city=").append(city).append(", state=")
				.append(state).append(", country=").append(country).append("]");
		return builder.toString();
	}

}

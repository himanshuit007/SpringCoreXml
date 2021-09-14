package com.him.spring.applicationcontext.constructorinjection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private String name;
	private int id;
	private Address address;
	private List<Contact> list;
	private Set<Car> set;
	private Map<Integer, String> map;
	private Properties props;

	private List<String> languages;
	private List<Long> phoneNumbers;
	private String[] hobbies;
	private Address[] addresses;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Person(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", id=").append(id).append(", address=").append(address)
				.append(", list=").append(list).append(", set=").append(set).append(", map=").append(map)
				.append(", props=").append(props).append(", languages=").append(languages).append(", phoneNumbers=")
				.append(phoneNumbers).append(", hobbies=").append(Arrays.toString(hobbies)).append(", addresses=")
				.append(Arrays.toString(addresses)).append("]");
		return builder.toString();
	}

	public Person(String name, int id, Address address, List<Contact> list, Set<Car> set, Map<Integer, String> map,
			Properties props, List<String> languages, List<Long> phoneNumbers, String[] hobbies, Address[] addresses) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
		this.props = props;
		this.languages = languages;
		this.phoneNumbers = phoneNumbers;
		this.hobbies = hobbies;
		this.addresses = addresses;
	}

}

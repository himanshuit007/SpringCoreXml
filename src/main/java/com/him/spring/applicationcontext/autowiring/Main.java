package com.him.spring.applicationcontext.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext appconContext = new ClassPathXmlApplicationContext("autowiring.xml");
		for (int i = 1; i < 5; i++) {
			System.out.println(appconContext.getBean("person"+i));
		}
	}
}

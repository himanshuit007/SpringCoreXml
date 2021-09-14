package com.him.spring.applicationcontext.constructorinjection;

import java.io.IOException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.him.spring.applicationcontext.constructorinjection.inheritance.Customer;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("constructorinjection.xml");
//		XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource(
//				"E:\\Programming\\JAVABrainsSpringMicroservicesWS\\SpringCoreXml\\src\\main\\java\\com\\him\\spring\\applicationcontextex\\constructorinjection\\applicationContext.xml"));

		for (int i = 1; i < 7; i++) {

			System.out.println(factory.getBean("p" + i, Person.class));
		}
		System.out.println(factory.getBean("commonAddress", Address.class));
		System.out.println(factory.getBean("customer", Customer.class));
		
		Customer c1=factory.getBean("singletone", Customer.class);
		Customer c2=factory.getBean("singletone", Customer.class);
		System.out.println("\nSingletone scope Objects equal "+(c1==c2));
		
		Customer c3=factory.getBean("prototype", Customer.class);
		Customer c4=factory.getBean("prototype", Customer.class);
		System.out.println("Prototype scope Objects equal "+(c3==c4));
		
		SpringAwareInterfaceImpl springAwareInterfaceImpl = (SpringAwareInterfaceImpl) factory.getBean("springAwareInterfaceImpl");
	       
        springAwareInterfaceImpl.readMessagesSpecificToLocale();
       
        try {
			springAwareInterfaceImpl.getFilePath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		factory.registerShutdownHook();
	}
}

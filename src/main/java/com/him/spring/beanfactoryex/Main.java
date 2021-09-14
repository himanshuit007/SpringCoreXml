package com.him.spring.beanfactoryex;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.him.spring.model.HelloWorld;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext factory=new FileSystemXmlApplicationContext("E:\\Programming\\JAVABrainsSpringMicroservicesWS\\SpringCoreXml\\src\\main\\java\\com\\him\\spring\\applicationcontextex\\applicationContext.xml");
		ApplicationContext factory=new ClassPathXmlApplicationContext("beanfactoryex.xml");
		
		if (factory.containsBean("helloWorld")) {
			HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
			obj.getMessage();

			System.out.println(factory.getBean("h1",HelloWorld.class));
			System.out.println(factory.getBean("h2",HelloWorld.class));
			System.out.println(factory.getBean("h3",HelloWorld.class));

			System.out.println(Arrays.toString(factory.getAliases("helloWorld")));

		}
	}
}

package com.him.spring.applicationcontext.setterinjection;

import java.util.Arrays;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.him.spring.model.HelloWorld;

public class Main {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("setterinjection.xml"));
//		XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource(
//				"E:\\Programming\\JAVABrainsSpringMicroservicesWS\\SpringCoreXml\\src\\main\\java\\com\\him\\spring\\applicationcontextex\\applicationContext.xml"));
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

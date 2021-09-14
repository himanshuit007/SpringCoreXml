package com.him.spring.applicationcontext.constructorinjection;

import java.io.IOException;
import java.util.Locale;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class SpringAwareInterfaceImpl implements BeanNameAware, MessageSourceAware, ResourceLoaderAware {

	private MessageSource messageSource;

	private ResourceLoader resourceLoader;

	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
		System.out.println("setResourceLoader called");

	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
		System.out.println("setMessageSource called");

	}

	public void setBeanName(String beanName) {
		System.out.println("setBeanName called");
		System.out.println("Bean name : " + beanName);

	}

	public void readMessagesSpecificToLocale() {

		String englishGreet = messageSource.getMessage("greeting", new Object[] {"Himanshu"}, Locale.US);

		System.out.println("Greeting in English : " + englishGreet);

		String germanGreet = messageSource.getMessage("greeting", null, Locale.GERMAN);

		System.out.println("Greeting in German : " + germanGreet);
	}

	public void getFilePath() throws IOException {
		Resource resource = resourceLoader.getResource("classpath:file.txt");
		System.out.println("Absolute path of the file :" + resource.getFile().getPath());
		// We can further read this file
	}

}
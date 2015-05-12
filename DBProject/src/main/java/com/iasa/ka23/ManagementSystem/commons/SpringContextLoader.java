package com.iasa.ka23.ManagementSystem.commons;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextLoader {

	static ConfigurableApplicationContext CONTEXT;
	
	public static <T> T getBean(Class<T> class1) {
		return CONTEXT.getBean(class1);	
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String string) {
		return (T) CONTEXT.getBean(string);	
	}

	public static void loadContext() {
		CONTEXT = new ClassPathXmlApplicationContext("beans.xml");
	}

	public static void refreshContext() {
		CONTEXT.refresh();	
	}

	public static boolean contextIsLoaded() {
		return (CONTEXT != null);
	}	
}

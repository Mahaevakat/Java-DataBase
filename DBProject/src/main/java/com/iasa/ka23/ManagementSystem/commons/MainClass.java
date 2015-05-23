package com.iasa.ka23.ManagementSystem.commons;

import static com.iasa.ka23.ManagementSystem.ui.UIManager.*;

import java.util.logging.Logger;

public class MainClass {
	
	 public static void main(final String[] args) {
		Logger.getLogger(MainClass.class.toString()).info("--------loading...-----------"); 
		SpringContextLoader.loadContext();
		openWelcomeFrame();
	}
}




/**
*TODO
*	1)HibernateGenericDao - fix getall
*	2) paginating
*	3) fix Counterparty back
*	5) ADD ASPECTS AND PROXIES FOR INJECTING LOGGERS AND LOGGING
*/
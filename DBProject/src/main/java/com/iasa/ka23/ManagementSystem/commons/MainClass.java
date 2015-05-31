package com.iasa.ka23.ManagementSystem.commons;

import static com.iasa.ka23.ManagementSystem.ui.UIManager.*;

public class MainClass {	
	 public static void main(final String[] args) {
		SpringContextLoader.loadContext();
		openWelcomeFrame();
	}
}

/**
*TODO
*  -3) fix enum compare for user role
*  -2) fix dbmanager class
*  -1) fix setting of session to dbmanager class
*	0) fix sp
*	1) HibernateGenericDao - fix getall
*	2) paginating
*	3) fix Counterparty back
*	5) ADD ASPECTS AND PROXIES FOR INJECTING LOGGERS AND LOGGING
*/
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
*	5) ADD ASPECTS AND PROXIES FOR INJECTING LOGGERS AND LOGGING
*/
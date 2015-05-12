package com.iasa.ka23.ManagementSystem.commons;

import com.iasa.ka23.ManagementSystem.ui.MainJFrame;

public class MainClass {
	
	 public static void main(final String[] args) {
		SpringContextLoader.loadContext();
		new MainJFrame().setVisible(true);;
	}
}




/**
*TODO
*	3) START USING MS SQL
*	4) TURN UI OBJECTS TO SPRING BEANS
*	5) ADD ASPECTS AND PROXIES FOR INJECTING LOGGERS AND LOGGING
*/
package com.iasa.ka23.ManagementSystem.commons;

import com.iasa.ka23.ManagementSystem.ui.MainJFrame;

public class MainClass {
	
	 public static void main(final String[] args) {
		SpringContextLoader.loadContext();
		new MainJFrame().setVisible(true);
	}
}




/**
*TODO
*	5) ADD ASPECTS AND PROXIES FOR INJECTING LOGGERS AND LOGGING
*/
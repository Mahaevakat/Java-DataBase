package com.iasa.ka23.ManagementSystem.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.iasa.ka23.ManagementSystem.bl.service.BusinessService;
import com.iasa.ka23.ManagementSystem.commons.SpringContextLoader;

public abstract class AbstractInterfaceUnit {

	protected BusinessService service;

	protected JPanel windowContent;
	
	protected JFrame frame;
	
	public AbstractInterfaceUnit(){
		service = SpringContextLoader.getBean("businessService");
		windowContent = new JPanel();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public abstract void initComponents();
	
	public void dismiss(){
		frame.setVisible(false);
	}

}
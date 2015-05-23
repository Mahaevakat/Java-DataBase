package com.iasa.ka23.ManagementSystem.ui;

import com.iasa.ka23.ManagementSystem.bl.service.BusinessService;
import com.iasa.ka23.ManagementSystem.commons.SpringContextLoader;

public abstract class AbstractInterfaceUnit extends javax.swing.JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1546547289725120267L;
	protected BusinessService service;
	
	public AbstractInterfaceUnit(){
		service = SpringContextLoader.getBean("businessService");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public abstract void initComponents();

}
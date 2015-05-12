package com.iasa.ka23.ManagementSystem.bl.service;

import com.iasa.ka23.ManagementSystem.commons.SpringContextLoader;

public class ServiceFactory {

	public static BusinessService getBusinessService(){
		return SpringContextLoader.getBean("businessService");
	}

}

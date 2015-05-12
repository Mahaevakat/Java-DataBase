package com.iasa.ka23.ManagementSystem.bl.service;

public class StabServiceFactory {

	public static BusinessService getBusinessService(){
		return BusinessServiceStab.getInstance();
	}
}

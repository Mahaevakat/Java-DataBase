package com.iasa.ka23.ManagementSystem.bl.service;

import java.util.List;

import com.iasa.ka23.ManagementSystem.bl.model.Good;

public class BusinessServiceStab implements BusinessService{
	
	private static final BusinessService SERVICE_INSTANCE = new BusinessServiceStab();
	
	public static BusinessService getInstance(){
		return SERVICE_INSTANCE;
	}
	
	@Override
	public boolean login(String username, String password) {
		return ((username=="kate")&&(password=="12345"));
	}

	@Override
	public Integer getNumberOfGoods() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Good> getAllGoods() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
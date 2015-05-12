package com.iasa.ka23.ManagementSystem.bl.service;

import java.util.List;

import com.iasa.ka23.ManagementSystem.bl.model.Good;

public interface BusinessService {
	
	public Integer getNumberOfGoods();
	
	public List<Good> getAllGoods();

	public boolean login(String username, String password);
	

}

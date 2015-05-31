package com.iasa.ka23.ManagementSystem.bl.service;

import java.util.List;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;

public interface BusinessService {
	
	List<Counterparty> getCounterparties(int onPage, int pageNo);

	boolean login(String username, String password);

	void loadApp();

	boolean addCounterparty(String number, String mail);

	boolean enableHrAdminFeatures();
	

}

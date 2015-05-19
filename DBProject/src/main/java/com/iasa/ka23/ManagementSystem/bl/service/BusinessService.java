package com.iasa.ka23.ManagementSystem.bl.service;

import java.util.List;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;

public interface BusinessService {
	
	public List<Counterparty> getCounterparties(int onPage, int pageNo);

	public boolean login(String username, String password);
	

}

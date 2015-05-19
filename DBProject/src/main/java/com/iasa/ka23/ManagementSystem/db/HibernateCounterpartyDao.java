package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;



public class HibernateCounterpartyDao extends HibernateGenericDao<Counterparty> {

	@Override
	public Class<Counterparty> getType() {		
		return Counterparty.class;
	}
	

	@Override
	protected String getName(Counterparty object) {
		return object.getName();
	}
	
}

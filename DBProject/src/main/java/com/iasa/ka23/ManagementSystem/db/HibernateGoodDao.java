package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.Good;



public class HibernateGoodDao extends HibernateGenericDao<Good> {

	@Override
	public Class<Good> getType() {		
		return Good.class;
	}
	

	@Override
	protected String getName(Good object) {
		return object.getName();
	}
	
}

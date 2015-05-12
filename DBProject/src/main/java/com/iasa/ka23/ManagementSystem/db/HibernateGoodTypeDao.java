package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.GoodType;


public class HibernateGoodTypeDao extends HibernateGenericDao<GoodType> {

	@Override
	public Class<GoodType>getType() {
		return GoodType.class;
	}

	@Override
	protected String getName(GoodType object) {
		return object.getName();
	}

}

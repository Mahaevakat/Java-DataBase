package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.GoodRecord;


public class HibernateGoodRecordDao extends HibernateGenericDao<GoodRecord> {

	@Override
	public Class<GoodRecord> getType(){		
		return GoodRecord.class;
	}

	@Override
	protected String getName(GoodRecord object) {
		return null;
	}

	

}

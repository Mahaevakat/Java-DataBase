package com.iasa.ka23.ManagementSystem.db;

import java.util.HashMap;
import java.util.Map;

import com.iasa.ka23.ManagementSystem.bl.model.IdentifyableBean;
import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDaoException;

public class DaoFactoryImpl implements DaoFactory {
	
	/**
	 * map that contains DAO objects
	 */
	private Map<Class<? extends IdentifyableBean>,GenericDao<? extends IdentifyableBean>> daos;
	
	public DaoFactoryImpl(){
		daos = new HashMap<Class<? extends IdentifyableBean>, GenericDao<? extends IdentifyableBean>>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IdentifyableBean> GenericDao<T> getDao(final Class<T> classVar)
			throws ManagementSystemDaoException {
		if (daos.containsKey(classVar)){
			return (GenericDao<T>) daos.get(classVar);
		}
		else {
			GenericDao<T> dao = new HibernateGenericDao<T>(){
				@Override
				public Class<T> getType() {
					return classVar;
				}};
			daos.put(classVar, dao);
			return dao;			
		}
	}	
	

}

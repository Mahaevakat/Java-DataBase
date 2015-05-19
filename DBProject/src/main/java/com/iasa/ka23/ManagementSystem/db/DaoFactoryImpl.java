package com.iasa.ka23.ManagementSystem.db;


import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;
import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDaoException;

public class DaoFactoryImpl implements DaoFactory {	
	

	GenericDao<Counterparty> counterpatyDao;
	
	private GenericDao<Counterparty> goodDao;
	
	public GenericDao<Counterparty> getGoodDao() {
		return counterpatyDao;
	}

	public void setGoodDao(GenericDao<Counterparty> goodDao) {
		this.goodDao = goodDao;
	}


	@Override
	public GenericDao<Counterparty> getGoodDaoExtended(){
		return goodDao;
	}


	@Override
	public GenericDao<Counterparty> getCounterpartyDao()
			throws ManagementSystemDaoException {
		// TODO Auto-generated method stub
		return null;
	}	

}

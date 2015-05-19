package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;
import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDaoException;

public interface DaoFactory {
    public GenericDao<Counterparty> getGoodDao() throws ManagementSystemDaoException;
	public GenericDao<Counterparty> getGoodDaoExtended() throws ManagementSystemDaoException;
	public GenericDao<Counterparty> getCounterpartyDao()throws ManagementSystemDaoException;
}

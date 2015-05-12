package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.Good;
import com.iasa.ka23.ManagementSystem.bl.model.GoodRecord;
import com.iasa.ka23.ManagementSystem.bl.model.GoodType;
import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDaoException;

public interface DaoFactory {
    public GenericDao<GoodType> getGoodTypeDao() throws ManagementSystemDaoException;
    public GenericDao<Good> getGoodDao() throws ManagementSystemDaoException;
    public GenericDao<GoodRecord> getGoodRecordDao() throws ManagementSystemDaoException;
	public GenericDao<Good> getGoodDaoExtended() throws ManagementSystemDaoException;
	public GenericDao<GoodType> getGoodTypeExtraDao() throws ManagementSystemDaoException;
}

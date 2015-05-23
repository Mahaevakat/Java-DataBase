package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.IdentifyableBean;
import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDbException;

public interface DaoFactory {
    public <T extends IdentifyableBean> GenericDao<T> getDao(Class<T> classVar) 
    		throws ManagementSystemDbException;
}

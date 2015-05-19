package com.iasa.ka23.ManagementSystem.bl.service;

import java.util.List;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;
import com.iasa.ka23.ManagementSystem.db.GenericDao;
import com.iasa.ka23.ManagementSystem.db.util.DataBaseManager;
import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDaoException;

public class BusinessServiceImpl implements BusinessService{

	private DataBaseManager databaseManager;

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DataBaseManager getDatabaseManager() {
		return databaseManager;
	}

	public void setDatabaseManager(DataBaseManager databaseManager) {
		this.databaseManager = databaseManager;
	}

	public Integer getNumberOfGoods(){
		Integer value = null;
		try {
			//daoFactory = SpringContextLoader.getBean("daoFactory");
			System.out.println(databaseManager);
			GenericDao<Counterparty> dao = databaseManager.getCounterpartyDao();
			value = dao.getAll().size();
		} catch (ManagementSystemDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	@Override
	public List<Counterparty> getCounterparties(int onPage, int pageNo) {
		GenericDao<Counterparty> dao;
		List<Counterparty> result = null;
		try {
			dao = databaseManager.getCounterpartyDao();
			result  = dao.getAll();
		} catch (ManagementSystemDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean login(String username, String password) {
		user.setUsername(username);
		user.setPassword(password);
		return databaseManager.login();
	}
}

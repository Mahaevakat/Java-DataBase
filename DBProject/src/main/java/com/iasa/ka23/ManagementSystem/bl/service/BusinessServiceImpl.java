package com.iasa.ka23.ManagementSystem.bl.service;

import java.util.List;

import javax.management.relation.Role;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;
import com.iasa.ka23.ManagementSystem.db.DaoFactoryImpl;
import com.iasa.ka23.ManagementSystem.db.GenericDao;
import com.iasa.ka23.ManagementSystem.db.util.DataBaseManager;
import com.iasa.ka23.ManagementSystem.db.util.ManagementSystemDbException;

public class BusinessServiceImpl implements BusinessService{

	private DataBaseManager databaseManager;
	
	private static int id = 2000;

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
			GenericDao<Counterparty> dao = databaseManager.getDao(Counterparty.class);
			value = dao.getAll().size();
		} catch (ManagementSystemDbException e) {
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
			dao = databaseManager.getDao(Counterparty.class);
			result  = dao.getAll();
		} catch (ManagementSystemDbException e) {
			// TODO Auto-generated catch block
			//TODO - change to paginated
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
	
	private void loadUser(){
		//TODO - fix this stub		
		/*
		System.out.println("counterparty with id=1: email");
		Counterparty counterparty = databaseManager.getCounterpartyByStoredProcedure();
		System.out.println(counterparty.getEmail());
		*/
		databaseManager.loadUserRole();
	}
	
	@Override
	public boolean enableHrAdminFeatures(){
		return Authentificator.isHrAdmin();
	}

	/**
	 * All logic in this method is being executed only one - when app has booted normally 
	 * and needs to perform some additional actions.
	 */
	@Override
	public void loadApp() {
		loadUser();		
	}


	//TODO - move bl logic to bl layer
	@Override
	public boolean addCounterparty(String number, String mail) {
		if (number==null){
			return false;
		}
		if (mail==null){
			return false;
		}
		Integer phone = null;
		try{
		phone = Integer.parseInt(number);
		}catch (Exception e){
			return false;
		}
		Counterparty c = new Counterparty();
		c.setId(id++);
		c.setEmail(mail);
		c.setNumber(phone);
		GenericDao<Counterparty> dao  = null;
		try {
			dao = databaseManager.getDao(Counterparty.class);
			dao.create(c);
		} catch (ManagementSystemDbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
}

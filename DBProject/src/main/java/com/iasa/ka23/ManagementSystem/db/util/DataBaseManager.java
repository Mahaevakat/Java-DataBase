package com.iasa.ka23.ManagementSystem.db.util;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;
import com.iasa.ka23.ManagementSystem.bl.service.User;
import com.iasa.ka23.ManagementSystem.db.DaoFactory;
import com.iasa.ka23.ManagementSystem.db.GenericDao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataBaseManager {
	
	/**
	 * DataBaseManager is facade between Data and Business layers.
	 */
	
	private User user;

	private DaoFactory daoFactory;

	private SessionFactory sessionFactory;
	
	private DataSource dataSource;
	
	public boolean login(){
			return testConnection();
	}

	private boolean testConnection() {
		try{
			String username = user.getUsername();
			String password = user.getPassword();
			((DriverManagerDataSource)dataSource).setUsername(username);
			((DriverManagerDataSource)dataSource).setPassword(password);
			String url = ((DriverManagerDataSource)dataSource).getUrl();
			url+=";user=" + username + ";password=" + password;
			((DriverManagerDataSource)dataSource).setUrl(url);
			System.out.println((((DriverManagerDataSource)dataSource).getUrl()));
			dataSource.getConnection();
		} catch (SQLException exception){
			Logger.getLogger(getClass()).error(exception);
			return false;
		}
		return true;
	}

	public GenericDao<Counterparty> getCounterpartyDao() throws ManagementSystemDaoException {
		return daoFactory.getCounterpartyDao();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}

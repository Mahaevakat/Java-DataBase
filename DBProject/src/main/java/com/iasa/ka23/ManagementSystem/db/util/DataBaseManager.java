package com.iasa.ka23.ManagementSystem.db.util;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

import com.iasa.ka23.ManagementSystem.bl.model.IdentifyableBean;
import com.iasa.ka23.ManagementSystem.bl.model.RoleEntity;
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
	
	private Session session;
	
	public boolean login(){
			return testConnection();
	}

	private boolean testConnection() {

		String url = null;
		try{
			String username = user.getUsername();
			String password = user.getPassword();
			((DriverManagerDataSource)dataSource).setUsername(username);
			((DriverManagerDataSource)dataSource).setPassword(password);
			url = ((DriverManagerDataSource)dataSource).getUrl();
			String newUrl = url + ";user=" + username + ";password=" + password;
			((DriverManagerDataSource)dataSource).setUrl(newUrl);
			dataSource.getConnection();
		} catch (SQLException exception){
			Logger.getLogger(getClass()).error(exception);
			((DriverManagerDataSource)dataSource).setUrl(url);			
			return false;
		}
		return true;
	}
	
	//TODO - fix this crap!
	public void loadUserRole(){
		Query query  = null;
		String username;
		try{
			query = session.createSQLQuery("EXEC dbo.GetRoleOfCurrentUser")//()
					.addEntity(RoleEntity.class)
					.addScalar("role_name",Hibernate.STRING)					
					.setParameter(0, 0);
		} catch (Exception e){
			Logger.getLogger(this.getClass()).error(e);
			System.err.println(e);
		}
		@SuppressWarnings("unchecked")
		List<String> result = (List<String>)query.list();
		String role = result.get(0);
		System.out.println("role is" + role);
		user.setRoleByName(role);
	}
	public <T extends IdentifyableBean> GenericDao<T> getDao(Class<T> classVar) throws ManagementSystemDbException{
		return daoFactory.getDao(classVar);
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

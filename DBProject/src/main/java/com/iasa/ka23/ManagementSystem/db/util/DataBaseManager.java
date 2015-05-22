package com.iasa.ka23.ManagementSystem.db.util;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.iasa.ka23.ManagementSystem.bl.model.IdentifyableBean;
import com.iasa.ka23.ManagementSystem.bl.service.User;
import com.iasa.ka23.ManagementSystem.db.DaoFactory;
import com.iasa.ka23.ManagementSystem.db.GenericDao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@NamedNativeQueries({
	@NamedNativeQuery(
	name = "getUserRole",
	query = "CALL GetUserRoleByName(:name)",
	resultClass = String.class
	)
})
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
	
	public void loadUserRole(){
		Query query = session.getNamedQuery("callStockStoreProcedure")
			.setParameter("name", user.getUsername());
		@SuppressWarnings("unchecked")
		List<String> result = (List<String>)query.list();
		String role = result.get(0);
		user.setRole(role);
	}
	public <T extends IdentifyableBean> GenericDao<T> getDao(Class<T> classVar) throws ManagementSystemDaoException{
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

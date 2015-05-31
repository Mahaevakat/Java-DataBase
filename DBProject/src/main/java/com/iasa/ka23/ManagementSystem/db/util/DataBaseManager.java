package com.iasa.ka23.ManagementSystem.db.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.jdbc.Work;
import org.hibernate.type.StringType;

import com.iasa.ka23.ManagementSystem.bl.model.Counterparty;
import com.iasa.ka23.ManagementSystem.bl.model.IdentifyableBean;
import com.iasa.ka23.ManagementSystem.bl.service.User;
import com.iasa.ka23.ManagementSystem.db.DaoFactory;
import com.iasa.ka23.ManagementSystem.db.GenericDao;
import com.iasa.ka23.ManagementSystem.db.HibernateGenericDao;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DataBaseManager {
	
	/**
	 * DataBaseManager is facade between Data and Business layers.
	 */
	
	private User user;

	private DaoFactory daoFactory;

	private SessionFactory sessionFactory;
	
	private DataSource dataSource;
	
	private static Session session;	
	
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
	
	public void loadUserRole(){
		session = HibernateGenericDao.getSessionFactory().openSession();	
		/*
		session.doWork(
			    new Work() {
			        public void execute(Connection connection) throws SQLException 
			        { 
			        	CallableStatement call = connection.prepareCall( "{? = call [dbo].[GetRoleOfCurrentUser]}");
			        	call.registerOutParameter(1, Types.JAVA_OBJECT);
			    		call.execute();	
			    		String result = call.getObject(1).toString();
			    		System.out.println(result.getClass());
			    		user.setRoleByName(result);
			        }
			    }
			);
			*/
		
		/*EXAMPLES FROM THE INTERNET*/
		
		Query query = session.createSQLQuery(
				"{call [dbo].[GetRoleOfCurrentUser] }")  
				.addScalar("role_name", StringType.INSTANCE);			 
			List<Object> list = query.list();
	        user.setRoleByName( (String)list.get(0));
		
		/*
		@SuppressWarnings("unchecked")
		List<RoleEntity> list = session
        .createSQLQuery("{call [dbo].[GetRoleOfCurrentUser] }")
        .addScalar("role_name", org.hibernate.type.StringType.INSTANCE)
        .setResultTransformer(Transformers.aliasToBean(RoleEntity.class))
        .list();
        RoleEntity result =  list.get(0);
        user.setRoleByName(result.role_name);
        */
        
	}
	
	@SuppressWarnings("unchecked")
	public Counterparty getCounterpartyByStoredProcedure(){
		/*Query query  = null;
		session = HibernateGenericDao.getSessionFactory().openSession();	
		try{
			query = session.createSQLQuery("{CALL [dbo].[GetCounterparty][(:id)]}")//()
					.addEntity(Counterparty.class)
					.setParameter("id", "1");
		} catch (Exception e){
			Logger.getLogger(this.getClass()).error(e);
			System.err.println(e);
		}
		@SuppressWarnings("rawtypes")
		List resultList = query.list();	
		return (Counterparty)resultList.get(0);*/
		session = HibernateGenericDao.getSessionFactory().openSession();	
		final Counterparty result = null;
		session.doWork(
			    new Work() {
			        public void execute(Connection connection) throws SQLException 
			        { 
			        	CallableStatement call = connection.prepareCall( "{call [dbo].[GetCounterparty][(:id)]}");
			        	call.registerOutParameter(1,Types.JAVA_OBJECT,"dbo.Counterparty");
			        	call.setInt(1, 1);
			    		call.execute();
			    		//result = (Counterparty)call.getBlob(1);
			        }
			    }
			); 
		return result;
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

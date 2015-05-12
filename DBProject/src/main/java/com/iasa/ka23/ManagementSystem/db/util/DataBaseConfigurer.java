package com.iasa.ka23.ManagementSystem.db.util;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.iasa.ka23.ManagementSystem.bl.service.User;
 
@Configuration
@ComponentScan({ "com.iasa.*" })
@EnableTransactionManagement
public class DataBaseConfigurer {
	
	@Autowired
	private User user;

	@Autowired
	private DataSourceConfigHolder holder;
	
	public DataSourceConfigHolder getHolder() {
		return holder;
	}

	public void setHolder(DataSourceConfigHolder holder) {
		this.holder = holder;
	}

	public User getUser() {
		return user;
	}
 
    public void setUser(User user1) {
    	user = user1;
	}
 
	@Bean(name = "dataSource")
	public DriverManagerDataSource dataSource() { 
		DriverManagerDataSource ds = new DriverManagerDataSource();
	    ds.setDriverClassName(holder.getDriverClassName());
		ds.setUrl(holder.getUrl());
		ds.setUsername(user.getUsername());
		ds.setPassword(user.getPassword());
		return ds;
	}
}
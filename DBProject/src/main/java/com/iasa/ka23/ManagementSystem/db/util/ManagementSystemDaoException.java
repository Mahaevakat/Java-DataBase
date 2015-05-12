package com.iasa.ka23.ManagementSystem.db.util;

import java.sql.SQLException;

public class ManagementSystemDaoException extends SQLException {

	/**
	 * This exception is being thrown when something goes wrong in DAO layer
	 */
	private static final long serialVersionUID = 3721318380589654405L;

	public ManagementSystemDaoException(SQLException e) {
		super(e);
	}

	public ManagementSystemDaoException(String string) {
		super(string);
	}

	public ManagementSystemDaoException(Exception e) {
		super(e);
	}
	

}

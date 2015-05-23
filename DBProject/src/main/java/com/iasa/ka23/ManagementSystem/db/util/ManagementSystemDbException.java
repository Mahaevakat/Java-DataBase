package com.iasa.ka23.ManagementSystem.db.util;

import java.sql.SQLException;

public class ManagementSystemDbException extends SQLException {

	/**
	 * This exception is being thrown when something goes wrong in DAO layer
	 */
	private static final long serialVersionUID = 3721318380589654405L;

	public ManagementSystemDbException(SQLException e) {
		super(e);
	}

	public ManagementSystemDbException(String string) {
		super(string);
	}

	public ManagementSystemDbException(Exception e) {
		super(e);
	}
	

}

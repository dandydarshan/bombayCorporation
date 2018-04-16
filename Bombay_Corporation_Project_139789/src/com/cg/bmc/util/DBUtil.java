package com.cg.bmc.util;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.cg.bmc.exception.FirmException;

/*
 * DBUtil class to access a connection pool 
 */
public class DBUtil {
	static Connection connection;

	public static Connection obtainConnection() throws FirmException {
		try {
			InitialContext context = new InitialContext();
			DataSource source = (DataSource) context.lookup("java:/OracleDS");
			connection = source.getConnection();
		} catch (NamingException e) {
			throw new FirmException("Error while creating datasource:"
					+ e.getMessage());
		} catch (SQLException e) {
			throw new FirmException("Error while obtaining connection:"
					+ e.getMessage());
		}
		return connection;
	}
}

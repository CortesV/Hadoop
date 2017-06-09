package com.devcortes.hadoop.hadoopservice.hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class HiveJdbcClient {

	private static final Logger LOGGER = Logger.getLogger(HiveJdbcClient.class);

	private static String driverName = "org.apache.hadoop.hive.jdbc.HiveDriver";

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			LOGGER.info(e.getMessage());
			throw new RuntimeException();
		}
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://sb-db01.softbistro.online/vechicle?useUnicode=yes&characterEncoding=UTF-8", "root",
				"rotrotrot");
	    Statement stmt = con.createStatement();
	    String tableName = "testHiveDriverTable";
	}
}

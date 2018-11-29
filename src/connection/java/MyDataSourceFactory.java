package connection.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MyDataSourceFactory {

	public static DataSource getMySQLDataSource() {

		Properties props = new Properties();
		FileInputStream fis = null;
		MysqlDataSource mysqlIDS = null;

		try {
			fis = new FileInputStream("db.properties");
			props.load(fis);
			mysqlIDS = new MysqlDataSource();
			mysqlIDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlIDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlIDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mysqlIDS;
	}

	public static DataSource getMyOracleDataSource() {

		Properties props = new Properties();
		FileInputStream fis = null;
		MysqlDataSource oracleIDS = null;

		try {
			fis = new FileInputStream("db.properties");
			props.load(fis);
			oracleIDS = new MysqlDataSource();
			oracleIDS.setURL(props.getProperty("ORACLE_DB_URL"));
			oracleIDS.setUser(props.getProperty("ORACLE_DB_USERNAME"));
			oracleIDS.setPassword(props.getProperty("ORACLE_DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return oracleIDS;
	}

}

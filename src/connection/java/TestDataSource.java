package connection.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class TestDataSource {

	public static void main(String[] args) {

		TestDataSource.testDataSource("mysql");
		System.out.println("**********");
		TestDataSource.testDataSource("oracle");

	}

	private static void testDataSource(String dbType) {
		DataSource ds = null;
		if ("mysql".equals(dbType)) {
			ds = MyDataSourceFactory.getMySQLDataSource();
		} else if ("oracle".equals(dbType)) {
			ds = MyDataSourceFactory.getMyOracleDataSource();
		} else {
			System.err.println("Type de BDD invalide");
			return;
		}

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			con = ds.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select numemp, nomemp from employe");

			while (rs.next()) {
				System.out.println("N° employe =" + rs.getString("numemp") + ", nom = " + rs.getString("nomemp"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}

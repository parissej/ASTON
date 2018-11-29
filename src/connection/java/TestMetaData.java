package connection.java;

// TOUS VOS IMPORT LIES AU JDBC DOIVENT PROVENIR DE :
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMetaData {
	// Cette classe n'a aucun attribut
	public static void main(String[] args) {
		// Nom du driver pour acceder a la base de donnees.
		// Lire la documentation associee a sa base de donnees pour le connaitre
		final String dbDriver = "com.mysql.jdbc.Driver"; // Nom long d'une classe
		// URL d'access a la base de donnees.
		final String dbName = "base_exemple"; // Le nom de la base
		final String dbUrl = "jdbc:mysql://localhost/" + dbName; // L'url de la base
		// Login d'access a la base de donnees.
		final String dbLogin = "root"; // Ou "SA" en HSQL
		// Mot de passe d'access a la base de donnees.
		final String dbPwd = "root"; // Ou "" en HSQL

		try {
			Class.forName(dbDriver);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Connection connection = null;
		ResultSet resultat = null;

		try {
			connection = DriverManager.getConnection(dbUrl, dbLogin, dbPwd);

			DatabaseMetaData dbmd = connection.getMetaData();
			String table[] = { "VIEW" };
			resultat = dbmd.getTables(null, null, null, table);

			while (resultat.next()) {
				System.out.println(resultat.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultat != null) {
				try {
					resultat.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
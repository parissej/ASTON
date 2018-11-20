package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			InputStream fis = new FileInputStream("db.properties");
			prop.load(fis);
			System.out.println(prop.getProperty("MYSQL_DB_DRIVER_CLASS"));
			System.out.println(prop.getProperty("ORACLE_DB_DRIVER_CLASS"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

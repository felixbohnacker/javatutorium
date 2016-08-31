package javatutorium.datenbanken;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HSQLDBConnector {

	public static Connection returnConnection() throws ClassNotFoundException, SQLException {
		Connection c = null;
		
		Class.forName("org.hsqldb.jdbcDriver");

		c = DriverManager.getConnection("jdbc:hsqldb:mem:.", "SA","");
			
		
		return c;
	}
}


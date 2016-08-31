package javatutorium.datenbanken;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonenDAO {

	// klar, neue Variable
	Connection con;
	Statement statement;

	// Konstruktor
	public PersonenDAO() {

		try {
			con = HSQLDBConnector.returnConnection();
			statement = con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void savePerson() throws SQLException{
		statement.executeQuery("INSERT INTO PUBLIC.PERSON (vorname, nachname) VALUES ('Daniel', 'Duesentrieb')");
	}
	
	

}

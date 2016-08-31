package javatutorium.datenbanken;

import java.sql.SQLException;

public class DatenbankShit {

	public static void  main (String[] args){
		try {
			PersonenDAO p = new PersonenDAO();
			p.savePerson();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

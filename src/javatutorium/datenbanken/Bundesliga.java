package javatutorium.datenbanken;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Bundesliga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			setBundesligarangliste("VfB Stuttgart", 36);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void setBundesligarangliste(String verein, int punkte) throws SQLException, ClassNotFoundException {
		Connection con = HSQLDBConnector.returnConnection();
		PreparedStatement stamt = con.prepareStatement("INSERT INTO bundesligarangliste (verein, punkte) VALUES (?,?)");
		stamt.setString(1, verein);
		stamt.setInt(2, punkte);
		stamt.executeQuery();
	}
}

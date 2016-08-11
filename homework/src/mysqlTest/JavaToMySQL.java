package mysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JavaToMySQL {
 
	// подключение к базе.
	private static final String url = "jdbc:mysql://localhost:3306/javap";
    private static final String user = "root";
    private static final String password = "";
 
    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
	public static String[] select = new String[4];
 
	public static void main(String args[]) {
		String query = "select * from customs";
 
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);
 
            // getting Statement object to execute query
            stmt = con.createStatement();
 
            // executing SELECT query
            rs = stmt.executeQuery(query);

			int i = 0;

            while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String distance = rs.getString(3);
				// System.out.printf("id: %d, name: %s, distance: %s %n", id,
				// name, distance);
				i++;
				select[i] = rs.getString(2);
				System.out.println(select[i]);
            }
 
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }

 
}
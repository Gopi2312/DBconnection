package assignment.dbconnection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.logging.*;
public class DBConnection {
	String database;
	String username;
	String password;
	Connection con = null;
	Logger log = Logger.getLogger("hi");
	private DBConnection(String database,String username, String password) {
		this.database = database;
		this.username = username;
		this.password = password;
	}
	public static DBConnection getInstance(String database,String username, String password) {
		return new DBConnection(database,username,password);
	}
	
	void connection()
	{
		try {
			con = DriverManager.getConnection(database,username,password);
			System.out.println("Connection Established");
		} 
		catch (Exception e) {
			log.info(e);
		}	
	}
	
	void close()
	{
		try {
			con.close();
			log.info("Closed");
		} 
		catch (Exception e) {
			log.info(e);
		}
	}
}

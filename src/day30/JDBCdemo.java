package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCdemo {
//create a connection
// Create statement 
//Exicute statement
//close connection-
	public static void main(String[] args) throws SQLException {
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","mysql","root");
	Statement stmt= con.createStatement(); 
	String insert_queary="insert into jobs values(\"MAN\",\"MANAGER\",2500,5000)";
	stmt.execute(insert_queary);
	con.close();
	System.out.println("Done!!!!!");
		
		
		
	}

}


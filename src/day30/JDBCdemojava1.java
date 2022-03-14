package day30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemojava1 {

	public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	Statement stms=con.createStatement();
	String Select_queary="Select * from jobs";
	ResultSet rs=stms.executeQuery(Select_queary);  
	while(rs.next())
	{
		String job_id=rs.getString("job_id");
		String jobtitle =rs.getString("job_title");
		int minsalar =rs.getInt("min_salary");
		int maxsalar =rs.getInt("max_salary");
		System.out.println(job_id+"   "+jobtitle+"   "+minsalar+"   "+maxsalar);
		}
		
		
	}

	}



   

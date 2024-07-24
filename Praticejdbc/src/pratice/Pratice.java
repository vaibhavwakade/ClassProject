package pratice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Pratice {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//loader driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connection built;
		Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","system");
		
		System.out.println(co);
		
		//creation Statement
		Statement  st= co.createStatement();
//		int  row = st.executeUpdate("create database jdbcpratice");
		
		int  row1 = st.executeUpdate("use jdbcproject");
		System.out.println(row1);
		int executeUpdate = st.executeUpdate("update  Student set name='xyz' where id=102 ");
		
		System.out.println(executeUpdate);
		
		st.executeUpdate("delete from Student where id=102 ");
		
		
	}

}

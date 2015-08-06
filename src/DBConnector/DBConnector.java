package DBConnector;

import java.sql.*;

public class DBConnector {
	
	public void test() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}

package finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TrainDAO {

	 static final String Driver_Name="com.mysql.cj.jdbc.Driver";
	 static final String DB_URL="jdbc:mysql://localhost:3306/train";
	 static final String USER_NAME="root";
	 static final String PASSWORD="root";
	Train findTrain(int trainNo) {
		Train train= null;
		
		try
		{
			//Step-1 load the driver class
			Class.forName("Driver_Name");  
			System.out.println("class found");

		
		//step-2 get the connection with the database
			Connection con=DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connected");
			//step 3
			PreparedStatement ps=con.prepareStatement("Select * from trains where train_no=?");
			ps.setInt(1, trainNo);
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				
				train =new Train(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(5),rs.getInt(5));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		return train;
	}
		
	
	}
	
	

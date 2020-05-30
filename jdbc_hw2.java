package codeforce;
import java.sql.*;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

import java.util.Scanner;
public class jdbc_hw2 {
	
	//program to upload to and download a file from DB 
	//using jdbc
	
	public static void main(String[] args) throws SQLException, IOException 
	{
		//create connection string 
		String DB_driver_conn = "jdbc:mysql://localhost:3306/httperrcode" ; 
		//if class is not found
		//driver not found
		try 
		{
		//just trying a workaround for a broken implementation
		 Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			//System.out.println(e);
			e.printStackTrace();
		}
		//database 
		
		Connection newconn = DriverManager.getConnection(DB_driver_conn,"root","root");
		String s1 = "CREATE TABLE if not exists errcodes (code_st int PRIMARY KEY, code_status VARCHAR(24))";
		//creating table for this assignment
	     Statement newstatement = newconn.createStatement();
	     newstatement.execute(s1);

		
		//crreate file 
		File newfile = new File("D:\\Eclipse_workspace\\Tekandco\\src\\sample.txt");
		if(newfile.createNewFile())
		{
			System.out.println("File is created");
		}
		//write data into file 
		//same database HTTPerrcodes 
		//same table errcodes
		FileWriter fwrite = new FileWriter("D:\\Eclipse_workspace\\Tekandco\\src\\sample.txt"); 
		fwrite.write("100 Continue"); 
		//open a scanner object to read file 
		
		fwrite.close();
		
		Scanner newscan = new Scanner(newfile);
		while(newscan.hasNextLine())
		{
			//using prepared statement 
			PreparedStatement newps = newconn.prepareStatement("insert into errcodes values(?,?)"); 
			newps.setInt(1,Integer.parseInt(newscan.next()));
			newps.setString(2,  newscan.next());
			newps.executeUpdate();
		}
		
		newscan.close();
		//Download data from database
		//using result set 
		PreparedStatement readps = newconn.prepareStatement("Select * from errcodes");
		
		ResultSet myrs = readps.executeQuery();
		
		//read file from result ser 
		
		while(myrs.next())
	     {
	    	 System.out.println(myrs.getInt("code_st")+":"+myrs.getString("code_Status"));
	     }
	    
		
		
	     

		
	}

}

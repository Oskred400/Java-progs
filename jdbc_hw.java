package codeforce;



import java.sql.*;
import java.util.Scanner;


public class jdbc_hw 
{
	//user = root
	//pass = root
	public static void main(String[] args)  throws ClassNotFoundException, SQLException
	{
	//httperrcode is name of database
	String DB_driver_conn = "jdbc:mysql://localhost:3306/httperrcode" ;
		//String DB_driver_conn = "jdbc:mysql://localhost:3306/sys" ;
	
	try 
	{
	//just trying a workaround for a broken implementation
	 Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch(Exception e)
	{
		System.out.println("Exception");
		System.out.println(e);
	}
     Connection connection = DriverManager.getConnection(DB_driver_conn, "root", "root");
     String s1 = "CREATE TABLE if not exists errcodes (code_st int PRIMARY KEY, code_status VARCHAR(24))";

     Statement newstatement = connection.createStatement();
     newstatement.execute(s1);
     
   //Insert Statement
     //String s3 = "insert into errcodes values(200,'HTTP OK')";
     //newstatement.execute(s3);
     
     //prepared statement 
     
     String s4 = "insert into errcodes values (?,?)";
     PreparedStatement ps = connection.prepareStatement(s4);
     ps.setInt(1, 302);
     ps.setString(2, "Not accessible");
     //ps.setFloat(3, 950000);
     ps.executeUpdate();
      
     /*
     String s2 = "Select * from errcodes";
     ResultSet myrs =newstatement.executeQuery(s2);
     while(myrs.next())
     {
    	 System.out.println(myrs.getInt("code_st")+":"+myrs.getString("code_Status"));
     }*/
     //implement callable statement
     //stored procedure 
     //using scanner class
     /*This is stored procedure.
      * Database is httperrcode. Proc is add_code.
      * Delimiter $$
      * create procedure httperrcode.add_code(in code_err int, in stat_name varchar(20)) 
      * BEGIN insert into errcodes values(code_err, stat_name); END $$
      * */
     //scanner to inpiut values 
     //callable statement 
     CallableStatement newcs = connection.prepareCall("call add_code(?,?)");
     
     Scanner newscan = new Scanner(System.in);
     //input code status 
     System.out.println("Enter HTTPERR code");
     int newcode = newscan.nextInt();
     System.out.println("enter http status");
     String newstatus = newscan.nextLine();
     
     newcs.setInt(1, newcode);
     newcs.setString(2, newstatus);
     
     newcs.executeUpdate();
     
     //Result set
     

     String s2 = "Select * from errcodes";
     ResultSet myrs =newstatement.executeQuery(s2);
     while(myrs.next())
     {
    	 System.out.println(myrs.getInt("code_st")+":"+myrs.getString("code_Status"));
     }
    
     
     
     newscan.close();
     

}
	}

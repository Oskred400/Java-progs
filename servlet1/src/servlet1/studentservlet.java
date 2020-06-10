package servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class studentservlet extends HttpServlet {
	
	//store student id and name 
	HashMap<Integer, String> stumap = new HashMap<Integer, String>(); 
	
	public studentservlet()
	{
		super();
		//Some sort of method stub 
	}
	//Get request
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//for form where you entered student id and name 
		int stu_id = Integer.parseInt(req.getParameter("stu_id")); 
		String stu_name = req.getParameter("stu_name"); 
		//call doGet() result in do_post method here 
		//print here 
		
		PrintWriter pw = res.getWriter();
		//pw.println("Student id: "+stu_id+" Student name: "+stu_name);
		//add to hashmap
		stumap.put(stu_id, stu_name);
		//print out hashmap 
		pw.println(stumap);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//method stub that is available at servlet creation 
		doGet(req, res);
	} 
	// for the delete method 
	//just a confirmation page that it has been deleted.
	//based on id 
	
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		//continue 
		doGet(req, res);
		
		//delete student record whose student id is stu_id 
		String s = req.getParameter("stu_id");
		int stu_id = Integer.parseInt(s);
		
		//display records after delete from hashmap using iterator 
		//String s = req.getParameter(name)
		PrintWriter pw = res.getWriter(); 
		//display the current mapings 
		pw.println(stumap); 
		//then after stu_id is removed. 
		String name_removed = (String)stumap.remove(stu_id);
		pw.println("deleted "+name_removed);
		//print map 
		
		pw.println("\n\n+"+stumap);
		
		
	}
	
	protected void doPut(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		//update student name using stu_id 
		
		doGet(req, res);
		String s = req.getParameter("stu_id");
		
		int stu_id = Integer.parseInt(s); 
		
		//get the new name 
		String sname = req.getParameter("stu_name"); 
		
		//servlet response
		PrintWriter pw = res.getWriter();
		
		//check if key exists 
		if(stumap.containsKey(stu_id))
		{
		//if exists replace
			stumap.replace(stu_id, sname);
			//print map
			pw.println(stumap);
		}
		//if not error
		else
		{
			pw.println("Stu_id not found");
		}
		
		
		

		
		
		
	}
	
	

}

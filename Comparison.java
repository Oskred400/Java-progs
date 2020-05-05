import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

//Reference class here
//book review
class book implements Comparable<book>
{
	//book rating 
	private int rating;
	//book name
	private String name;
	//book release year 
	private int year;
	
	//because we have Comparable interface, we need to have
	//compareTo() method as well 
 
	@Override
	public int compareTo(book o) {
		// TODO Auto-generated method stub
		//return difference in years
		return (this.year-o.year);
	}
	//parameterized constructor 
	public book(int rate, String bname, int byear)
	{
		this.rating = rate;
		this.name = bname;
		this.year = byear;
		
	}
	//methods to retrieve private 
	//data members 
	public int getrate()
	{
		return this.rating;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public int getyear()
	{
		return this.year;
	}
}
//Comparator interface implementation 
//compare books by rates
class ratebooks implements Comparator<book>
{

	@Override
	public int compare(book o1, book o2) {
		// TODO Auto-generated method stub
		int result = o1.getrate()-o2.getrate();
		if(result<0) 
		{ return -1; } 
		if(result>0)
		{
			return 1;
		}
		else
			return 0;
	}
	//implemented unimplemented methods 
	
	
}


//Driver class here
public class Comparison {
	
	
	public static void main(String[] args)
	{
		//go for some sort of a list for Books 
		List<book> book_list = new ArrayList<book>();
		
		//add some book names and their members 
		//parameterized constructor comes of use here
		book e1 = new book(3, "Vanish", 2005);
		book e2 = new book(4, "Surgeon", 2004);
		book e3 = new book(4, "Smile", 2006);
		//book_list.add(new book(3, "Vanish", 2005)); 
		//add books to book list 
		book_list.add(e1);
		book_list.add(e2);
		book_list.add(e3);
		
		//sort book list 
		Collections.sort(book_list);
		
		//print book_list 
		//sorted list based on years
		for(book b: book_list)
		{
			int rate = b.getrate();
			String name = b.getname();
			int year = b.getyear();
			System.out.println(rate+":"+name+":"+year);
		}
		/*output
		 * 4:Surgeon:2004
3:Vanish:2005
4:Smile:2006

		 * 
		 * */
		//new list for books 
		List<book> book_new_list = new ArrayList<book>(); 
		
		book_new_list.add(e1);
		book_new_list.add(e2);
		book_new_list.add(e3);
		
		
		//using comparator interface in main 
		System.out.println("Sorted by Comparator interface rating"); 
        ratebooks rate_books = new ratebooks(); 
        Collections.sort(book_new_list, rate_books); 
        for (book b: book_new_list)
        {
        	int rate = b.getrate();
			String name = b.getname();
			int year = b.getyear();
			System.out.println(rate+":"+name+":"+year);
        }
        /*
         * output:
         * Sorted by Comparator interface rating
3:Vanish:2005
4:Surgeon:2004
4:Smile:2006
         * 
         * */
		
		
		
		
		
		
		
	}

}

 
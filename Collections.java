import java.util.*;
import java.io.*;

//create httperror codes class 
class httpcodes
{
	Integer code;
	String Status;
	
	//maybe a private constrictor 
	
	httpcodes(int newcode, String status)
	{
		//usual method 
		this.code = newcode;
		this.Status = status;
		
	}
	
	//Now override equals method.
	//check for equality
	@Override
	public boolean equals(Object newobj)
	{
		if(this == newobj)
		{
			return true;
		}
		//check of they are of different classess 
		if(newobj==null || newobj.getClass() != this.getClass())
		{
			return false;
			
		}
		// type casting of the argument.  
        httpcodes newcode = (httpcodes) newobj; 
          
        // comparing the argument state with  
        // the state of 'this' Object. 
        return (newcode.Status.equals(this.Status)  && newcode.code == this.code);
	}
	//if you override equals method, then override hashcode method also 
	@Override
	public int hashCode()
	{
		//Am returning httperrorcode ot httpcode as hashcode value
		return this.code;
		
	}
	
}


public class Collections {
	
	// creatingObjects with same state 
    
	public static void main(String[] args) {
	httpcodes h2 = new httpcodes(200, "HTTP OK"); 
    httpcodes h3 = new httpcodes(200, "HTTP OK"); 
      
    Map<httpcodes, String> map = new HashMap<httpcodes, String>(); 
    map.put(h2, "HTTP TCP"); 
    map.put(h3, "HTTP UDP"); 
      
    for(httpcodes newhttp : map.keySet()) 
    { 
        System.out.println(map.get(newhttp)); 
    }  
	

}
}
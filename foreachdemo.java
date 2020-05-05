//stream class 
import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class foreachdemo {
	
	///using collection.foreach and stream.foreach methods 
	public static void main(String[] args)
	{
		List<Integer> newlist = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			newlist.add(i);
		}
		
		//print cube of the number using streams.collect() method
		//method 
		
		Set<Integer> set_cubes = 
		         newlist.stream().map(x->x*x*x).collect(Collectors.toSet()); 
		//output: [0,64,1,8,27
		//print cubes in disordered fashion
		
		System.out.println(set_cubes);
		
		//print using forEach() method 
		
		newlist.stream().map(x->x*x*x).forEach(y->System.out.println(y));
		//output
		//0, 1 8 27 64 
		//forEach() prints in orderly fashion
		
		
	}
}

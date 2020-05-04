/* program to Create an array to store different type of Objects including primitives and get them in the same way inserted.*/
/*
Read write operations on Map implementations
*/
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
class TreeMapImpl {

  public static void main(String[] args) {
    //System.out.println("Hello world!");
    //declare Map implementation: Key, value pair array
  //create a new map
    TreeMap<Integer, String> newmap = new TreeMap();

    //let us use this map for error codes http
    newmap.put(400, "Page Not found");
    newmap.put(502,"Bad Gateway");
    newmap.put(500, "internal server error");
    newmap.put(200, "HTTP OK");
    newmap.put(301, "Page moved permanently");
    newmap.put(302, "temporarily moved");

    //print map
 // Set<Integer> httpcodes = newmap.keySet();
//Iterator iterator = httpcodes.iterator();
 //print out values

 System.out.println(newmap);


  }
}

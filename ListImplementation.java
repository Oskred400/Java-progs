import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;
class ListImplementation {

  public static void ListImplementation()
  {
    //String elements only
    List<String> array_list = new ArrayList();
    //add elements
    array_list.add("hello");
    array_list.add("New Java");
    array_list.add("world");
    //check if array_list haass elements
    //using iterator
    ListIterator<String> li = array_list.listIterator();
    //System.out.println()
    while(li.hasNext())
    {
      System.out.println("value is: "+li.next());
    }

  }

  public static void main(String[] args) {
 //System.out.println(newmap);
 ListImplementation();



  }
}

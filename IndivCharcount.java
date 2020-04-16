
import java.util.Scanner;
import java.util.*;
import java.util.HashMap;
import java.io.*;

class IndivCharcount
{

  public static void charct(String str)
  {
    HashMap<Character,Integer> newmap = new HashMap();

    // convert String to a character array

    char[] charray = str.toCharArray();
    int count = 0;

    for(char ch: charray)
    {
      if(newmap.containsKey(ch))
      {
        newmap.put(ch, newmap.get(ch)+1);
      }
      else
      {
        newmap.put(ch,1);
      }
    }
//print all entries

  //for(Map.Entry entry: newmap.entrySet())
  //{
   // System.out.println(entry.getKey()+": "+entry.getValue());
  //}
//just get whole view
  System.out.println(newmap.entrySet());


    }





  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    String inputstring = sc.nextLine();

    charct(inputstring);

    sc.close();




  }
}

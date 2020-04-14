import java.util.Scanner;
class permutations
{
public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter string");

    //int number = scanner.nextInt();
    String news = scanner.nextLine();


    permute(news, "");
    scanner.close();

  }

  public static void permute(String s, String res)
  {
    //empty string
    if(s.length()==0)
    {
      System.out.println(res+" ");
    }

    for(int i=0;i<s.length();i++)
    {
      char newchar = s.charAt(i);
      //rest of string without ith character
      String newstr = s.substring(0,i)+s.substring(i+1);
      //Now recursion
      permute(newstr, res+newchar);

    }
  }
}

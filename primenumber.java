import java.util.Scanner;

class primenumber
{


public static boolean isprime(int n)
{
  for(int i=2;i<=n/2;i++)
  {
    if(n%i==0)
    {
      return false;
    }
  }
  return true;



}



  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter number");

    int number = scanner.nextInt();
    //String news = scanner.nextLine();
  System.out.println(isprime(number));
    //System.out.println(fibo(number));
    //System.out.println(factorial(number));
    //permute(news, "");
    scanner.close();


  }
}

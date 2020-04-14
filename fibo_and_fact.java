//program to find fibonacci and factorial

import java.util.Scanner;

class Main {

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter number");

    int number = scanner.nextInt();

    System.out.println(fibo(number));
    System.out.println(factorial(number));
    scanner.close();

  }
    public static int fibo(int n)
    {
      if(n==1 || n==2)
          return 1;
      else
        return fibo(n-1)+fibo(n-2);

    }
    public static int factorial(int n)
    {
      int prod = 1;
      if(n==0 || n==1)
        prod = 1;
      else
      {
        prod = n*factorial(n-1);
      }
      return prod;
    }

  }

import java.util.Scanner;
class Fibonacci
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till you want to see fibonacci series");
        int n = sc.nextInt();
          int a = 0;
          int b = 1;
          int fib;
          System.out.println("Fibonacci sequence upto"+n+"numbers");
          System.out.print(a+""+b);
          for(int i=2; i <= n; i++)
          {
            fib = a+b;
            a = b;
            b = fib;
            System.out.print(fib + " ");
        }
    }
}

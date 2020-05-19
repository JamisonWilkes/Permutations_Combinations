import java.util.Scanner;

public class Program7
{
   public static void main(String args[])
   {
      
      Scanner xyz = new Scanner(System.in);
      System.out.println("Please enter a value for n: ");
      double n = xyz.nextDouble();
      System.out.println("Please enter a value for r: ");
      double r = xyz.nextDouble();      
      
      if(n<r)
         {
         System.out.println("Sorry r cannot be greater than n");
         System.exit(0);
         }
      if(n<0 || r<0)
      {
         System.out.println("Sorry n cannot be less than 0");
         System.exit(0);
      }
     
      //Permutaion
      System.out.println("Permutation: ");
      //Permutation with repeats = n^r
      double pRepeat = Math.pow(n,r);
      System.out.println("P(" + n + "," + r + ") With Repeats: " + pRepeat);
      //Permutation without repeats = n! / (n - r)!
      double pNoRepeat = factorial(n) / factorial(n-r);
      System.out.println("P(" + n + "," + r + ") With out Repeats: " + pNoRepeat);
      
      //Combination
      System.out.println("Combination: ");
      //Combination with repeats = (n+r-1)! / r!([n+r-1] - r)!
      double cRepeat = factorial(n + r - 1) / (factorial(r) * factorial((n+r-1)-r));
      System.out.println("C(" + n + "," + r + ") With Repeats: " + cRepeat);
      //Combinantion without repeats = n! / r!(n - r)!
      double cNoRepeat = factorial(n) / (factorial(r) * factorial(n - r));
      System.out.println("C(" + n + "," + r + ") Without Repeats: " + cNoRepeat);
   }
   
      public static double factorial(double n)
   {
      double factorial = 1;
      for(double i = 1; i <= n; i++)
         factorial = factorial * i;
      return factorial;
   }
}


/* Test Cases
Test number       Input Description          Input Value           Expected Output

1                 numbers between 10          n = 4, r = 2           Permutation: 
                                                                   P(4.0,2.0) With Repeats: 16.0
                                                                   P(4.0,2.0) With out Repeats: 12.0
                                                                   Combination: 
                                                                   C(4.0,2.0) With Repeats: 10.0
                                                                    C(4.0,2.0) Without Repeats: 6.0  
                                                                 
2                 negative numbers           n = 0, r = -1         Sorry n cannot be less than 0
            
3                 n is less than r           n = 5, r = 6          Sorry r cannot be greater than n

4                 numbers greater than 8     n = 10, r = 10          Permutation: 
                                                                    P(10.0,10.0) With Repeats: 1.0E10
                                                                    P(10.0,10.0) With out Repeats: 3628800.0
                                                                   Combination: 
                                                                   C(10.0,10.0) With Repeats: 92378.0
                                                                   C(10.0,10.0) Without Repeats: 1.0

*/
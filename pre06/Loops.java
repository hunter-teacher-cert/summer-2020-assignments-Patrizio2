import java.io.*;
import java.util.*;
//import java.util.Scanner;
public class Loops{

//
// Exercise 3  //
//
  public static double power (double x, int n){
          double runningtotal = 1;
         if ( n > 0) {
            for (int i = 1; i <= n; i = i + 1) {
             runningtotal =runningtotal *x;
        }
        } else if (n < 0) {
                n=n*(-1);
                for (int i = 1; i <= n; i = i + 1) {
                runningtotal = runningtotal*x;
                }
                runningtotal = 1/runningtotal;
        }
           return runningtotal;
    }






//
// Exercise  #4
//
    public static int factorial(int n) {
        if (n == 0) {
          return 1;
          }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
}
//
// Exercise #5
//
// Part 4 - the estimates are almost identical at n=15
// Part 5 - They seem to differ exponentially - by factors of "e"
//
//
    public static double myexp (double x, double n) {
        double runningtotal = 1.0;
        double previousterm = 1.0;
        if (n >= 1) {
            for (double i = 1; i <= n; i = i+1) {
//              double count = i;
//              double tempx = x;
              runningtotal = runningtotal + previousterm*(x/i);
              previousterm = previousterm*(x/i);

          }
        }
              return runningtotal;
      }

      public static void check(double x, double n) {
        System.out.println(x + "  " + "  " + myexp(x,n) + "  " + Math.exp(x));
    }



    public static void main(String[] args) {
//        double number;
        int    exponent;
        int    number;
        Scanner in = new Scanner(System.in);

        // prompt the user to get the number
//        System.out.print("What is number ");
//        number = in.nextDouble(); // double used with "power"

        System.out.print("What is number ");
        number = in.nextInt();
        // prompt the user and get the exponent
        System.out.print("What is exponent ");
        exponent = in.nextInt();
        double revisednumber = number;
        System.out.println(power(revisednumber,exponent));

// Question 5, Part 5

          for (double i = 0.1; i <= 100; i = i*10) {
            check(i,number);
          // The values seem to vary exponentially

       }
// Question 5, Part 6
          for (double i = -0.1; i >= -100; i = i*10) {
          check(i,number);
// The values seem to vary exponentially once again

    }
        // prints out the result
//        System.out.print("The result is ");
//        System.out.print(patfactorial(exponent));

//        System.out.print("The result is ");
//        System.out.print(patfactorial(exponent));
//        System.out.print(power(number, exponent));
//
  }
}

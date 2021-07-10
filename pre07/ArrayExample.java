import java.io.*;
import java.util.*;
//import java.util.Scanner;
public class ArrayExample{


//
// Exercise 1 //
//

    public static double [] powerElements(double[] a, int p) {
        double [] c = new double [a.length];
        for (int i = 0; i < a.length; i++) {
         c[i] = Math.pow(a[i], p);
      }
            return c;
    }

    public static int [] histogram(int[] a, int n) {
      int value = 0;
      int [] temp = new int [a.length];

    for (int i = 0; i < a.length; i++) {
         value = a[i];
         temp[value] ++;
//        System.out.println(value);
    }
          return temp;
}
//    EXERCISE #4
//////////////
//    This procedure takes in an int arrays
//    and returns the index of the largets element
/////////////
//
//    Yes, you can use an enhanced loop because
//    we are still going from the first index through
//    to the last by an interation of 1.


    public static int indexOfMax (int [] a ) {
      int tempmaxindex = 0;
      for (int i = 0; i < a.length; i++) {
       if (a[tempmaxindex] < a[i]){
           tempmaxindex = i;
                       }
      }
            return tempmaxindex;
}

//    EXERCISE #5
//////////////
//    This procedure takes in an int parameter
//    and returns a boolean array that indicates
//    whether each element is prime. /////////////
//
    public static boolean [] sieve (int n) {
      boolean [] starter = new boolean[n+1]; ///they are created false
      //but need them true for method to work properly ****
      // I also added one to the length so that the index number
      //would equal the number. Not "nice and neat" but used it for
      // simplisity of following the code. Seemed like a good idea at
      // the time.
      for (int i = 0 ; i<= n+1 ; i++) {
          starter [i] = true;
      }
      for (int i = 0 ; i< n+1 ; i++) {
          System.out.print(starter[i]);
      }
      int newpossibleprime = 2;
      starter [0] = false;
      starter [1] = false;
        for (int i = 2 ; i < n; i++) {
        if (starter[i]){
          int loopsofj = ((n/newpossibleprime));
          int startloopj = newpossibleprime;
//          int endloopj =
//            starter[j]= true;
            for (int j =1 ; j < loopsofj; j++){
            int valueofn = (startloopj + newpossibleprime*j);
            starter[(valueofn)]= false;

          }
        }

  }
                return starter;
}


    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int power;
    int maxindex;
// declaring arrays
    int [] a = new int [100];
    int [] d = new int [100];
    double [] b = new double[a.length];
    double [] c = new double[a.length];
    boolean[] primes;

//    Gerating data array "a" and filling with random numbers
      Random random = new Random();
        for (int i = 0; i < a.length; i++) {
          a[i] = random.nextInt(100);
    }


///   Prompt to get power to raise the elements (EXERCISE 1.1)
      System.out.print("What is power to raise to?");
      power = in.nextInt();
///   Output for Exercise 1
           c = powerElements (b, power);
///// The following lines can be used to check the results
//           System.out.print(Arrays.toString(b));
//           System.out.print(Arrays.toString(b));



////  Prompt to get power to raise the elements (EXERCISE 1.2)
      System.out.print("How many counters would you like?");
          maxindex = in.nextInt();
          if (maxindex<=100){
            a = histogram(a , maxindex);
///// The following line can be used to check the result
//    System.out.print(Arrays.toString(a));
        }else{
      System.out.print("Your value is too high");
        }

///   Printing out result for Exercise 4;
      System.out.print("The index value of the Max value is");
      System.out.println(indexOfMax(a));


///   Prompt to get number for Exercise 5
///   This was very cool
      System.out.print("Please enter your value for Eratosthenes Sieve:");
      int number = in.nextInt();
      primes = sieve (number);
////  The following line can be used to check the output//
      for (int i = 0; i <= number ; i++){
      System.out.print(i + " " + primes[i] + "    ");
    }
  }
}

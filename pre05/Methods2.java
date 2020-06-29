import java.util.Scanner;

// *
// * Takes a users input for n and m and determines
// * if n is divisible by m


public class TempMethods {


public static int ack(double newm, double newn) {
    if (newm =0) {
       return (newn+1);
    } elseif (newm > 0 && newn=0) {
         newm = newm-1;
         return (ack(newm,1));
    } elseif (newm>0 && newn>0) {
         int tempm = newm;
         newm = newm-1;
         newn = newn-1:
         return ack(newm,ack(tempm,newn))
    }
}


//}

        int m;
        int n;

public static void main(String[] args) {
        // prompt the user and get the n and m values
        System.out.print("Enter the value for n ");

        n = in.nextInt();
        System.out.print("Enter the value for m ");
        m = in.nextInt();
        // prints true if n is divisible by m

//        System.out.print String(isDivisible(n,m));
          isDivisible(n,m);


        // Enters the three sides of a triangle
//        System.out.print("Enter the length of side 1 ");
//        side1 = in.nextDouble();
//        System.out.print("Enter the value for side 2 ");
//        side2 = in.nextDouble();
//        System.out.print("Enter the value for side 3 ");
//        side3 = in.nextDouble();
        // prints true if the three sides can form a triangle
//        System.out.print isTriangle(side1, side2, side3);

        // Enters the two values for m and n of ackerman function
//        System.out.print("Enter the m value ");
//        m = in.nextDouble();
//        System.out.print("Enter the n value ");
//        n = in.nextDouble();
        // prints out the ackerman value
//        System.out.print ack(m,n);

    }
}






//public static void main(String[] args) {
//    double celcius;
//    double fahr;
//    final double CONVERSION_RATIO = (9.0/5.0);
//    final int CONSTANT = 32;
//    Scanner in = new Scanner(System.in);

    // prompt the user and get the n and m value
//    System.out.print("Enter the value for n ");
//    n = in.nextDouble();
//    System.out.print("Enter the value for m ");
//    n = in.nextDouble();
    // convert and output the result
//    fahr = ((celcius * CONVERSION_RATIO) + CONSTANT);
//    System.out.printf("%.1f C = %.1f F,\n"
//                                  ,celcius, fahr);
//}
//}

import java.util.Scanner;

// *
// * Converts celcius to fahrenheit.
// *
public class Celcius {

    public static void main(String[] args) {
        double celcius;
        double fahr;
        final double CONVERSION_RATIO = (9.0/5.0);
        final int CONSTANT = 32;
        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("What is the Celcius reading? ");
        celcius = in.nextDouble();

        // convert and output the result
        fahr = ((celcius * CONVERSION_RATIO) + CONSTANT);
        System.out.printf("%.1f C = %.1f F,\n"
                                      ,celcius, fahr);
    }
}

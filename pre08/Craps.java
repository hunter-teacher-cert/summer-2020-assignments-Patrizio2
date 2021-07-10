import java.io.*;
import java.util.*;

public class Craps3{


//////
// This method generates a random number
// inclusive of the lower and upper limits
// for that possible number of dice
///
public static int roll (int numberofdice){
    int min = numberofdice;
    int max = numberofdice*6;
//  The 1 is added to make the max value inclusive
     Random r = new Random();
    return r.nextInt((max - min) + 1) + min;



//    int randomNum = ThreadLocalRandom.current().nextInt(min, max+1);

//    return random.ints(min, max+1);

//    import java.util.concurrent.ThreadLocalRandom;
//////***** This line was completely stolen from
//    I am not able to generate random numbers
// https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java


}
  public static int shoot(int numberofdice, int dicetotal){
  int rolltotal = 0;
  for (int i = 1 ; i <= numberofdice ; i++) {
    rolltotal += roll(numberofdice);
  }
          return rolltotal;
}




/////
// This method writes a w for win and an l for loss

 public static String round(){
   // The rules of win, loss, and neutral are shown
   // in the array below. The "e" stands for error.
   // The index's are incremented by one so that calling
   // rules[7] will result in "w"
   String [] rules = { "e","e","l","l","n","n","n","w","n","n","n","w","l"};
   int numberofdice = 2;
   int dicetotal = 12;
   int point = shoot (numberofdice, dicetotal);
   System.out.println("The roll is " + point);
//   System.out.print("THIS IS A CHECK BEFORE DECIDING WIN/LOSS/NEUTRAL");
//     int n = nextInt();

   if (rules[point] == "w" ){
//      System.out.println("Win");
      return "Win";
    } else if (rules[point] == "l") {
//      System.out.println("Loss");
      return "Loss";
    } else  {
//    Get rid of two code lines below
//      System.out.print("THIS IS A CHECK IN THE else before a neutral roll");
//        int n = in.nextInt();

      System.out.println(" Neutral: Point is set at " + point);
        boolean flag = true;
        int neutralrollcount= 0;
      do {
        int neutralroll = shoot(numberofdice, dicetotal);
        neutralrollcount ++;
        System.out.print ("Nuetral roll " + neutralrollcount + " is" + neutralroll);
            if (neutralroll == point){
              return "Win";
              flag = false;
          }   else if (neutralroll == 7){
              return "Loss";
              flag = false;
          }
     }while (flag);
      return "David Byrne";


    }

   }
///// Main asks the user how many rounds they would like
//    to play and then calls on various methods to simulate
//    rolls and print their outcomes

public static void main(String[] args) {
Scanner in = new Scanner(System.in);


//    prompts the user to get the number of rounds to play
  System.out.print("How many rounds would you like to play?");
    int n = in.nextInt();
    for (int i = 1 ; 1 <= n ; i++) {
      System.out.println("ROUND " + i);
      System.out.println(round());
    }






}

}

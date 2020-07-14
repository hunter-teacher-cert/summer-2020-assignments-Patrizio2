import java.io.*;
import java.util.*;

public class StackMethodDriver{
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "racecar";
    String reversedstring;
    String palendromeresult;


    System.out.println("Test 1:");
//    Stack<Character> stack1 = new Stack<Character>(s1);
    System.out.println(s1);
    reversedstring = reverse(s1);
    System.out.println(reversedstring);
//    System.out.println(this.reverse(s1));
    palendromeresult = isPalendrome(s1);
    System.out.println(palendromeresult);
//    System.out.println(this.isPalendrome(s1));

    System.out.println("\nTest 2:");
    System.out.println(s2);
//    Stack<Character> stack1 = new Stack<Character>(s2);
    reversedstring = reverse(s2);
    System.out.println(reversedstring);
//    System.out.println(this.reverse(s2));
    palendromeresult = isPalendrome(s1);
    System.out.println(palendromeresult);
//    System.out.println(this.isPalendrome(s2));

    String expression1 = "(a + b) * c";
    String expression2 = "(a + b * c";
//    Stack<Character> stack3 = new Stack<Character>(expression1);
//    Stack<Character> stack4 = new Stack<Character>(expression2);
    System.out.println("\nTest 3:");
//    System.out.println(stack3.parenCheck());
//    System.out.println(stack4.parenCheck());

  }//end main
}//end class

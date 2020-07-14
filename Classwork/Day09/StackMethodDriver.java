import java.io.*;
import java.util.*;

public class StackMethodDriver{
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "racecar";

    System.out.println("Test 1:");
    Stack<Character> stack1 = new Stack<Character>(s1);
    System.out.println(s1);
    System.out.println(stack1.reverse());
    System.out.println(stack1.isPalendrome());

    System.out.println("\nTest 2:");
    System.out.println(s2);
    Stack<Character> stack1 = new Stack<Character>(s2);
    System.out.println(stack2.reverse());
    System.out.println(stack2.isPalendrome());

    String expression1 = "(a + b) * c";
    String expression2 = "(a + b * c";
    Stack<Character> stack3 = new Stack<Character>(expression1);
    Stack<Character> stack4 = new Stack<Character>(expression2);
    System.out.println("\nTest 3:");
    System.out.println(stack3.parenCheck());
    System.out.println(stack4.parenCheck());

  }//end main
}//end class

import java.io.*;
import java.util.*;

public class StackMethods2{
 //Stack<Character> originalstack;


// Takes a string and reverses it's order by
//  pushing each character into a stack
// and then pulling them out into a growing string
  public static String reverse(String s){
    Stack<Character> originalstack = new Stack<Character>();
    String revstring  = null;

    for (int i = 0 ; i < s.length() ; i++){
      originalstack.push(s.charAt(i));
    }//end for
//  originalstack = stackThatStack();
    while (!originalstack.isEmpty()){
    revstring += originalstack.pop();
    }//  endwhile
    return revstring;
}//end reverse method

// Returns true or false depneding on whether
// s is a palindrome (can be read the same
// forward & backward) - Example: racecar
 public static boolean isPalindrome(String s){
    String revstring  = null;
    Stack<Character> originalstack = new Stack<Character>();
    revstring = reverse(s);

    if (s.equals(revstring)){
      return true;
    }//end if
      return false;
}// end isPalindrome method
// can be shrunk down to return (s.equals(revstring))

// Returns true if the # of open parentheses
// is equal to the # of closed parentheses.
public static boolean parenCheck(String s){
  Stack<Character> originalstack = new Stack<Character>();
  int countneutral  = 0;

  for (int i = 0 ; i < s.length() ; i++){
    originalstack.push(s.charAt(i));
  }//end for

  while (!originalstack.isEmpty()){

    if (originalstack.pop().equals("(")){
       countneutral ++;
    }
    else if (originalstack.pop().equals(")")) {
       countneutral --;
    }
  }//  endwhile
    if (countneutral == 0){
        return true;
    }// end if
        return false;

}//end parenCheck method

public static void main(String[] args) {
  String s1 = "hello";
  String s2 = "racecar";
  String reversedstring;
  boolean palindromeresult;


  System.out.println("Test 1:");
//    Stack<Character> stack1 = new Stack<Character>(s1);
  System.out.println(s1);
  reversedstring = reverse(s1);
  System.out.println(reversedstring);
//    System.out.println(this.reverse(s1));
  palindromeresult = isPalindrome(s1);
  System.out.println(palindromeresult);
//    System.out.println(this.isPalendrome(s1));

  System.out.println("\nTest 2:");
  System.out.println(s2);
//    Stack<Character> stack1 = new Stack<Character>(s2);
  reversedstring = reverse(s2);
  System.out.println(reversedstring);
//    System.out.println(this.reverse(s2));
  palindromeresult = isPalindrome(s1);
  System.out.println(palindromeresult);
//    System.out.println(this.isPalendrome(s2));

  String expression1 = "(a + b) * c";
  String expression2 = "(a + b * c";
//    Stack<Character> stack3 = new Stack<Character>(expression1);
//    Stack<Character> stack4 = new Stack<Character>(expression2);
  System.out.println("\nTest 3:");
//    System.out.println(stack3.parenCheck());
//    System.out.println(stack4.parenCheck());

}//end main



//public Stack<characters> stackthatStack(String s){
//Stack<Character> originalstack = new Stack<Character>();
//  for (int i = 0 ; i < s.length() ; i++){
//    originalstack.push(s.charAt(i));
//  }//end for
//}


}

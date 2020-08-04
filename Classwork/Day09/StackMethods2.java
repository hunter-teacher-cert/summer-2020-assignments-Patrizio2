import java.io.*;
import java.util.*;

public class StackMethods2{
 //Stack<Character> originalstack;


// Takes a string and reverses it's order by
//  pushing each character into a stack
// and then pulling them out into a growing string
  public static String reverse(String s){
    Stack<Character> originalstack = new Stack<Character>();
    String revstring ="";

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
    String revstring  = "";
    Stack<Character> originalstack = new Stack<Character>();
    revstring = reverse(s);

      if (revstring.equals(s)){
      return true;
    } else{
      return false;
    }//endif

}// end isPalindrome method
// can be shrunk down to return (s.equals(revstring))

// Returns true if the # of open parentheses
// is equal to the # of closed parentheses.
public static boolean parenCheck(String s){
  Stack<Character> originalstack = new Stack<Character>();
  Character popped;
  int countneutral  = 0;
  int size;
  for (int i = 0 ; i < s.length() ; i++){
    originalstack.push(s.charAt(i));
    System.out.println(i);
  }//end for
size = originalstack.size();
System.out.println(size);
  while (!originalstack.isEmpty()){
      System.out.println("David Byrne");
      System.out.println(originalstack.pop());
      popped = originalstack.pop();
        if (popped.equals('(')){
          System.out.println("we're in1");
          countneutral ++;
    }   else if(popped.equals(')')){
//          System.out.println(countneutral);
          System.out.println("we're in2");
          countneutral --;
    }
      System.out.println(size);
      size --;
      System.out.println(size);

  }//  endwhile
  System.out.println("David Byrne2");

    if (countneutral == 0){
        System.out.println(countneutral);
        return true;
   }else {
        System.out.println(countneutral);
        return false;
   }//endif
}//end parenCheck method

public static void main(String[] args) {
  String s1 = "hello";
  String s2 = "racecar";
  String reversedstring;
  boolean palindromeresult;
  boolean parentheses;

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
  palindromeresult = isPalindrome(s2);
  System.out.println(palindromeresult);
//    System.out.println(this.isPalendrome(s2));


  System.out.println("\nTest 3:");
  String expression1 = "(a + b ) * c";
  String expression2 = "(a + b * c";
//    Stack<Character> stack3 = new Stack<Character>(expression1);
//    Stack<Character> stack4 = new Stack<Character>(expression2);
  System.out.println(expression1);
  parentheses = parenCheck(expression1);
  System.out.println(parentheses);
  System.out.println(expression2);
  parentheses = parenCheck(expression2);
  System.out.println(parentheses);
}//end main



//public Stack<characters> stackthatStack(String s){
//Stack<Character> originalstack = new Stack<Character>();
//  for (int i = 0 ; i < s.length() ; i++){
//    originalstack.push(s.charAt(i));
//  }//end for
//}


}

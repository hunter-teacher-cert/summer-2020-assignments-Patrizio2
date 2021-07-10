import java.io.*;
import java.util.*;

public class StackMethods{
 //Stack<Character> originalstack;


// Takes a string and reverses it's order by
//  pushing each character into a stack
// and then pulling them out into a growing string
  public String reverse(String s){
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
  public boolean isPalindrome(String s){

    String revstring  = null;
    Stack<Character> originalstack = new Stack<Character>();
    revstring = reverse(s);

    if (s.equals(revstring)){
      return true;
    }//end if

      return false;
}// end isPalindrome method


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



//public Stack<characters> stackthatStack(String s){
//Stack<Character> originalstack = new Stack<Character>();
//  for (int i = 0 ; i < s.length() ; i++){
//    originalstack.push(s.charAt(i));
//  }//end for
//}


}

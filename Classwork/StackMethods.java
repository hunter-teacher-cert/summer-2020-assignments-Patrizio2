/*import java.io.*;
import java.util.*;


public class Mystack2{
    private LinkedList<string> data;

public MyStack(){
  data = new LInkedList<String>();
}

public void push(String value){
  data.addFrist (value);

}

public String pop() {
// add code to remove and return the
// item on the top of the stack
  String v = data.removeFirst();
  return v;
}

public Sting top(){
//add code to return but not remove the
//item on the top of the stack
return data.get(0);
}

Stack<String> pancakes = new Stack<String>();

*/

public class MyStack2{
 Stack<String> originalstack;


//public MyStack2 (String s){
//originalstack = new Stack<Character>;
//  for (int i= 0 ; 1< s.length() ; i++){
//    originalStack.push(s.charAt(i));
  }

  }





}
// Takes a string reverses it's order by
//  pushing each character into a stack
// and then pulling them out into a growing string
  public reverse(String s){
    originalstack     = new Stack<Character>;
    String revstring  = null;

    for (int i = 0 ; i < s.length() ; i++){
      originalstack.push(s.charAt(i));
    }//end for

    while (!originalstack.isEmpty()){
    revstring += originalstack.pop();
    }//  endwhile
    return revstring;

}//end reverse


// Returns true or false depneding on whether
// s is a palindrome (can be read the same
// forward & backward) - Example: racecar
  public isPalindrome(String s){
    originalstack     = new Stack<Character>;
    String revstring  = null;
  
    revstring = reverse(s);

    if (s.equals(revstring)){
      return true;
    }//end if

      return false;
}// end isPalindrome


// Returns true if the # of open parentheses
// is equal to the # of closed parentheses.
public static boolen parenCheck(String s){
  originalstack     = new Stack<Character>;
  int countneutral  = 0;

  for (int i = 0 ; i < s.length() ; i++){
    originalstack.push(s.charAt(i));
  }//end for

  while (!originalstack.equals()){
    if (originalStack.pop() )
  revstring += originalstack.pop();
  }//  endwhile




}//end parenCheck






}







}

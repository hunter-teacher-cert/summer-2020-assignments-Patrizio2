/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Boogle
   A tester class for code analysis and search exploration.
   USAGE:
   Read through at least once.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   Insert comment preceding each method to summarize functionality.
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class BoogleDay11
{

  //return index of first occurence of target, or -1 if not found
  public static int linSearch( ArrayList al, int target )
  {
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end linSearch()








  //return index of target, or -1 if not found
  public static int binSearch( ArrayList al, int target )
  {
    // <INSERT YOUR MACHINERY HERE>...
    return -1; //placeholder to get past compiler
  }//end binSearch()



  // subgoal: recognize target found (and take what action?)
  // subgoal: recognize search space exhausted (and take what action?)
  // subgoal: recognize target in lower portion of range (and do what?)
  // subgoal: recognize target in upper portion of range (and do what?)

  //nota bene: A helper method could be very useful.
  // Q: Why?
  // Q: What would the parameters be for such a method?



  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()


  //return ArrayList of random ints, sorted in ascending order
  public static ArrayList prestoSortedArrayListo(int numItems,
                                                 int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    if ( numItems<1 )
      return retArr;

    //populate index 0
    retArr.add( (int)(lo * Math.random()) );

    //populate rest of indices, each one greater than last
    for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
      //System.out.println(retArr.get(i-1));
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    }

    return retArr;
  }//end prestoSortedArrayListo()

  //##################################################
  //##################################################

    // find and return the index of the smallest value in the
    // ArrayList al from index lo to index hi inclusive
    public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
	// assume the first item is the smallest - call it our smallest so far

    int smallest = (int)al.get(0);
    int index = 0;

  // loop over all the items

    for (int i =lo ; i < hi ; i++){

  //   if the current item is smaller than the smalleest so far,
  //      then the current item becomes the new smallest so far
          if ( (int)al.get(i) < smallest){
            smallest = (int)al.get(i);
            index = i;
          }//end if
    }// end for
	// change this to return the correct answer
	   return index;
    }


  //##################################################
  //##################################################





  //##################################################
  //##################################################

    // find and return the index of the smallest value in the
    // ArrayList al from index lo to index hi inclusive
    public void sort(ArrayList<Integer> al){
      int tempforswap;
      int low  = 0;
      int high = (al.size() -1); // we only need to run one less than
                                // the total length because because
                                // the last one is highest by default
      int indexofsmallest;

	  // assume the first item is the smallest - call it our smallest so far
    //  initialize variables to swap
    // loop over all the items
    // find smallest
    for (int i =lo ; i < (al.length() - 1) ; i++){
          // the last one will be sorted so no need to do last index

          //find the index of the smallest number
          indexofsmallest = findSmallest( al, low, high);

          //swap the smallest with the number in the current index
          tempforswap = (int)al.get(i);
          al[i] = al.get(indexofsmallest);
          al[indexforsmallest]=tempforswap;

          //increment the low setting
          low++;

    }//end for loop

  //##################################################
  //##################################################













  public static void main( String[] args )
  { 


    //*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~

      int smallIndex;
      System.out.println("Testing findSmallest");
      ArrayList<Integer>  slist = prestoArrayListo(20,0,200);
      smallIndex = findSmallest(slist,0,slist.size());
      System.out.println(slist);
      System.out.printf("Smallest is at slist[%d] and is %d\n",smallIndex,slist.get(smallIndex));

    //~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/
      //the Rosane-Pat-Sangmin special :
/*
      System.out.println("\n"+"pal99"+":");
      ArrayList pal99 = new ArrayList();
      //explicitly fill arraylist with intent to search for
      // present and nonpresent values...



      pal99.add(0);  // does my code fail
      pal99.add(1);  // it may in theory
      pal99.add(2);
      pal99.add(3);
      System.out.println(pal99);
      //search for target in the list
      System.out.println(findSmallest(pal99)); // 2
*/









}//end main







}//end class

/**
**/

import java.io.*;
import java.util.*;

public class MSort
{


  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList<Integer> prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList<Integer> retArr = new ArrayList<Integer>();

    for(int i=0; i<numItems; i++) {
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()

  // find and return the index of the smallest value in the
  // ArrayList al from index lo to index hi inclusive
  public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
    int maxIndexSoFar = lo;
    for (int i = lo; i <=hi; i++) {
      if (al.get(i) < al.get(maxIndexSoFar)){
        maxIndexSoFar = i;
      }
    }
    return maxIndexSoFar;
  }

  public static void selectionSort(ArrayList<Integer> al) {

    int lo = 0;
    int temp;

    for (int i=0; i < al.size() - 1; i++) {
      lo = findSmallest(al, i, al.size()-1);
      temp = al.get(i);
      al.set(i, al.get(lo));
      al.set(lo, temp);
    }

  }//selectionSort

  //returns a sublist of al containing the elements at indices in the range [lo, hi)
  public static ArrayList<Integer> slice(ArrayList<Integer> al, int lo, int hi) {

    ArrayList<Integer> sub = new ArrayList<Integer>();
    for (; lo < hi; lo++) {
      sub.add( al.get(lo) );
    }//copy
    return sub;
  }//slice


  //Input: 2 SORTED ArrayLists
   //returns 1 new SORTED ArrayList containing all the elements from lists a and b
  public static ArrayList<Integer> merge(ArrayList<Integer> a,
                                         ArrayList<Integer> b) {
    //setup variables
    int sizeofA = a.size();
    int sizeofB = b.size();

    //make a new ArrayList
    ArrayList<Integer> resultantMerge = new ArrayList<Integer>();

    //indices for each input
    int indexcounterA = 0;
    int indexcounterB = 0;
    //while both indices are less than their respective lengths
    While ( indexcounterA < sizeofA && indexcounterB < sizeofB){
    //compare current index elements of each input list

    //add the smaller value to the new list
      if ( a.get(indexcounterA) < b.get(indexcounterB)  ){
          resultantMerge.add(a.get(indexcounterA));
          //update index we took the value from
          indexcounterA ++;
      } else {
          resultantMerge.add(b.get(indexcounterB));
          //update index we took the value from
          indexcounterB ++;
      }//end if
    }//end while

    // adds the remainder of array A to the merged array
    // it is tempting to put an "if" condition here to
    // choose which while loop to run so that the remainder
    // of the longer array is added, however, the conditiona
    // whithin the while already takes care of thata and thus
    // makes the need for the "if" redundant.
    while (indexcounterA < sizeofA){
      resultantMerge.add(a.get(indexcounterA));
      //update index we took the value from
      indexcounterA++;
    }
    // adds the remainder of array B to the merged array
    while (indexcounterB < sizeofB){
      resultantMerge.add(b.get(indexcounterB));
      //update index we took the value from
      indexcounterB++;
    }
    //add the smaller value to the new list

    //update index we took the value from

    //loop ends: one index is past the end of the list
    //copy the values from the reamining list over

    //return the new list
    return resultantMerge;
  }//merge


  public static void main( String[] args )
  {
    ArrayList<Integer> rando = prestoArrayListo(10, 0, 100);
    ArrayList<Integer> calrissian = prestoArrayListo(10, 0, 100);

    selectionSort(rando);
    selectionSort(calrissian);

    System.out.printf("rando: %s\n", rando);
    System.out.printf("calrissian: %s\n", calrissian);

    ArrayList<Integer> randoCalrissian = merge(rando, calrissian);
    System.out.printf("randoCalrissian: %s\n", randoCalrissian);

  }//end main

}//end class

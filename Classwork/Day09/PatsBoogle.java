/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Boogle
   A tester class for developing and testing binary search.
   Implements binary search algo on an ArrayList
   - iteratively
   - recursively
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class PatsBoogle
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


  //##################################################
  //##################################################

  //return index of target, or -1 if not found
  //assumes input ArrayList is sorted in ascending order

///// Ok this is the binary search i created.
////  It works in a traditional sense with the exception
//    that it decreases the range for the next iteration
//    by increasing the lowerlimit and decreasing the upperlimit.
//    Both values are changed, not just the customary one. Becuase of this
//    the conditional for the while loop was changed. I'm not 100% sure if it has to have
//    the = than sign but think it may to allow for a run through. If it doesn't require
//    the equal sign that would be one extra step. The next step would be to build in a counter to
//    see how many times each method took to go through the while loop. I think my method will require
//    less cycles...some of the times.
//    to accountby
  public static int binSearch( ArrayList al, int target )
  {
    //uncomment exactly 1 of the 2 helper method calls below:
    int templowerlimit;
    int tempupperlimit;
    int lowerlimit = 0;
    int count = 0; //haven't completed the count yet.
    int upperlimit = (al.size()-1);

    int mid = (al.size()/2);
    int answer = -1;

    while(!(lowerlimit > upperlimit)){
      if ( (int)al.get(lowerlimit) == target){
        return lowerlimit;
      }
      else if ( (int)al.get(upperlimit) == target){
        return upperlimit;
      }
      else if ( (int)al.get(mid) == target){
        return mid;
      }
      else if ( (int)al.get(mid) < target){
        lowerlimit = (mid+1);
        upperlimit--;
        mid = (lowerlimit + upperlimit)/2;
    }
      else if ( (int)al.get(mid) > target){
        lowerlimit++;
        upperlimit = (mid-1);
        mid = (lowerlimit + upperlimit)/2;

    }
  }//end while
          return answer;
  }//end binSearch()

  public static int binSearchTopher( ArrayList al, int target )
    {
      //uncomment exactly 1 of the 2 helper method calls below:

      return binSearchIter( al, target, 0, al.size()-1 );
      //return binSearchRec( al, target, 0, al.size()-1 );
    }//end binSearch()


    public static int binSearchIter( ArrayList al, int target,
                                     int lo, int hi )
    {
      int tPos = -1; //init return var to flag value -1
      int m = (lo + hi) / 2; //init mid pos var

      while( lo <= hi ) { // run until lo & hi cross
        m = (lo + hi) / 2; //update mid pos var

        // target found
        if ( (int)al.get(m) == target )
          return m;

        // value at mid index higher than target
        else if ( (int)al.get(m) > target )
          hi = m - 1; //move hi to index to left of mid

        // value at mid index lower than target
        else if ( (int)al.get(m) < target )
          lo = m + 1; //move lo to index to right of mid
      }
      return tPos;
    }//end binSearchIter()







  public static int binSearchRec( ArrayList al, int target,
                                  int lo, int hi )
  {
    int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var

    //exit case. If lo & hi have crossed, target not present
    if (lo > hi)
      return tPos; //-1

    // target found
    if ( (int)al.get(m) == target )
      tPos = m;

    // value at mid index higher than target
    else if ( (int)al.get(m) > target )
      tPos = binSearchRec( al, target, lo, m-1 );

    // value at mid index lower than target
    else if ( (int)al.get(m) < target )
      tPos = binSearchRec( al, target, m+1, hi );

    return tPos;
  }//end binSearchRec()

  //##################################################
  //##################################################


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


  public static void main( String[] args )
  {
/*
    ArrayList salamander = new ArrayList();

    //explicitly fill arraylist with intent to search for
    // present and nonpresent values...
    // generate an arraylist with an odd num of elems...
    salamander.add(4);
    salamander.add(8);
    salamander.add(15);
    salamander.add(16);
    salamander.add(23);
    System.out.println(salamander);

    //search for target in the list
    System.out.println(binSearch(salamander, 8));  // 1
    System.out.println(binSearch(salamander, 15)); // 2
    System.out.println(binSearch(salamander, 16)); // 3

    //search for target not in the list
    System.out.println(binSearch(salamander, 3)); // -1
    System.out.println(binSearch(salamander, 9)); // -1

    //add another element, for an even num of elems
    salamander.add(42);
    System.out.println(salamander);
    //search for target in the list
    System.out.println(binSearch(salamander, 8));  // 1
    System.out.println(binSearch(salamander, 15)); // 2
    System.out.println(binSearch(salamander, 16)); // 3

    //search for target not in the list
    System.out.println(binSearch(salamander, 3)); // -1
    System.out.println(binSearch(salamander, 9)); // -1
*/

    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
    System.out.println("\n"+"al000"+":");
    ArrayList al000 = prestoArrayListo(0,0,0);
    System.out.println(al000);
    System.out.println(linSearch(al000,3));
    System.out.println("\n"+"al01"+":");
    ArrayList al01 = prestoArrayListo(5,0,100);
    System.out.println(al01);
    System.out.println(linSearch(al01,3));
    System.out.println("\n"+"al02"+":");
    ArrayList al02 = prestoArrayListo(5,3,10);
    System.out.println(al02);
    System.out.println(linSearch(al02,3));
    System.out.println("\n"+"al05"+":");
    ArrayList al05 = prestoArrayListo(20,1,5);
    System.out.println(al05);
    System.out.println(linSearch(al05,3));
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/


    // test battery using sorted ArrayLists as search space
    System.out.println("\n"+"sal000"+":");
    ArrayList sal000 = prestoSortedArrayListo(0,0,0);
    System.out.println(sal000);
    System.out.println(linSearch(sal000,3));
    System.out.println(binSearch(sal000,3));
    System.out.println(binSearchTopher(sal000,3));

    System.out.println("\n"+"sal00"+":");
    ArrayList sal00 = prestoSortedArrayListo(5,0,100);
    System.out.println(sal00);
    System.out.println(linSearch(sal00,3));
    System.out.println(binSearch(sal00,3));
    System.out.println(binSearchTopher(sal00,3));

    System.out.println("\n"+"sal01"+":");
    ArrayList sal01 = prestoSortedArrayListo(5,0,100);
    System.out.println(sal01);
    System.out.println(linSearch(sal01,3));
    System.out.println(binSearch(sal01,3));
    System.out.println(binSearchTopher(sal01,1));

    System.out.println("\n"+"sal02"+":");
    ArrayList sal02 = prestoSortedArrayListo(5,3,100);
    System.out.println(sal02);
    System.out.println(linSearch(sal02,3));
    System.out.println(binSearch(sal02,3));
    System.out.println(binSearchTopher(sal02,3));

    System.out.println("\n"+"sal03"+":");
    ArrayList sal03 = prestoSortedArrayListo(5,0,100);
    System.out.println(sal03);
    System.out.println(linSearch(sal03,3));
    System.out.println(binSearch(sal03,3));
    System.out.println(binSearchTopher(sal03,3));

    System.out.println("\n"+"sal04"+":");
    ArrayList sal04 = prestoSortedArrayListo(20,0,3);
    System.out.println(sal04);
    System.out.println(linSearch(sal04,3));
    System.out.println(binSearch(sal04,3));
    System.out.println(binSearchTopher(sal04,3));

    System.out.println("\n"+"sal05"+":");
    ArrayList sal05 = prestoSortedArrayListo(21,1,5);
    System.out.println(sal05);
    System.out.println(linSearch(sal05,3));
    System.out.println(binSearch(sal05,3));
    System.out.println(binSearchTopher(sal05,3));

    //the Rosane-Pat-Sangmin special :
    System.out.println("\n"+"pal99"+":");
    ArrayList pal99 = new ArrayList();
    //explicitly fill arraylist with intent to search for
    // present and nonpresent values...



    pal99.add(0);  // does my code fail
    pal99.add(1);  // it may in theory
    pal99.add(2);
    pal99.add(3);



//    pal99.add(0);
//    pal99.add(1);
//    pal99.add(1);
//    pal99.add(1);
//    pal99.add(1);
//    pal99.add(1);
//    pal99.add(3);
//    pal99.add(3);
//    pal99.add(3);      /// Test where Teachers
//    pal99.add(4);      //   code did not work
//    pal99.add(4);
//    pal99.add(6);
//    pal99.add(6);
//    pal99.add(6);
//    pal99.add(6);
//    pal99.add(7);
//    pal99.add(9);
//    pal99.add(10);
//    pal99.add(10);
//    pal99.add(12);




//    pal99.add(0);
//    pal99.add(1);
//    pal99.add(3);
//    pal99.add(4);
//    pal99.add(3);
//    pal99.add(3);
//    pal99.add(5);
//    pal99.add(7);
//    pal99.add(8);      /// testing to see if
//    pal99.add(10);         an array size four,
//    pal99.add(12);        with the target in
//    pal99.add(13);        position 3 will work
//    pal99.add(14);
//    pal99.add(14);
//    pal99.add(14);
//    pal99.add(16);
//    pal99.add(17);
//    pal99.add(19);
//    pal99.add(20);
//    pal99.add(20);

    System.out.println(pal99);
    //search for target in the list
    System.out.println(linSearch(pal99,1)); // 2
    System.out.println(binSearch(pal99,1)); // 2
    System.out.println(binSearchTopher(pal99,1));
    //search for target not in the list
    System.out.println(linSearch(pal99,10)); // -1
    System.out.println(binSearch(pal99,10)); // -1
    System.out.println(binSearchTopher(pal99,10)); //-1

    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/

    //batch of commands for easier test case generation:
    /*
    System.out.println("\n"+"al"+":");
    ArrayList al = prestoArrayListo(,,);
    System.out.println(al);
    System.out.println(linSearch(al, ));
    System.out.println(binSearch(al, ));
  */
  }//end main

}//end class

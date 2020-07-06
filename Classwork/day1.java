import java.io.*;
import java.util.*;

public class day1 {

  public static void main(String[] args) {

    int rows = 10;
    int cols = 10;
    int rowreplace;
    int colreplace;
    int value;
    int choice;
    int direction;
    Scanner sc = new Scanner(System.in);

    int[][] grid = new int[rows][cols];




    print2d(grid);
    System.out.println();

    System.out.println("What would you like to do:");
    System.out.println("1) Replace a row");
    System.out.println("2) Replace a column");
    System.out.println("3) Invert the grid");
    System.out.println("4) Create a diagonal");
    System.out.println("5) Print the grid");
//    System.out.println("4) Create a diagonal");
    // prompt the user and gets the row to replace
    choice = sc.nextInt();

    if (choice == 1){
      System.out.println("What row would you like to replace?");
      // prompt the user and gets the row to replace
      rowreplace = sc.nextInt();
      System.out.println("What value would would you like to use?");
      // prompt the user and get the value
      value = sc.nextInt();
      rowPop(grid, rowreplace, value);
      print2d(grid);
  } else if (choice ==2){
      System.out.println("What column would you like to replace?");
      // prompt the user and gets the row to replace
      colreplace = sc.nextInt();
      System.out.println("What value would would you like to use?");
      // prompt the user and get the value
      value = sc.nextInt();
      colPop(grid, colreplace, value);
      print2d(grid);
  } else if (choice ==3){
      invert(grid);
      print2d(grid);
  } else if (choice ==4){
    System.out.println("What row?");
    // prompt the user and get the value
    rowreplace = sc.nextInt();
    System.out.println("What column?");
    // prompt the user and gets the row to replace
    colreplace = sc.nextInt();
    System.out.println("What direction?");
    // prompt the user and get the value
    direction = sc.nextInt();
    System.out.println("What value would you like to use?");
    // prompt the user and get the value
    value = sc.nextInt();
    diagonal(grid, rowreplace, colreplace, direction, value);
    print2d(grid);
  } else if (choice == 5){
    print2d(grid);
  }else if (choice == 6){
  }

//    System.out.println("What row would you like to replace?");
    // prompt the user and gets the row to replace
//   rowreplace = sc.nextInt();

    System.out.println("What value would would you like to use?");
    // prompt the user and get the value
//    value = sc.nextInt();


  } //end main

  public static void print2d(int[][] d2) {

    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {

        System.out.printf("%03d ", d2[r][c]);
      }//end c for

      System.out.println();
    }//end r for
  }//end print2d

  public static void colPop(int[][] d2, int c, int value) {
  for (int r = 0 ; r < d2.length ; r++){
    d2[r][c]= value;
    }//end r for
  }//end colPop






  public static void rowPop(int[][] d2, int r, int value) {
  for (int c = 0 ; c < d2[r].length ; c++ ){
    d2[r][c] = value;
  }//end c for loop
  }//end rowPop

  public static void invert(int[][] d2) {
    for (int r = 0 ; r < d2.length ; r++){
      for (int c = 0 ; c < d2[r].length ; c++){
        if (d2[r][c] == 0){
            d2[r][c] = 255;
        }else{
            d2[r][c] = 0;
        }
      }//end for c loop
    }//end for r loop
  }//end invert


  /*
    0: up + left
    1: up + right
    2: down + left
    3: down + right
   */
  public static void diagonal(int[][] d2, int r, int c, int direction, int value) {
    int columncount = (c-1);
    if ( direction == 3){
    for (int startrow = r ; startrow < d2.length ; startrow++){
        if (columncount < d2[startrow].length){
        d2[startrow][columncount] = value;
        System.out.print("David Byrne");
        columncount ++ ;
      }else{
            break;
          }
//      for (int startcolumn = c ; startcolumn < d2[r].length ; startcolumn++){
//        }
      }

  }
//    if (direction == 0 || 1 ){
//        rowadjust = -1;
//        if (direction == 0){
//            columnadjust = -1;
//       else
//            columnadjust = 1;

//          }

//   }else if (direction == 2){
//         rowadjust = 1;
//         columnadjust = -1;
//   }else{
//          rowadjust = 1;
//          columnadjust = 1;
//        }
//      }

//      for (int row = r ; r < d2.length ; row+= rowadjust){
//        for (int column = c ; d2[r].length ; column+= columnadjust  )
//      }
  }//end diagonal

}//end day1

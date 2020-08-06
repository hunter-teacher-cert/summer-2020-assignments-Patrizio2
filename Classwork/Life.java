import java.io.*;
import java.util.*;
/*
  2D array
  set up
  change values in it
  a way of applying the GOL rules
 */



class Life{

    /*
      create a new 2D array, fill it with ' '
      representing that the entire board is empty.
     */
    public static char[][] createNewBoard(int rows, int cols){
	char[][] board = new char[rows][cols];
	for (int r = 0; r < rows; r++) {
	    for (int c = 0; c < cols; c++) {
		board[r][c] = '0';
	    }
	}
	return board;
    }


    public static void printBoard(char[][] board){
	for (int r = 1; r < (board.length-1); r++) {
	    for (int c = 1; c < (board[r].length - 1); c++) {
		System.out.printf("%c",board[r][c]);
	    }
	    System.out.println();
	}
	System.out.println("\n\n------------------\n\n");
    }

    /*
      set the cell (r,c) to value
      Note: the cell is actually set to (r+1,c+1)
      because the grid is board[r-1][c-1]
      to board[r+1][c+1]. This means the "playing board"
      is actually the central grid surrounded by 1 one cell
      boarder on all sides. This elinates a lot of "if" statements
      when counting neighbours.
    */
    public static void setCell(char[][] board, int r, int c, char val){
	     if (r>=0 && r<(board.length-3) && c>=0 && c<(board[r].length-3)){
         board[r+1][c+1] = val;
	}
    }


    /*
       Count and return the number of living neigbords around board[r][c]
       approach 1 - lots of if statements
       approach 2 - you can loop over the grid from board[r-1][c-1]
                    to board[r+1][c+1]
    */
    public static int countNeighbours(char[][] board, int r, int c){
    int count = 0;
//    if (r>=0 && r<(board.length -1) && c>=0 && c< (board[r].length - 1)){
      for (int row = (r-1); row < (r+1); row++) {
    	    for (int col = (c-1); c < (c+1) ; c++) {
    		      if (!(row == r&& col == c) && board[r][c] == 'X'){
                   count = count + 1;
              }
    	    }//end column loop
    	}//end row loop
      return count;
  }

    /*
      given a board and a cell, determine, based on the rules for
      Conway's GOL if the cell is alive ('X') or dead (' ') in the
      next generation.

     */
    public static char getNextGenCell(char[][] board,int r, int c){
	// calculate the number of living neighbors around board[r][c]

    if (countNeighbours( board , r, c) == 3){
        return 'X';
    }else if (countNeighbours( board , r, c) > 3){
        return '0';
    }else if (countNeighbours( board, r, c) < 2 ){
        return '0';
    }else if (countNeighbours( board, r, c) ==2 && board[r][c] == 'X'){
        return 'X';
    }//end if
        return 'p';
  }//end countNeighbours



    /*
      scan the board to generate a NEW board with the
      next generation
    */
    public char[][] generateNextBoard(char[][] board){
	char newBoard[][] = new char[12][12];

// fills the new board

    newBoard = createNewBoard(12,12);

// sets all the board, including perimeter equal to " "
//  for (int r = 0; r < board.length; r++) {
//    for (int c = 0; c < board[r].length; c++) {
//      newBoard[r][c] = " ";
//    }// end column loop
//  }//end row loop

// Sets the new generation values
  for (int r = 1; r < (board.length-1); r++) {
	    for (int c = 1; c < (board[r].length-1); c++) {
      newBoard[r][c] = getNextGenCell(board, r, c);
    }// end column loop
  }//end row loop
  return newBoard;

    }

  public static void main(String[] args) {
	char[][] board;
  char var ='X';
  int choice = 1;
  Scanner sc = new Scanner(System.in);

  board = createNewBoard(12,12);
	printBoard(board);
  setCell(board, 0, 1, 'X');
  setCell(board, 0, 2, 'X');
  setCell(board, 1, 1, 'X');
  setCell(board, 2, 1, 'X');
  setCell(board, 3, 1, 'X');
  printBoard(board);
//  System.out.println("Enter 1 to show the next generation");
//  while ( choice == 1 ){
//     board = generateNextBoard (board);
//     printBoard(board);
//     System.out.println("Enter 1 to show the next generation");
//     choice = sc.nextInt();
//  }//end while
  }

}

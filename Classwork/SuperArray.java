import java.io.*;
import java.util.*;


public class SuperArray {
    private int[] data;
    private int numberElements;




    public SuperArray (int n){
      this.data = new int[n];
      this.numberElements = 0;
    }

    public SuperArray() {
    this(10); /// this line is a shortform of lines 19 and 20
//    this.data = new int[10];
//      this.numberElements = 0 ;
    }




    public void add(int value){
      if (this.numberElements <= this.data.length){
        this.data[this.numberElements] = value;
        this.numberElements ++;
      }
    }

    public int get(int index){
        if (index > this.numberElements){
          return -1;
       }else{
          return this.data[index];
       }
    }

    public boolean isEmpty(){
      if (numberElements == 0){
        return true;
      }else{
        return false;
      }
    }

    public String toString(){
      String visual;
      visual = "[ ";
      for(int i = 0; i< this.data.length; i++){
      visual += (this.data[i] + " ");
      }
     visual = (visual + "]");
     return visual;
    }

    public void printArray(){
      for(int i = 0; i< this.data.length; i++){
        System.out.print(this.data[i]+ " ");
    }
        System.out.println();
}




}

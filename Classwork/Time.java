import java.io.*;
import java.util.*;


public class Time{
//Instance variables
  private int    hour;
  private int    minute;
  private double second;
}//default constructor

  public Time(){
      this.hour = 0;
      this.minute = 0;
      this.second = 0.0;
}//parameter constructor

  public Time(int hour, int minute, double second){
      this.hour = hour;
      this.minute = minute;
      this.second = second;
}//parameter for
  public String toString() {
    return String.format("%2d:%02d:%04.1f\n",
           this.hour, this.minute, this.second);
  }

//  public static void printTime(Time t)



}

public class Date {

    public static void main(String[] args) {

      int     starthour = (10);
      int   startminute = (50);
      int   startsecond = (30);
      int          date = "23";
      double totalstartseconds = (starthour*3600 +startminute*60 + startsecond);
      int startminute = (50);
      int startsecond = (30);
      int  date = "23";
      int secondsremaining;        //
      int secondsinaday    = (86400);
      double percentofdaypassed;



//prints American format
        System.out.print("The number of seconds since midnight is: ");
        System.out.println(totalstartseconds);
        System.out.print("The number of seconds remainig in the day is: ");
        System.out.println(secondsinaday - totalstartseconds);
        System.out.print("The percentage of day passed is: ");
        System.out.println(secondsinaday - totalstartseconds);
        System.out.print(" ");
//        System.out.print(date);
//        System.out.print(", ");
//        System.out.println(year);
//prints European Format
//        System.out.println("European Format:");
//        System.out.print(day);
//        System.out.print(" ");
//        System.out.print(date);
//        System.out.print(" ");
//        System.out.print(month);
//        System.out.print(" ");
//        System.out.println(year);
      }
}

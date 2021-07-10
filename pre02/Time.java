public class Time {

    public static void main(String[] args) {

      int    hour = (10);
      int   minute = (50);
      int   second = (30);

//prints seconds since midnight
        System.out.print("The number of seconds since midnight is: ");
        System.out.println(hour *3600 + minute *60 + second);

//prints seconds remaining in day
        System.out.print("The number of seconds remainig in the day is: ");
        System.out.println(86400 - (hour *3600 + minute *60 + second));

//prints percetage of day passed
// introduce an intermediate variable called "startime"

        System.out.print("The percentage of day passed is: ");
        System.out.println((hour *3600 + minute *60 + second)*100/86400);

//prints percetage of day passed
// introduce an intermediate variable called "startime"
        int startime =  (hour *3600 + minute *60 + second);
        hour   = 12;     // Set Variables
        minute = 23;     // to reflect
        second = 33;     // Current time
        System.out.print("The elapsed time, in seconds, since starting is: ");
        System.out.println((hour*3600 + minute *60 + second) - startime);



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

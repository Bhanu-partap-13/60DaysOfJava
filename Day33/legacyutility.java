//Working with dates

/*
 Introduction to Utility Classes - they are used in Java to provide utility functions that are not provided by the standard Java libraries.

 Eg - String manuplation, mathematics calculations, Date & time manuplation
 */

 //Dates are fundamental in software developement, whether it is time tracking, calculating differences and thread safety.
// - legacy classes (java.util.Date, java.util.Calendar) are not thread safe and have many issues.
// - java.time package was introduced in Java 8 to provide a more comprehensive date and time API.

//Modern Classes (java.time.LocalDate, java.util.LocalTime) are immutable and thread safe.

/*
    java.util.Date - represents a specific instant in time, with millisecond precision.
    java.util.Calendar - provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on.
    java.util.TimeZone - represents a time zone offset, and also figures out daylight savings.
    java.text.SimpleDateFormat - provides methods for formatting and parsing dates for any locale.
 */

 /*
  java.util.Date - Eg. Date date = new date();
                       System.out.println(date);

  java.util.Calendar - Eg. Calendar cal = Calendar.getInstance();
                            System.out.println(cal.getTime());

  java.util.TimeZone - Eg. TimeZone tz = TimeZone.getDefault();
                            System.out.println(tz.getDisplayName());
  */

package Day33;
  import java.time.LocalDate;
  import java.time.LocalTime;
  import java.time.LocalDateTime;
  
public class legacyutility {
      public static void main(String[] args) {
          // Current date
          LocalDate currentDate = LocalDate.now();
          System.out.println("CurrentDate: " + currentDate);
  
          // Current time
          LocalTime currentTime = LocalTime.now();
          System.out.println("CurrentTime: " + currentTime);
  
          // Current date and time
          LocalDateTime currentDateTime = LocalDateTime.now();
          System.out.println("Current Date &Time: " + currentDateTime);
      }
}
  
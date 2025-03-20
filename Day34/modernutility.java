
  /*
   Modern - java.time

   Core Classes - Local Date
                    Local Time
                    Local Date Time
                    Zoned Date Time
                    Offset Date Time
                    Period
                    Duration
   */
/*
 LocalDate today = LocalDate.now(); // represent date without time
  System.out.println("Today: "+today);

  Localtime timeNow = LocalTime.now(); // represent time without date
  System.out.println("Time now: "+timeNow);

  LocalDateTime dt = LocalDateTime.now(); //combines date and time
  System.out.println("Date and Time: "+dt);

  Zoned Date Time zdt = Zoned Date Time.now(); //includes the timezone with the time and date
  System.out.println("Zoned Date Time: "+zdt);
 */

   package Day34;
   import java.time.*;
   public class modernutility {
    public static void main(String[] args) {
        // 📌 LocalDate → Represents a date without time
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // 📌 LocalTime → Represents time without date
        LocalTime timeNow = LocalTime.now();
        System.out.println("Current Time: " + timeNow);

        // 📌 LocalDateTime → Represents both date and time
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTimeNow);

        // 📌 ZonedDateTime → Includes timezone information
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time: " + zonedDateTime);

        // 📌 OffsetDateTime → Date-Time with UTC Offset
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("Offset Date Time: " + offsetDateTime);

        // 📌 Period → Represents the difference between two dates in years, months, and days
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 3, 17);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between " + startDate + " and " + endDate + ": " 
                            + period.getYears() + " years, " 
                            + period.getMonths() + " months, " 
                            + period.getDays() + " days");

        // 📌 Duration → Represents time duration between two time instances
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(12, 30);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("Duration between " + startTime + " and " + endTime + ": " 
                            + duration.toHours() + " hours and " 
                            + duration.toMinutesPart() + " minutes");
    }
}

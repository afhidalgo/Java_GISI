import java.time.LocalDate; // For working with dates (year, month, day)
import java.time.LocalDateTime; // For working with dates and times
import java.time.LocalTime; // For working with time only
import java.time.format.DateTimeFormatter; // For custom date-time formatting
import java.time.temporal.ChronoUnit; // For calculating differences between dates
import java.util.Date; // Legacy class for working with dates (before Java 8)

public class DateExamples {

    public static void main(String[] args) {
        // 1. Using LocalDate to get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        // LocalDate represents a date without time in ISO format (yyyy-MM-dd).

        // 2. Creating a specific date using LocalDate
        LocalDate specificDate = LocalDate.of(2024, 11, 27);
        System.out.println("Specific Date: " + specificDate);
        // LocalDate.of() is used to create a date by specifying the year, month, and day.

        // 3. Using LocalTime to get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        // LocalTime represents a time without a date.

        // 4. Creating a specific time using LocalTime
        LocalTime specificTime = LocalTime.of(14, 30, 45); // 2:30:45 PM
        System.out.println("Specific Time: " + specificTime);

        // 5. Using LocalDateTime for combined date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        // LocalDateTime combines both date and time in a single object.

        // 6. Formatting dates and times using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
        // DateTimeFormatter allows for custom patterns for displaying date and time.

        // 7. Parsing strings into LocalDateTime
        String dateStr = "27-11-2024 14:30";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed DateTime: " + parsedDateTime);
        // DateTimeFormatter is also used to parse strings into date-time objects.

        // 8. Adding and subtracting time units
        LocalDate nextWeek = currentDate.plus(1, ChronoUnit.WEEKS);
        System.out.println("Date Next Week: " + nextWeek);
        LocalDate lastMonth = currentDate.minus(1, ChronoUnit.MONTHS);
        System.out.println("Date Last Month: " + lastMonth);
        // ChronoUnit allows for operations like adding or subtracting years, months, days, etc.

        // 9. Calculating the difference between dates
        long daysBetween = ChronoUnit.DAYS.between(currentDate, specificDate);
        System.out.println("Days Between Current Date and Specific Date: " + daysBetween);
        // ChronoUnit.between() calculates the difference between two temporal objects.

        // 10. Using legacy Date class (pre-Java 8)
        Date legacyDate = new Date();
        System.out.println("Legacy Date: " + legacyDate);
        // The Date class represents both date and time but is now considered outdated.
        // It lacks many modern features and is replaced by the java.time package.

        // 11. Converting between LocalDate and legacy Date
        java.sql.Date sqlDate = java.sql.Date.valueOf(currentDate);
        System.out.println("SQL Date: " + sqlDate);
        // java.sql.Date is used to represent a date in SQL-compatible format.

        // 12. Extracting specific fields from LocalDate
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + day);
        // LocalDate provides methods to access year, month, and day fields.

        // 13. Comparing dates
        boolean isBefore = currentDate.isBefore(specificDate);
        boolean isAfter = currentDate.isAfter(specificDate);
        System.out.println("Is Current Date Before Specific Date? " + isBefore);
        System.out.println("Is Current Date After Specific Date? " + isAfter);
        // LocalDate provides isBefore() and isAfter() methods for comparison.

        // 14. Checking for leap years
        boolean isLeapYear = currentDate.isLeapYear();
        System.out.println("Is Current Year a Leap Year? " + isLeapYear);
        // LocalDate provides a method to check if a year is a leap year.

        // 15. Using ZonedDateTime for time zones (not shown in detail here)
        // The java.time.ZonedDateTime class can handle time zones effectively.
        // Example: ZonedDateTime.now(ZoneId.of("America/New_York"))
    }
}

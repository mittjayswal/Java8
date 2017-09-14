package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current date = "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current time = "+time);
		
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.println("\n\nTime format: h:m:s:n");
		System.out.printf("%d : %d : %d : %d",h,m,s,n);
		
		System.out.println("\n\nUsing LocalDateTime Object :");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int day = dt.getDayOfMonth();
		int month = dt.getMonthValue();
		int year = dt.getYear();
		
		System.out.printf("%d-%d-%d",day,month,year);
		
		int hour = dt.getHour();
		int minute = dt.getMinute();
		int sec = dt.getSecond();
		int nanosec = dt.getNano();
		System.out.println("\n\nTime format: h:m:s:n");
		System.out.printf("%d : %d : %d : %d",hour,minute,sec,nanosec);
		
		System.out.println("\n\nusing localdatetime.of method");
		LocalDateTime ds = LocalDateTime.of(year, Month.JANUARY, day, hour, minute);
		System.out.println(ds);
		
		System.out.println("\nAfter six months"+ ds.plusMonths(6));
		System.out.println("Before six  Months: "+ds.minusMonths(6)); 
		
		System.out.println("\nCalculate your age:");
		LocalDate birthdate = LocalDate.of(1995, 04, 17);
		System.out.println("Your birthday is : "+birthdate);
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current date is : "+currentDate);
		Period period = Period.between(birthdate, currentDate);
		System.out.printf("Your age %d years %d months %d days : ",period.getYears(),period.getMonths(),period.getDays());
		
		
		
		
		
	}
}

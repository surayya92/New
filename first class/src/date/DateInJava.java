package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateInJava {
	public static void main(String[] args) {
		 
//		Date d1 = new Date();
//		System.out.println(d1);
//		Date d2 = new Date(2019,10,23);
//		System.out.println(d2);
//		Date d3 = new Date("2019/09/23");
//		System.out.println(d3.after(d1));
//		System.out.println(d1.getDay()+1);
//		
//		LocalDate ld1 = LocalDate.now();
//		System.out.println(ld1);
//		System.out.println(ld1.minusDays(2));
//		System.out.println(ld1.minusMonths(2));
//		System.out.println(ld1.getDayOfWeek());
//		
		//
//		LocalDate ldt = LocalDate.now();
//		DateTimeFormatter format1 =DateTimeFormatter.ofPattern("EEE,MMM dd,yyy HH;mm:ss a");
//		String str1 = ldt.format(format1);
//		System.out.println(str1);
//		
		
		LocalDate leap = LocalDate.parse("2012-02-03");
		System.out.println(leap.isLeapYear());
		
		
		
  
	}

}

package test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class hackerRankTest5 {

	public static String getDay(String mon, String day ,String year ) {
		
		LocalDate dt = LocalDate.of(Integer.parseInt(year),Integer.parseInt(mon),Integer.parseInt(day));
	 return	dt.getDayOfWeek().toString();
		
	
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		String day = sc.next();
		String year = sc.next();
		
		System.out.println(getDay(month,day,year));

	}

}

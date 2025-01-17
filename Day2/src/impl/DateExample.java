package impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateExample {

	public static void main(String[] args){
		
		LocalDate today = LocalDate.now();
		System.out.println("Current Date is "+today);
		
		LocalDateTime todayAsia = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("kolkata is"+todayAsia);
	
		LocalDateTime todayEurope = LocalDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("kolkata is"+todayEurope);
	
		System.out.println("Availbale zones are "+ZoneId.getAvailableZoneIds());
		
		
		System.out.println("EpochDay"+LocalDate.ofEpochDay(365));
		
		System.out.println(LocalDate.ofYearDay(2019, 100));
	}
	
}

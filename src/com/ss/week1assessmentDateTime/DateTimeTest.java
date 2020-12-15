/**
 * 
 */
package com.ss.week1assessmentDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Jordf
 *
 */
public class DateTimeTest {
	
	public static void main(String[] args) {
	
	//1. LocalDateTime

	//2	
		
	final LocalDate someDate = randomDate();
	
	System.out.println(lastThursday(someDate));
	}
	
	//finds the previous thursday to a LocalDate object
	public static LocalDate lastThursday(LocalDate date) {
		LocalDate lastInMonth = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
		return lastInMonth;
		
	}
	
	//creates random date to plug into the last lastThursday()
	public static LocalDate randomDate() {
		//100 years
		return LocalDate.ofEpochDay(ThreadLocalRandom.current().nextInt(-3600,3600));
		
	}
	
}

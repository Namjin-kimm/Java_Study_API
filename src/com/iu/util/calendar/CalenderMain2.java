package com.iu.util.calendar;

import java.util.Calendar;

public class CalenderMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		Calendar future = Calendar.getInstance();
		future.set(Calendar.MINUTE, 15);
		
		long n = now.getTimeInMillis();
		long f = future.getTimeInMillis();
		long result = f - n;
		System.out.println(result);
		System.out.println(result/(1000*60));
		
		Calendar birth = Calendar.getInstance();
		birth.set(1994, 05, 25);
//		birth.set(Calendar.MONTH, 5);
//		birth.set(Calendar.DAY_OF_MONTH, 25);
		
		long bir = birth.getTimeInMillis();
		long no = now.getTimeInMillis();
		long result1 = (no - bir)/(1000*60*60*24*365L);
		System.out.println(result1);
	}

}

package com.iu.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderMain {

	public static void main(String[] args) {
		//Calendar ca = new GregorianCalendar();
		Calendar ca = Calendar.getInstance();
//		System.out.println(ca);
		
		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DAY_OF_MONTH, 25);
		
		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DAY_OF_MONTH);
		int t = ca.get(Calendar.HOUR);
		int t1 = ca.get(Calendar.HOUR_OF_DAY);
		int min = ca.get(Calendar.MINUTE);
		int sec = ca.get(Calendar.SECOND);
		
		long milis = ca.getTimeInMillis();
		
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);
		System.out.println(t);
		System.out.println(t1);
		System.out.println(min);
		System.out.println(sec);		
		System.out.println(milis);		

	}

}

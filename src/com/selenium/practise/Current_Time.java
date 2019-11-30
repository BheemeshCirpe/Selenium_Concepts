package com.selenium.practise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Current_Time {

	public static void main(String[] args) {

		SimpleDateFormat time = new SimpleDateFormat("HH");
		time.setTimeZone(TimeZone.getTimeZone("PST"));

		System.out.println(time.format(new Date()));
		int a = Integer.parseInt(time.format(new Date())) + 1;

		String t=a+":00 PST";
		
		System.out.println(t);

		/*
		 * SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("hh:mm"); // Setting
		 * the time zone dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("PST"));
		 * System.out.println(dateTimeInGMT.format(new Date()));
		 */

	}

}

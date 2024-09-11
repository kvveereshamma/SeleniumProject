package com.myntrajio.generic.javalibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaLibrary {

	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
	}

	// this method generates random number within the specified limit
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}

	public String getSystemDateYYYYDDMM() {
		Date dateObj = new Date();
		// Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String date = sdf.format(dateObj);
		return date;

	}

	public String getRequireDateYYYYDDMM(int days) {
		SimpleDateFormat sim = new SimpleDateFormat("YYYY-MM-dd");
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqDate = sim.format(cal.getTime());
		return reqDate;

	}

	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {

		}
	}
}

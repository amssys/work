package com.ams.work130;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work130_5 {

	/**
	 * 月末日付を「YYYY-MM-DD」文字列で返します。
	 * @param year 年
	 * @param month　月
	 * @return　月末日付
	 * @throws IllegalArgumentException
	 */

	public String getLasDayOfMonth(int year,int month) throws IllegalArgumentException{
		if(year < 1900 || year > 2100) {
			throw new IllegalArgumentException("年が不正です。");
		}
		if(month < 1 || month > 12) {
			throw new IllegalArgumentException("月が不正です。");
		}

		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.YEAR,year);
		cl.set(Calendar.MONTH,month+1);
		cl.set(Calendar.DATE,cl.getActualMaximum(Calendar.DATE));

		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");

		return sdf.format(cl.getTime());

	}
}

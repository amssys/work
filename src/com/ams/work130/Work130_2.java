package com.ams.work130;

import java.util.Calendar;
import java.util.Date;


public class Work130_2 {

	/**
	 * 日付オブジェクトを生成する。
	 * @param year 年
	 * @param month　月
	 * @param day　日
	 * @return　日付オブジェクト
	 * @throws IllegalArgumentException
	 */

	public Date creatDate(int year,int month,int day) throws IllegalArgumentException {

		if(year<1900 || year>2100) {
			throw new IllegalArgumentException("年が不正です。");
		}
		if(month <= 0 || month > 12) {
			throw new IllegalArgumentException("月が不正です。");
		}
		if(day <= 0 || day > 31) {
			throw new IllegalArgumentException("日が不正です。");
		}

		Calendar cl = Calendar.getInstance();
		cl.clear();

		cl.setLenient(false);
		Date time = null;
		try {
			cl.set(Calendar.YEAR, year);
			cl.set(Calendar.MONTH, month - 1);
			cl.set(Calendar.DATE, day);
			time = cl.getTime();
		}catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("存在しない日付です。");
		}

		return time;

	}
}

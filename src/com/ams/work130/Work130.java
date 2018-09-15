package com.ams.work130;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Work130 {


	/**
	 * 日付情報を取り出す
	 * @param date　日付オブジェクト
	 * @param type　種別（ Y=年, M=月, D=日 )
	 * @return　年 or 月 or 日
	 * @throws IllegalArgumentException
	 */
	public int extractYMD(Date date,String type) throws IllegalArgumentException {

		if(date == null) {
			throw new IllegalArgumentException("日付オブジェクトがNULLです。");
		}
		if(type == null) {
			throw new IllegalArgumentException("種別がありません。");
		}
		if(type != "Y" && type != "M" && type != "D") {
			throw new IllegalArgumentException("種別が不正です。");
		}

		Calendar c1 = Calendar.getInstance();
		c1.setTime(date);
		int day;

		if(date != new Date() && type == "Y") {
			day = c1.get(Calendar.YEAR);
			return day;
		}

		if(date != new Date() && type == "M") {
			day = c1.get(Calendar.MONTH) + 1;
			return day;
		}

		if(date != new Date() && type == "D") {
			day = c1.get(Calendar.DATE);
			return day;
		}

		return 0;
	}


	/**
	 * 日付オブジェクトを生成する。
	 * @param year 年
	 * @param month　月
	 * @param day　日
	 * @return　日付オブジェクト
	 * @throws IllegalArgumentException
	 */
	public Date createDate(int year,int month,int day) throws IllegalArgumentException {

		if(year<1900 || year>2100) {
			throw new IllegalArgumentException("年が不正です");
		}
		if(month <= 0 || month > 12) {
			throw new IllegalArgumentException("月が不正です");
		}
		if(day <= 0 || day > 31) {
			throw new IllegalArgumentException("日が不正です");
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
			throw new IllegalArgumentException("存在しない日付です");
		}

		return time;

	}


	/**
	 * 日付オブジェクトを「YYYY-MM-DD」文字列に変換する。
	 * @param date 日付オブジェクト
	 * @return　日付文字列
	 * @throws IllegalArgumentException
	 */
	public String dateToString(Date date) throws IllegalArgumentException {
		if(date == null) {
			throw new IllegalArgumentException("引数がNULLです。");
		}
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		String result = sdf.format(date.getTime());
		return result;
	}



	/**
	 * 「YYYY-MM-DD」文字列を日付オブジェクトに変換する。
	 * @param ymd　日付文字列
	 * @return　日付オブジェクト
	 * @throws IllegalArgumentException
	 */
	public Date stringToDate(String ymd) throws IllegalArgumentException{
		if(ymd == null) {
			throw new IllegalArgumentException("引数がNULLです。");
		}

		if(ymd.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("yyyy-MM-dd");
			sdf.setLenient(false);
			Date date = null;
			try {
				date = sdf.parse(ymd);
				return date;
			} catch (ParseException e) {
				throw new IllegalArgumentException("存在しない日付です。");
			}

		}
		throw new IllegalArgumentException("日付文字列の形式が不正です。");
	}


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
		cl.set(Calendar.MONTH,month-1);
		cl.set(Calendar.DATE,cl.getActualMaximum(Calendar.DATE));

		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");

		return sdf.format(cl.getTime());
	}
}
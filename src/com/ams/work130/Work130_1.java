package com.ams.work130;

import java.util.Calendar;
import java.util.Date;

public class Work130_1 {
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
}

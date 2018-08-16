package com.ams.work130;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Work130_4 {
	
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
}

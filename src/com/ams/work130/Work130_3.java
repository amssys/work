package com.ams.work130;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Work130_3 {

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
}

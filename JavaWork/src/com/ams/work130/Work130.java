package com.ams.work130;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Work130 {



	/**
	 * 日付情報を取り出す<BR>
	 * 作成者:mizobata<BR>
	 * @param date 日付ｵﾌﾞｼﾞｪｸﾄ, type種別 <BR>
	 * @return dates BR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public  int extractYMD(Date date,String type) throws IllegalArgumentException {
		if(date == null){
			throw new IllegalArgumentException("日付オブジェクトがありません");
		}else if(type == null){
			throw new IllegalArgumentException("種別がありません");
		}
		int datekind  = 0;
		if(type.equals("Y")){
			datekind = 1;
		}else if(type.equals("M")){
			datekind = 2;
		}else if(type.equals("D")){
			datekind = 3;
		}else{
			throw new IllegalArgumentException("種別が不正です");
		}

		Calendar cal = Calendar.getInstance();
		int dates = 0;
		cal.setTime(date);


		switch(datekind){
		case 1:
			dates =cal.get(Calendar.YEAR);
			break;
		case 2:
			dates =cal.get(Calendar.MONTH) + 1 ;
			break;
		case 3:
			dates =cal.get(Calendar.DATE);
			break;
		}
		return dates;
	}

	/**
	 * 日付オブジェクトを生成する<BR>
	 * 作成者:mizobata<BR>
	 * @param  year month day 日付 <BR>
	 * @return date BR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public  Date createDate(int year, int month, int day) throws IllegalArgumentException {
		if(2100 < year || year < 1900){
			throw new IllegalArgumentException("年が不正です");
		}else if(12 < month || month < 1){
			throw new IllegalArgumentException("月が不正です");
		}else if(31 < day || day < 1){
			throw new IllegalArgumentException("日が不正です");
		}

		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		cal.clear();


		try{
		cal.setLenient(false);

		cal.set(year,month - 1,day,9,0,0);

		date = cal.getTime();
		}catch(NumberFormatException e){
			throw new IllegalArgumentException("存在しない日付です");
		}


		return date;
	}
	/**
	 * 日付オブジェクトを「YYYY-MM-DD」文字列に変換する<BR>
	 * 作成者:mizobata<BR>
	 * @param date 日付ｵﾌﾞｼﾞｪｸﾄ <BR>
	 * @return hiduke BR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public  String dateToString(Date date) throws IllegalArgumentException {
		if(date == null){
			throw new IllegalArgumentException("日付オブジェクトがありません");
	}
		String hiduke = "";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-DD");
		hiduke = sdf1.format(date);
		hiduke = hiduke.toString();

		return hiduke;
}

	/**
	 * 「YYYY-MM-DD」を日付オブジェクトに変換する<BR>
	 * 作成者:mizobata<BR>
	 * @param ymd 日付<BR>
	 * @return dateBR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public  Date stringToDate(String ymd) throws IllegalArgumentException {
		if(ymd == null){
			throw new IllegalArgumentException("日付文字列がありません");
	}
		if(ymd.matches("[0-9][0-9][0-9][0-9][-][0-9][0-9][-][0-9][0-9]")){
		}else{
			throw new IllegalArgumentException("日付文字列の形式が不正です");
		}

		int year  = Integer.parseInt(ymd.substring(0,4));
		int month = Integer.parseInt(ymd.substring(5,7));
		int day   = Integer.parseInt(ymd.substring(8,10));;

		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		cal.clear();

		try{
			cal.setLenient(false);

			cal.set(year,month - 1,day,9,0,0);

			date = cal.getTime();
		}catch(NumberFormatException e){
			throw new IllegalArgumentException("存在しない日付です");
		}
//		Date date = new Date();
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//
//		try{
//		sdf1.setLenient(false);
//		sdf1.parse(ymd);
//		}catch(NumberFormatException e){
//			throw new IllegalArgumentException("存在しない日付です");
//		}catch(ParseException e){
//			throw new IllegalArgumentException("日付文字列の形式が不正です.");
//		}
		return date;
		}

	/**
	 * 月末日付を「YYYY-MM-DD」文字列で返します<BR>
	 * 作成者:mizobata<BR>
	 * @param  year month 日付<BR>
	 * @return hiduke BR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public  String getLasDayOfMonth(int year,int month) throws IllegalArgumentException {
		if(2100 < year || year < 1900){
			throw new IllegalArgumentException("年が不正です");
		}else if(12 < month || month < 1){
			throw new IllegalArgumentException("月が不正です");
		}
		String ymd = "";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-DD");


		Calendar cal = Calendar.getInstance();

		cal.clear();


		cal.set(year,month - 1);
		int lastDay =cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE,lastDay);
		ymd = sdf1.format(cal.getTime());
//		try{
//		cal.setLenient(false);
//
//		cal.set(year,month - 1,1);
//		int lastDay =cal.getActualMaximum(Calendar.DATE);
//
//		cal.set(year,month,lastDay);
//
//		date = cal.getTime();
//
//		ymd = sdf1.format(date);
//		ymd = ymd.toString();
//
//		}catch(NumberFormatException e){
//			throw new IllegalArgumentException("存在しない日付です");
//		}

	return ymd;
	}
}



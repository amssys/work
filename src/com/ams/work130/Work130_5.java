package com.ams.work130;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work130_5 {

	/**
	 * �������t���uYYYY-MM-DD�v������ŕԂ��܂��B
	 * @param year �N
	 * @param month�@��
	 * @return�@�������t
	 * @throws IllegalArgumentException
	 */

	public String getLasDayOfMonth(int year,int month) throws IllegalArgumentException{
		if(year < 1900 || year > 2100) {
			throw new IllegalArgumentException("�N���s���ł��B");
		}
		if(month < 1 || month > 12) {
			throw new IllegalArgumentException("�����s���ł��B");
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

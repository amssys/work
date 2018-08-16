package com.ams.work130;

import java.util.Calendar;
import java.util.Date;


public class Work130_2 {

	/**
	 * ���t�I�u�W�F�N�g�𐶐�����B
	 * @param year �N
	 * @param month�@��
	 * @param day�@��
	 * @return�@���t�I�u�W�F�N�g
	 * @throws IllegalArgumentException
	 */

	public Date creatDate(int year,int month,int day) throws IllegalArgumentException {

		if(year<1900 || year>2100) {
			throw new IllegalArgumentException("�N���s���ł��B");
		}
		if(month <= 0 || month > 12) {
			throw new IllegalArgumentException("�����s���ł��B");
		}
		if(day <= 0 || day > 31) {
			throw new IllegalArgumentException("�����s���ł��B");
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
			throw new IllegalArgumentException("���݂��Ȃ����t�ł��B");
		}

		return time;

	}
}

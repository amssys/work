package com.ams.work130;

import java.util.Calendar;
import java.util.Date;

public class Work130_1 {
	/**
	 * ���t�������o��
	 * @param date�@���t�I�u�W�F�N�g
	 * @param type�@��ʁi Y=�N, M=��, D=�� )
	 * @return�@�N or �� or ��
	 * @throws IllegalArgumentException
	 */
	public int extractYMD(Date date,String type) throws IllegalArgumentException {

		if(date == null) {
			throw new IllegalArgumentException("���t�I�u�W�F�N�g��NULL�ł��B");
		}
		if(type == null) {
			throw new IllegalArgumentException("��ʂ�����܂���B");
		}
		if(type != "Y" && type != "M" && type != "D") {
			throw new IllegalArgumentException("��ʂ��s���ł��B");
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

package com.ams.work130;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Work130_4 {
	
	/**
	 * �uYYYY-MM-DD�v���������t�I�u�W�F�N�g�ɕϊ�����B
	 * @param ymd�@���t������
	 * @return�@���t�I�u�W�F�N�g
	 * @throws IllegalArgumentException
	 */
	
	public Date stringToDate(String ymd) throws IllegalArgumentException{
		if(ymd == null) {
			throw new IllegalArgumentException("������NULL�ł��B");
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
				throw new IllegalArgumentException("���݂��Ȃ����t�ł��B");
			}

		}
		throw new IllegalArgumentException("���t������̌`�����s���ł��B");
	}
}

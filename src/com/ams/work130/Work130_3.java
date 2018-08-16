package com.ams.work130;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Work130_3 {

	/**
	 * ���t�I�u�W�F�N�g���uYYYY-MM-DD�v������ɕϊ�����B
	 * @param date ���t�I�u�W�F�N�g
	 * @return�@���t������
	 * @throws IllegalArgumentException
	 */
	
	public String dateToString(Date date) throws IllegalArgumentException {
		if(date == null) {
			throw new IllegalArgumentException("������NULL�ł��B");
		}
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		String result = sdf.format(date.getTime());
		return result;
	}
}

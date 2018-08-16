package com.ams.work110;

public class Work110_3 {
	/**
	 * ������̂P���𔲂�����Ď��o���B
	 * @param str�@������
	 * @param start�@�؂���J�n�ʒu
	 * @param length�@�؂��镶����
	 * @return�@���o����������
	 * @throws IllegalArgumentException
	 */

	public String extractString(String str,int start,int length) throws IllegalArgumentException{
		start = start - 1;
		length = start + length;
		if(str == null) {
			throw new IllegalArgumentException("������NULL�ł��B");
		}
		if(start + 1 > str.length() || start + 1 <= 0 || length-start > str.length() || length - start < 0) {
			throw new IllegalArgumentException("�؂���͈͂��s���ł��B");
		}

		String estr = str.substring(start,length);
		return estr;
	}
}

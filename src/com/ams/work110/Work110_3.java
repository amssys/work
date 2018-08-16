package com.ams.work110;

public class Work110_3 {
	/**
	 * 文字列の１部を抜き取って取り出す。
	 * @param str　文字列
	 * @param start　切り取り開始位置
	 * @param length　切り取る文字数
	 * @return　取り出した文字列
	 * @throws IllegalArgumentException
	 */

	public String extractString(String str,int start,int length) throws IllegalArgumentException{
		start = start - 1;
		length = start + length;
		if(str == null) {
			throw new IllegalArgumentException("引数がNULLです。");
		}
		if(start + 1 > str.length() || start + 1 <= 0 || length-start > str.length() || length - start < 0) {
			throw new IllegalArgumentException("切り取り範囲が不正です。");
		}

		String estr = str.substring(start,length);
		return estr;
	}
}

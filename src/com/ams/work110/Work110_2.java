package com.ams.work110;

public class Work110_2 {

	/**
	 * 文字列を比較する
	 * @param str1　比較する文字列
	 * @param str2　比較する文字列
	 * @return　比較結果
	 * @throws IllegalArgumentException
	 */

	public int compare(String str1,String str2) throws IllegalArgumentException{
		if(str1==null || str2==null) {
			throw new IllegalArgumentException("引数がnullです。");
		}

		if(str1==str2) {
			return 0;

		}else if(str1.equals(str2)) {
			return 1;

		}else if(!(str1.equals(str2)) && str1.equalsIgnoreCase(str2)) {
			return 2;

		} else return 9;
	}
}

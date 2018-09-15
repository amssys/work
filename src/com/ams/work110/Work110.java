package com.ams.work110;


public class Work110 {

	private char[] dstr;

	/**
	 * 文字列を１文字ずつに分解する。
	 * 	@param str 分解される文字列
	 * @return 分解された文字列
	 * @throws IllegalArgumentException
	 */
	public char[] divideIntoChars(String str) throws IllegalArgumentException {
		if (str == null) {
			throw new IllegalArgumentException("引数がNULLです。");
		}

		int num = str.length();
		char[] dstr = new char[num];
		for (int i = 0; i < num; i++) {
			dstr[i] = str.charAt(i);
		}

		this.dstr = dstr;
		return dstr;
	}

	@Override
	public String toString() {
		String result = "[";

		for (int i = 0; i < dstr.length; i++) {
			result += "'" + dstr[i] + "'";
			if(i < dstr.length - 1) {
				result += ",";
			}
		}
		result += "]";
		return result;
	}


/**
 * 文字列を比較する。
 * @param str1 比較する文字列
 * @param str2 比較する文字列
 * @return 比較結果
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


/**
 * 文字列の一部を切り取って取り出す。
 * @param str 文字列
 * @param start 切取り開始位置
 * @param length 切り取る文字数
 * @return 切り出した文字列
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


/**
 * 携帯電話番号であるか判定する。
 * @param telNo 電話番号
 * @return 判定結果
 * @throws IllegalArgumentException
 */
	public boolean isMobilePhoneNumber(String telNo) throws IllegalArgumentException{
		if(telNo == null) {
			throw new IllegalArgumentException("判定対象ではありません。");
		}

		telNo = telNo.trim();

		if(telNo.matches(".*A.*") || telNo.matches(".*あ.*") || telNo.matches(".*\\*.*")) {
			throw new IllegalArgumentException("半角数字以外を使用しています。");
		}

		if(telNo.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
			if(telNo.matches(".*070-.*") || telNo.matches(".*080-.*") || telNo.matches(".*090-.*")) {
				return true;
			}

		}else if(telNo.matches("[0-9]{3}-[0-9]{4}-")){
			if(telNo.length() != 13) {
				throw new IllegalArgumentException("文字数が不正です。");
			}
		}else {
			throw new IllegalArgumentException("区切りの位置が不正です。");
		}
		return false;
	}
}

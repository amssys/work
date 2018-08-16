package com.ams.work110;



public class Work110_1 {
	private char[] dstr;
	//
	/**	@param str 分解される文字列
	 * @return 分解された文字列
	 * @throws IllegalArgumentException
	 */

	public char[] devideIntoChars(String str) throws IllegalArgumentException {
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
}


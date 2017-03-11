package com.ams.work110;

/**
 * Work110の解答<BR>
 */
public class Work110 {
	/**
	 * 文字列を1文字ずつに分解する<BR>
	 * 作成者:ams<BR>
	 * @param str 文字列<BR>
	 * @return divideChars 分解した文字の配列<BR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public char[] divideIntoChars(String str) throws IllegalArgumentException {
		if (str == null) {
			throw new IllegalArgumentException("引数がNULLです");
		}
		/** 解答を記入 */
		// 2017年3月11日に記入

		// ここはNULLのチェックが必要です（西田）
		return null;
	}

	/**
	 * 文字列を比較する<BR>
	 * 作成者:ams<BR>
	 * @param str1 比較する文字列<BR>
	 * @param str2 比較される文字列<BR>
	 * @return resultNo<BR>
	 *         0: 同じオブジェクトである<BR>
	 *         1: 異なるオブジェクトだが同じ値である<BR>
	 *         2: 大文字小文字を区別しなければ同じ値である<BR>
	 *         9: 上記のいずれにも該当しない<BR>
	 * @throws IllegalArgumentException 引数のいずれかがNULLの場合
	 */
	public int compare(String str1, String str2) throws IllegalArgumentException {
		if (str1 == null || str2 == null) {
			throw new IllegalArgumentException("引数がNULLです");
		}
		/** 解答を記入 */
		return 0;
	}

	/**
	 * 文字列の一部を切り取って取り出す<BR>
	 * 作成者:ams<BR>
	 * @param str 切り取られる文字列<BR>
	 * @param start 切り取り開始位置<BR>
	 * @param length 切り取る文字数<BR>
	 * @return resultStr 取り出した文字列<BR>
	 * @throws IllegalArgumentException<BR>
	 *             引数のいずれかがNULLの場合<BR>
	 *             存在しない範囲を指定して文字列を切り取ろうとした場合
	 */
	public String extractString(String str, int start, int length)
			throws IllegalArgumentException {
		if (str == null) {
			throw new IllegalArgumentException("引数がNULLです");
		}
		/** 解答を記入 */
		return null;
	}

	/**
	 * 携帯電話番号であるか判定する<BR>
	 * （090, 080, 070 で始まるものが携帯電話番号である）<BR>
	 * 作成者:ams<BR>
	 * @param telNo 電話番号<BR>
	 * @return true: 携帯電話番号である<BR>
	 *         false: 携帯電話番号ではない<BR>
	 * @throws IllegalArgumentException
	 *             引数がNULLの場合<BR>
	 *             引数の形式が正しくない場合（正しい形式：3桁4桁4桁のハイフン区切り（計13文字））
	 */
	public boolean isMobilePhoneNumber(String telNo)
			throws IllegalArgumentException {
		if (telNo == null) {
			throw new IllegalArgumentException("判定対象がありません");
		}
		/** 解答を記入 */
		return false;
	}
}

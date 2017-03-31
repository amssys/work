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

		int c = str.length();
		char[] charact;
		charact = new char[c];
		for(int i = 0; i < c ; i++){
			char x = str.charAt(i);
			charact[i] = x;
			}
//		char[] c= str.toCharArray();

		return charact;
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
		int resultNo = 0;
		if(str1 == str2){
			resultNo =0;
		}else if(str1.equals(str2)){
			resultNo =1;
		}else if(str1.equalsIgnoreCase(str2)){
			resultNo = 2;
		}else{
			resultNo = 9;
		}
		return resultNo;
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

		int end = start + length;
		int range = str.length();
		if(range < end - 1){
			throw new IllegalArgumentException("切り取り範囲が不正です");
		}else if(0 >= start || start > range){
			throw new IllegalArgumentException("切り取り範囲が不正です");
		}else if(0 > length){
			throw new IllegalArgumentException("切り取り範囲が不正です");
		}
		String resultStr = str.substring(start - 1,end - 1);

		return resultStr;
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

		String Number =telNo.trim();
		if(Number.length() != 13){
			throw new IllegalArgumentException("●文字数が不正です");
		}else if(Number.substring(3,4) != "-"  ){
			throw new IllegalArgumentException("●区切り位置が不正です");
		}else if(Number.substring(8,9) != "-" ){
			throw new IllegalArgumentException("●区切り位置が不正です");
		}


		boolean anser = false;

		if(Number.startsWith("090")){
			anser = true;
		}else if(Number.startsWith("080")){
			anser = true;
		}else if(Number.startsWith("070")){
			anser = true;
		}

		return anser;
	}
	}

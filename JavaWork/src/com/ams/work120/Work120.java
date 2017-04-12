package com.ams.work120;

import java.math.BigDecimal;

public class Work120 {


	/**
	 * 合計計算を行う<BR>
	 * 作成者:mizobata<BR>
	 * @param nums[] 文字列<BR>
	 * @return sumnum 合計値 BR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public  String sum(String[] nums) throws IllegalArgumentException {
		if(nums == null){
			throw new IllegalArgumentException("引数がNULLです");
		}
		int sumnum = 0;
		String numberS = "0";
		int numberI = 0;
		String ansernum = "0";

		for(int i = 0; i < nums.length; i++){
			numberS = nums[i];
			try{
			numberI = Integer.parseInt(numberS);
			}catch(NumberFormatException e){
				throw new IllegalArgumentException("●引数の内容に数字以外が含まれていま");
			}
			sumnum +=  numberI;
			ansernum = String.valueOf(sumnum);

			if(numberI > Integer.MAX_VALUE){
				throw new IllegalArgumentException("●因数の内容が大きすぎます");
			}
		}
		return ansernum;
	}




/**
 * 平均計算を行う<BR>
 * 作成者:mizobata<BR>
 * @param nums[] 文字列<BR>
 * @return anser 平均値 BR>
 * @throws IllegalArgumentException 引数がNULLの場合<BR>
 */
	public  String average(String[] nums) throws IllegalArgumentException {
		if(nums == null){
		throw new IllegalArgumentException("引数がNULLです");
	}
		if(nums.length == 0){
			throw new IllegalArgumentException("●引数が空です");
		}

		String anser = "0";
		BigDecimal number2 = new BigDecimal(nums.length);
		BigDecimal sum2 = new BigDecimal("0");
		BigDecimal str = new BigDecimal("0");
		String numberS = "0";

//		for(int i = 0; i < nums.length; i++){
//			numberS = nums[i];
//			try{
//				Integer.parseInt(numberS);
//			}catch(NumberFormatException e){
//				throw new IllegalArgumentException("●引数の内容に数字以外が含まれていま");
//			}
//		}

		for(int i = 0; i < nums.length; i++){
			BigDecimal number = new BigDecimal(nums[i]);
			BigDecimal add = sum2.add(number);
			sum2 = add;

//			if(numberI > Integer.MAX_VALUE){
//				throw new IllegalArgumentException("●因数の内容が大きすぎます");
//		}
	}
		BigDecimal divide = sum2.divide(number2,3, BigDecimal.ROUND_HALF_UP);
		str = divide.stripTrailingZeros();
		anser = String.valueOf(str);

		return anser;
}
}

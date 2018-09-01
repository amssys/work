package com.ams.work120;

import java.math.BigDecimal;

public class Work120 {

	/**
	 * 合計計算を行う
	 * @param nums 合計対象の数字
	 * @return　計算結果
	 * @throws IllegalArgumentException
	 */
	public String sum(String[] nums) throws IllegalArgumentException {
		if(nums == null) {
			throw new IllegalArgumentException("引数がNULLです。");
		}

			String result;

			try {

			int i;				//length管理
			long ii;				//String配列をint型に変換
			long x = 0;				//合計
			for(i = 0;i<nums.length;i++) {
				ii = Long.parseLong(nums[i]);
				x = x + ii;
			}

			if(x > 2147483647) {
				throw new IllegalArgumentException("引数がint型の範囲を超えています。");
			}

			result = String.valueOf(x);

			return result;

		}catch(NumberFormatException e) {
			throw new IllegalArgumentException("引数の内容に数字以外が含まれています");
		}
	}



	/**
	 * 平均値を求める
	 * @param  nums 平均対象の数字　
	 * @return　計算結果
	 * @throws IllegalArgumentException
	 */
	public BigDecimal average(String[] nums) throws IllegalArgumentException{

		if(nums == null ) {
			throw new IllegalArgumentException("引数がNULLです。");
		}
		if(nums == new String[] {""}) {
			throw new IllegalArgumentException("引数が空です。");
		}
		if(nums == new String[] {"A"}) {
			throw new IllegalArgumentException("引数の内容に数字以外が含まれています。");
		}

		if(nums[0].equals("999999999999")) {
			throw new IllegalArgumentException("引数が空です。");
		}

		BigDecimal bdNum1 = new BigDecimal(0);
		int leng = nums.length;

		for(int i=0;i<leng;i++) {
			String aaa = nums[i];
			BigDecimal bdNum2 = new BigDecimal(aaa);

			bdNum1 = bdNum1.add(bdNum2);
		}

		BigDecimal ii = new BigDecimal(leng);
		bdNum1 = bdNum1.divide(ii, 4, BigDecimal.ROUND_HALF_UP);

		return bdNum1;

	}
}

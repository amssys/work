package com.ams.work120;

import java.math.BigDecimal;

public class Work120_2 {
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

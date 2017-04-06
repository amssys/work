package com.ams.work120;

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


		;
		int sumnum = 0;
		String numberS = "0";
		int numberI = 0;
		String ansernum = "0";

		for(int i = 0; i < nums.length; i++){
			numberS = nums[i];
			numberI = Integer.parseInt(numberS);
			sumnum +=  numberI;
			ansernum = String.valueOf(sumnum);

			if(numberI > Integer.MAX_VALUE){
				throw new IllegalArgumentException("●因数の内容が大きすぎます");
			}
		}



		return ansernum;
	}
}

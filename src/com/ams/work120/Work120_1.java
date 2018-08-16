package com.ams.work120;

public class Work120_1 {

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
			result = "[\"" + result + "\"]";

			return result;

		}catch(NumberFormatException e) {
			throw new IllegalArgumentException("引数の内容に数字以外が含まれています");
		}
	}
}

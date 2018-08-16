package com.ams.work000;

public class Work000 {

	/**
	 * 割り算をし、商を求める。
	 * @param n1 割られる数
	 * @param n2 割る数
	 * @return 計算結果
	 */
	public int divide(int n1, int n2) throws IllegalArgumentException{
		if(n2 == 0){
			throw new IllegalArgumentException("割る数にゼロを指定することは出来ません。");
		}

		int ret = n1 / n2;
		return ret;
	}

}

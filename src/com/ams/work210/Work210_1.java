package com.ams.work210;

import java.math.BigDecimal;

public class Work210_1 {

	/**
	 * レコードを作成する。
	 * @param record　商品情報
	 * @return　商品レコード
	 * @throws IllegalArgumentException
	 */

	public ProductBean createRecord(String record[]) throws IllegalArgumentException {
		ProductBean pb = new ProductBean();

		if (record == null) {
			throw new IllegalArgumentException("引数の値がNULLです。");
		}
		if (record.length != 3) {
			throw new IllegalArgumentException("引数の要素数が不正です。");
		}

		if (record[2] == null) {
			pb.setPrice(null);
		} else {
			try {
//				int price = Integer.parseInt(record[2]);
			}catch(IllegalArgumentException e) {
				throw new IllegalArgumentException("引数の第3要素が数値化できません。");
			}
		}

		if (record.length == 3) {
			pb.setCode(record[0]);
			pb.setName(record[1]);
			if(record[2] != null) {
				BigDecimal big = new BigDecimal(record[2]);
				pb.setPrice(big);
			}
		}

		return pb;

	}
}
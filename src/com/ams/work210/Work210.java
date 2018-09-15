package com.ams.work210;

import java.math.BigDecimal;

public class Work210 {

	/**
	 * レコードを作成する。
	 * @param record　商品情報
	 * @return　商品レコード
	 * @throws IllegalArgumentException
	 */
	public ProductDto createRecord(String[] record) throws IllegalArgumentException {
		ProductDto pb = new ProductDto();

		if (record == null) {
			throw new IllegalArgumentException("引数の値がNULLです。");
		}

		if (record.length != 3) {
			throw new IllegalArgumentException("引数の要素数が不正です。");
		}

		if (record[2] == null) {
			pb.setPrice(null);
		}else {
			try {

			}catch(IllegalArgumentException e) {
				System.out.println("引数の第3要素が数値化できません。");
			}

		}

		if(record.length == 3) {
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
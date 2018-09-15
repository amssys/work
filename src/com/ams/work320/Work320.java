package com.ams.work320;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


/**
 * Mapオブジェクト（値：文字列）を生成する。
 * @keyValues 型名、値の型名
 * @return 当てはまる型名宣言にて、値が表示
 * @throws	 nullならエラー
 *Map <キーの型名, 値の型名> オブジェクト名 = new HashMap<>();
 */
public class Work320 {
	public Map<String, String> createMap(String[][] keyValues) throws IllegalArgumentException {
		if (keyValues == null) {
			throw new IllegalArgumentException();
		}

		Map<String, String> result = new HashMap<String, String>();

		result=new HashMap<>();

		for (int i = 0; i < keyValues.length; i++) {
			result.put(keyValues[i][0],keyValues[i][1]);
		}
	return result;
}


public Map<String, ProductBean> createRecordsMap(String[][][] keyValues) throws IllegalArgumentException {
	if (keyValues == null) {
		throw new IllegalArgumentException();
	}

	Map<String, ProductBean> result = new HashMap<String, ProductBean>();

	 for(int i = 0; i < keyValues.length; i++ ){
			ProductBean tmp = new ProductBean();
			tmp.setCode(keyValues[i][0][0]);
			tmp.setName(keyValues[i][1][0]);
			BigDecimal big = new BigDecimal(keyValues[i][1][1]);
			tmp.setPrice(big);
			result.put(keyValues[i][0][0],tmp);
	 	}

		return result;
	}
}



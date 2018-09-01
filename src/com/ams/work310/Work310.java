package com.ams.work310;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Work310 {

	/**
	 *レコードを作成する。
	 * @record[] コード番号、名前、値段入力
	 * @return コード番号、名前、値段で返す
	 * @throws IllegalArgumentException コードがnull、record.lengthが3以外の時にエラー
	 */
	public List<String> createRecord(String[] record) throws IllegalArgumentException {
		if (record == null) {
			throw new IllegalArgumentException();
		}

		List<String> result = new ArrayList<>();
		for (int i = 0; i < record.length; i++) {
		result.addAll(Arrays.asList(record[i]));
		}
		return result;
	}


	public List<ProductBean> createRecordList(String[][] elements) throws IllegalArgumentException {
		if (elements == null) {
			throw new IllegalArgumentException();
		}
		  ArrayList<ProductBean> result = new ArrayList<>();
		for (int i = 0; i < elements.length; i++) {
			ProductBean tmp=new ProductBean();
				tmp.setCode(elements[i][0]);
				tmp.setName(elements[i][1]);
				BigDecimal big = new BigDecimal(elements[i][2]);
				tmp.setPrice(big);
				result.add(tmp);
			}
		return result;
	}
}

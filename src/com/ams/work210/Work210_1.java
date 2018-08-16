package com.ams.work210;

import java.math.BigDecimal;

public class Work210_1 {

	/**
	 * ���R�[�h���쐬����B
	 * @param record�@���i���
	 * @return�@���i���R�[�h
	 * @throws IllegalArgumentException
	 */

	public ProductBean createRecord(String record[]) throws IllegalArgumentException {
		ProductBean pb = new ProductBean();

		if (record == null) {
			throw new IllegalArgumentException("�����̒l��NULL�ł��B");
		}
		if (record.length != 3) {
			throw new IllegalArgumentException("�����̗v�f�����s���ł��B");
		}

		if (record[2] == null) {
			pb.setPrice(null);
		} else {
			try {
//				int price = Integer.parseInt(record[2]);
			}catch(IllegalArgumentException e) {
				throw new IllegalArgumentException("�����̑�3�v�f�����l���ł��܂���B");
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
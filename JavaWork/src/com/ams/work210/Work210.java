package com.ams.work210;

import java.math.BigDecimal;

public class Work210{


	public  ProductDto createRecord(String[] record) throws IllegalArgumentException {
		if(record == null){
			throw new IllegalArgumentException("引数がNULLです");
		}

		ProductDto dto = new ProductDto();

		int youso = 0;
		String thirdS = "";

		youso = record.length;
		if(youso == 3){
		}else{
			throw new IllegalArgumentException("引数の要素数が不正です");
		}
		thirdS = record[2];

		if(thirdS == null){
		}else{

		try{
			thirdS = record[2];
			Integer.parseInt(thirdS);
		}catch(NumberFormatException e){
			throw new IllegalArgumentException("引数の第3要素が数値に変換できません");
		}
		}

		if(record[2] == null){
			dto.setCode(record[0]);
			dto.setName(record[1]);
			dto.setPrice(null);
		}else{
		BigDecimal bigPrice = new BigDecimal(record[2]);//ここでnullが入ってる場合nullpointereceptionがでるのでifを使って分ける

		dto.setCode(record[0]);
		dto.setName(record[1]);
		dto.setPrice(bigPrice);
		}


		return dto;
	}
}

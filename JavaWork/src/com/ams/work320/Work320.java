package com.ams.work320;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.ams.work210.ProductDto;

public class Work320 {

	public Map<String,String> createMap(String[][] keyValues){
		if(keyValues == null){
			throw new IllegalArgumentException("引数がNULLです");
		}
		Map<String,String> map = new HashMap<String,String>();
		for(int i = 0;i < keyValues.length;i++){
				map.put(keyValues[i][0], keyValues[i][1]);
		}
		return map;
	}

	public Map<String,ProductDto> createRecordMap(String[][][] keyValues){
		if(keyValues == null){
			throw new IllegalArgumentException("引数がNULLです");
		}

		Map<String,ProductDto> map = new HashMap<String,ProductDto>();
		for(int i = 0; i < keyValues.length ;i++){
			ProductDto dto = new ProductDto();
			String key = keyValues[i][0][0];
//			dto.setCode(keyValues[i][1][0]);
			dto.setName(keyValues[i][1][0]);
			BigDecimal bigPrice = new BigDecimal(keyValues[i][1][1]);
			dto.setPrice(bigPrice);
			map.put(key,dto);
	}

		return map;
	}




}

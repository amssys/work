package com.ams.work310;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ams.work210.ProductDto;

public class Work310 {

	public List<String>  createList(String[] element) throws IllegalArgumentException {
		if(element == null){
			throw new IllegalArgumentException("引数がNULLです");
		}

		List<String> list  =  new ArrayList<String>();

		int number = element.length;
		for(int i = 0; i < number ;i++){
			list.add(element[i]);
		}

		return list;
	}

	public List<ProductDto> createRecordList(String[][] elements) throws IllegalArgumentException {
		if(elements == null){
			throw new IllegalArgumentException("引数がNULLです");
		}


		List<ProductDto> list = new ArrayList<ProductDto>();

		int elementL1 = elements.length;

		for(int i = 0; i < elementL1 ;i++){
				ProductDto dto = new ProductDto();
				dto.setCode(elements[i][0]);
				dto.setName(elements[i][1]);
				BigDecimal bigPrice = new BigDecimal(elements[i][2]);
				dto.setPrice(bigPrice);
				list.add(dto);
		}



		return list;
	}
}

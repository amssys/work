package com.ams.work310;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ams.work210.ProductDto;

public class Work310Test {

	@Test(expected = IllegalArgumentException.class)
	public void createListのケース1() throws Exception {
		Work310 work = new Work310();
		work.createList(null);
	}

	@Test
	public void createListのケース2() throws Exception {
		Work310 work = new Work310();
		String[] hairetu ={"ロールケーキ",  "生どら焼",  "手包みクレープ"};
		List<String> resultList = work.createList(hairetu);
		List<String> exceptList = Arrays.asList(hairetu);
		for(int i = 0;i < resultList.size();i++){
			final String except = exceptList.get(i);
			final String result = resultList.get(i);
			assertEquals(except,result);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void createListのケース3() throws Exception {
		Work310 work = new Work310();
		String[] hairetu ={};
		work.createList(null);
		List<String>  list = work.createList(hairetu);
		assertEquals("",list.get(0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void createRecordList1のケース1() throws Exception {
		Work310 work = new Work310();
		work.createRecordList(null);
	}

	@Test
	public void createRecordList2のケース() throws Exception {
		Work310 work = new Work310();
		String[][] hairetu ={
		                     {"A001",  "ロールケーキ",    "130"},
		                     {"A002",  "生どら焼",        "150"},
		                     {"A003",  "手包みクレープ",  "210"}
		                     };
		List<ProductDto>  resultList = work.createRecordList(hairetu);

		ProductDto item1 = new ProductDto("A001", "ロールケーキ", new BigDecimal("130"));
		ProductDto item2 = new ProductDto("A002", "生どら焼", new BigDecimal("150"));
		ProductDto item3 = new ProductDto("A003", "手包みクレープ", new BigDecimal("210"));

		int count = 0;
		for(ProductDto dto : resultList) {
			final String code = dto.getCode();
			final String name = dto.getName();
			final BigDecimal price = dto.getPrice();

			switch(count) {

			case 0:
				assertEquals(item1.getCode(), code);
				assertEquals(item1.getName(), name);
				assertEquals(item1.getPrice(), price);
				break;

			case 1:
				assertEquals(item2.getCode(), code);
				assertEquals(item2.getName(), name);
				assertEquals(item2.getPrice(), price);
				break;

			case 2:
				assertEquals(item3.getCode(), code);
				assertEquals(item3.getName(), name);
				assertEquals(item3.getPrice(), price);
				break;

			default:
				break;

			}
			count++;
		}

//		拡張for文で描かない場合↓
//		for(int i = 0; i < resultList.size(); i++) {
//			final ProductDto dto = resultList.get(i);
//			final String code = dto.getCode();
//			final String name = dto.getName();
//			final BigDecimal price = dto.getPrice();
//
//		switch(i){
//		case 0:
//			assertEquals(item1.getCode(), code);
//			assertEquals(item1.getName(), name);
//			assertEquals(item1.getPrice(), price);
//			break;
//
//		case 1:
//			assertEquals(item2.getCode(), code);
//			assertEquals(item2.getName(), name);
//			assertEquals(item2.getPrice(), price);
//			break;
//
//		case 2:
//			assertEquals(item3.getCode(), code);
//			assertEquals(item3.getName(), name);
//			assertEquals(item3.getPrice(), price);
//			break;
//
//		default:
//			break;
//		}

//		}

	}

	@Test
	public void createRecordList3のケース() throws Exception {
		Work310 work = new Work310();
		String[][] hairetu ={};
		List<ProductDto>  resultList = work.createRecordList(hairetu);
		assertEquals(0,resultList.size());

	}

}
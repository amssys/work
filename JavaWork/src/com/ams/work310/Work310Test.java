package com.ams.work310;

import static org.junit.Assert.*;

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
	public void createRecordList2() throws Exception {
		Work310 work = new Work310();
		String[][] hairetu ={
		                     {"A001",  "ロールケーキ",    "130"},
		                     {"A002",  "生どら焼",        "150"},
		                     {"A003",  "手包みクレープ",  "210"}
		                     };
		List<ProductDto>  resultList = work.createRecordList(hairetu);
//		List<ProductDto> resultList = work.createRecordList(hairetu);
//		List<String[]> exceptList = Arrays.asList(hairetu);
//		for(int i = 0;i < resultList.size();i++){
//			final String except = exceptList.get(i);
//			final String result = resultList.get(i);
//			assertEquals(except,result);
//		}
		for(int i = 0;i < hairetu.length;i++){
			for(int j = 0; j < hairetu[i].length;j++){
				final String except = hairetu[i][j];
				final ProductDto result = resultList.get(i);
				assertEquals(except,result.getCode());
				assertEquals(except,result.getName());
				assertEquals(except,result.getPrice());
			}
		}


//		assertEquals("A001",dto.getCode());
//		assertEquals("ロールケーキ",list.get(1));
//		assertEquals("130",			list.get(2));
//		assertEquals("A002",		list.get(0));
//		assertEquals("生どら焼き",	list.get(1));
//		assertEquals("150",			list.get(2));
//		assertEquals("A003",		list.get(0));
//		assertEquals("手包みクレープ",list.get(1));
//		assertEquals("210",			list.get(2));
	}

	@Test(expected = IllegalArgumentException.class)
	public void createRecordList3() throws Exception {
		Work310 work = new Work310();
		String[][] hairetu ={{}};
		work.createList(null);
		List<ProductDto>  list = work.createRecordList(hairetu);
		assertEquals("",list.get(0));
	}

}
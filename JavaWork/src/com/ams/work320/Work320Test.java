package com.ams.work320;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Map;

import org.junit.Test;

import com.ams.work210.ProductDto;

public class Work320Test {
	@Test(expected = IllegalArgumentException.class)
	public void createMap1のケース1() throws Exception {
		Work320 work = new Work320();
		work.createMap(null);
	}

	@Test
	public void createMap2のケース() throws Exception {

		Work320 work = new Work320();
		String[][] hairetu ={
		                     {"A001","ロールケーキ"},
		                     {"A002","生どら焼"},
		                     {"A003","手包みクレープ"}
		                     };
		Map<String,String> result = work.createMap(hairetu);
		for(int i = 0; i < hairetu.length;i++){
				String key = hairetu[i][0];
				String except = hairetu[i][1];
				final String actual = result.get(key);
				assertEquals(except,actual);
		}
	}

	@Test
	public void  createMap3のケース()  throws Exception {
		Work320 work = new Work320();
		String[][] hairetu ={};
		Map<String,String> result = work.createMap(hairetu);
		assertEquals(0,result.size());
	}



		@Test(expected = IllegalArgumentException.class)
		public void createRecordMap1のケース1() throws Exception {
			Work320 work = new Work320();
			work.createMap(null);
		}

		@Test
		public void createRecordMap2のケース() throws Exception {

			Work320 work = new Work320();
			String[][][] hairetu ={
                    {{"A001"},  {"ロールケーキ",    "130"},},
                    {{"A002"},  {"生どら焼",        "150"},},
                    {{"A003"},  {"手包みクレープ",  "210"},}
                    };

			ProductDto item1 = new ProductDto("A001", "ロールケーキ", new BigDecimal("130"));
			ProductDto item2 = new ProductDto("A002", "生どら焼", new BigDecimal("150"));
			ProductDto item3 = new ProductDto("A003", "手包みクレープ", new BigDecimal("210"));

			Map<String,ProductDto> result = work.createRecordMap(hairetu);
			int count = 0;
			for(int i = 0; i < hairetu.length;i++){
					final String key = hairetu[i][0][0];
					final ProductDto dto = result.get(key);
					final String name = dto.getName();
					final BigDecimal price = dto.getPrice();

					switch(count) {

					case 0:
//						key = item1.getCode();
						assertEquals(item1.getCode(), key);
						assertEquals(item1.getName(), name);
						assertEquals(item1.getPrice(), price);
						break;

					case 1:
//						key = item2.getCode();
						assertEquals(item2.getCode(), key);
						assertEquals(item2.getName(), name);
						assertEquals(item2.getPrice(), price);
						break;

					case 2:
//						key = item3.getCode();
						assertEquals(item3.getCode(), key);
						assertEquals(item3.getName(), name);
						assertEquals(item3.getPrice(), price);
						break;

					default:
						break;

					}
					count++;
			}
		}

		@Test
		public void  createRecordMap3のケース()  throws Exception {
			Work320 work = new Work320();
			String[][][] hairetu ={};
			Map<String,ProductDto> result = work.createRecordMap(hairetu);
			assertEquals(0,result.size());
		}

}

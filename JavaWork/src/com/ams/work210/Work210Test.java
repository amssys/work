package com.ams.work210;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class Work210Test {



	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース1() throws Exception {
		Work210 work = new Work210();
		work.createRecord(null);
	}
	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース2() throws Exception {
		Work210 work = new Work210();
		String[] hairetu ={};
		work.createRecord(hairetu);
	}
	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース3() throws Exception {
		Work210 work = new Work210();
		String[] hairetu ={"X"};
		work.createRecord(hairetu);
	}
	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース4() throws Exception {
		Work210 work = new Work210();
		String[] hairetu ={"X",  "X",  "X",  "X"};
		work.createRecord(hairetu);
	}
	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース5() throws Exception {
		Work210 work = new Work210();
		String[] hairetu ={"X",  "X",  "X"};
		work.createRecord(hairetu);
	}
	@Test
	public void createRecordのケース6() throws Exception {
		Work210 work = new Work210();
		String[] hairetu ={"4903110006770",  "毎朝の食パン",  "138"};
		ProductDto dto = work.createRecord(hairetu);
		BigDecimal deci = new BigDecimal("138");
		assertEquals("4903110006770",dto.getCode());
		assertEquals("毎朝の食パン",dto.getName());
		assertEquals(deci,dto.getPrice());
	}
	@Test
	public void createRecordのケース7() throws Exception {
		Work210 work = new Work210();
		String[] hairetu ={"4903110006770",  null,  "138"};
		ProductDto dto = work.createRecord(hairetu);
		BigDecimal deci = new BigDecimal("138");
		assertEquals("4903110006770",dto.getCode());
		assertEquals(null,dto.getName());
		assertEquals(deci,dto.getPrice());

	}
	@Test
	public void createRecordのケース8() throws Exception {
		Work210 work = new Work210();
		String[] hairetu ={"4903110006770",  "毎朝の食パン",  null};
		ProductDto dto = work.createRecord(hairetu);
		assertEquals("4903110006770",dto.getCode());
		assertEquals("毎朝の食パン",dto.getName());
		assertEquals(null,dto.getPrice());

	}
}

package com.ams.work130;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;


public class Work130Test {


	@Test(expected = IllegalArgumentException.class)
	public void extractYMDのケース1() throws Exception {
		Work130 work = new Work130();
		work.extractYMD(null,"Y");
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractYMDのケース2() throws Exception {
		Work130 work = new Work130();
		work.extractYMD(new Date(),null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractYMDのケース3() throws Exception {
		Work130 work = new Work130();
		work.extractYMD(new Date(),"X");
	}

	@Test
	public void extractYMDのケース4() throws Exception {
		Work130 work = new Work130();
		int expected = 1970;
		int actual = work.extractYMD(new Date(24L*60L*60L*1000L),"Y");
		assertEquals(actual, expected);
	}

	@Test
	public void extractYMDのケース5() throws Exception {
		Work130 work = new Work130();
		int expected = 1;
		int actual = work.extractYMD(new Date(24L*60L*60L*1000L),"M");
		assertEquals(actual, expected);
	}

	@Test
	public void extractYMDのケース6() throws Exception {
		Work130 work = new Work130();
		int expected = 2;
		int actual = work.extractYMD(new Date(24L*60L*60L*1000L),"D");
		assertEquals(actual, expected);
	}

	@Test
	public void extractYMDのケース7() throws Exception {
		Work130 work = new Work130();
		int expected = 1;
		int actual = work.extractYMD(new Date(),"Y");
		assertEquals(actual, expected);
	}

	@Test
	public void extractYMDのケース8() throws Exception {
		Work130 work = new Work130();
		int expected = 1;
		int actual = work.extractYMD(new Date(),"M");
		assertEquals(actual, expected);
	}

	@Test
	public void extractYMDのケース9() throws Exception {
		Work130 work = new Work130();
		int expected = 1;
		int actual = work.extractYMD(new Date(),"D");
		assertEquals(actual, expected);
	}


}

package com.ams.work130;

import static org.junit.Assert.*;

import java.util.Calendar;
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
		Calendar cal = Calendar.getInstance();
		int expected = cal.get(Calendar.YEAR);//実行時のdate
		int actual = work.extractYMD(new Date(),"Y");
		assertEquals(actual, expected);
	}

	@Test
	public void extractYMDのケース8() throws Exception {
		Work130 work = new Work130();
		Calendar cal = Calendar.getInstance();
		int expected = cal.get(Calendar.MONTH) + 1;//実行時のdate
		int actual = work.extractYMD(new Date(),"M");
		assertEquals(actual, expected);
	}

	@Test
	public void extractYMDのケース9() throws Exception {
		Work130 work = new Work130();
		Calendar cal = Calendar.getInstance();
		int expected = cal.get(Calendar.DATE);//実行時のdate
		int actual = work.extractYMD(new Date(),"D");
		assertEquals(actual, expected);
	}
//-------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース1() throws Exception {
		Work130 work = new Work130();
		work.createDate(1899,12,31);
	}

	@Test
	public void createDateのケース2() throws Exception {
		Work130 work = new Work130();
		String expected = ("Mon Jan 01 09:00:00 JST 1900");
		Date time = work.createDate(1900,1,1);
		String actual = time.toString();
		assertEquals(actual, expected);
	}

	@Test
	public void createDateのケース3() throws Exception {
		Work130 work = new Work130();
		String expected = ("Fri Dec 31 09:00:00 JST 2100");
		Date time = work.createDate(2100,12,31);
		String actual = time.toString();
		assertEquals(actual, expected);

	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース4() throws Exception {
		Work130 work = new Work130();
		work.createDate(2101,1,1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース5() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900,0,1);
	}

	@Test
	public void createDateのケース6() throws Exception {
		Work130 work = new Work130();
		String expected = ("Sat Dec 01 09:00:00 JST 1900");
		Date time = work.createDate(1900,12,1);
		String actual = time.toString();
		assertEquals(actual, expected);

	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース7() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900,13,1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース8() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900,1,0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース9() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900,1,32);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース10() throws Exception {
		Work130 work = new Work130();
		work.createDate(2011,2,29);
	}

	@Test
	public void createDateのケース11() throws Exception {
		Work130 work = new Work130();
		String expected = ("Wed Feb 29 09:00:00 JST 2012");
		Date time = work.createDate(2012,2,29);
		String actual = time.toString();
		assertEquals(actual, expected);
	}

	@Test
	public void createDateのケース12() throws Exception {
		Work130 work = new Work130();
		String expected = ("Tue May 01 09:00:00 JST 2012");
		Date time = work.createDate(2012,5,1);
		String actual = time.toString();
		assertEquals(actual, expected);
	}

	@Test(expected = IllegalArgumentException.class)
	public void dataToStringのケース1() throws Exception {
		Work130 work = new Work130();
		work.dateToString(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void stringToDateのケース2() throws Exception {
		Work130 work = new Work130();
		work.stringToDate("2012-05-010");
	}

	@Test(expected = IllegalArgumentException.class)
	public void stringToDateのケース3() throws Exception {
		Work130 work = new Work130();
		work.stringToDate("2012-05-0");
	}

	@Test(expected = IllegalArgumentException.class)
	public void stringToDateのケース4() throws Exception {
		Work130 work = new Work130();
		work.stringToDate("2012/05/01");
	}
	@Test(expected = IllegalArgumentException.class)
	public void stringToDateのケース5() throws Exception {
		Work130 work = new Work130();
		work.stringToDate("201-2-5-01");
	}
	@Test(expected = IllegalArgumentException.class)
	public void stringToDateのケース6() throws Exception {
		Work130 work = new Work130();
		work.stringToDate("2012-00501");
	}
	@Test(expected = IllegalArgumentException.class)
	public void stringToDateのケース7() throws Exception {
		Work130 work = new Work130();
		work.stringToDate("2012-04-31");
	}
	@Test
	public void stringToDateのケース8() throws Exception {
		Work130 work = new Work130();
		String expected = ("Tue May 01 09:00:00 JST 2012");
		Date time = work.stringToDate("2012-05-01");
		String actual = time.toString();
		assertEquals(actual, expected);
	}


	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース1() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(1899,1);
	}

	@Test
	public void getLasDayOfMonthのケース2() throws Exception {
		Work130 work = new Work130();
		String expected = ("1900-01-31");
		String actual = work.getLasDayOfMonth(1900,1);
		assertEquals(actual, expected);
	}

	@Test
	public void getLasDayOfMonthのケース3() throws Exception {
		Work130 work = new Work130();
		String expected = ("2100-01-31");
		String actual = work.getLasDayOfMonth(2100,1);
		assertEquals(actual, expected);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース4() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(2101,1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース5() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(1900,0);
	}

	@Test
	public void getLasDayOfMonthのケース6() throws Exception {
		Work130 work = new Work130();
		String expected = ("1900-01-31");
		String actual = work.getLasDayOfMonth(1900,1);
		assertEquals(actual, expected);
	}

	@Test
	public void getLasDayOfMonthのケース7() throws Exception {
		Work130 work = new Work130();
		String expected = ("1900-12-31");
		String actual = work.getLasDayOfMonth(1900,12);
		assertEquals(actual, expected);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース8() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(1900,13);
	}

	@Test
	public void getLasDayOfMonthのケース9() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-01-31");
		String actual = work.getLasDayOfMonth(2012,1);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース10() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-02-29");
		String actual = work.getLasDayOfMonth(2012,2);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース11() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-03-31");
		String actual = work.getLasDayOfMonth(2012,3);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース12() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-04-30");
		String actual = work.getLasDayOfMonth(2012,4);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース13() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-05-31");
		String actual = work.getLasDayOfMonth(2012,5);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース14() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-06-30");
		String actual = work.getLasDayOfMonth(2012,6);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース15() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-07-31");
		String actual = work.getLasDayOfMonth(2012,7);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース16() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-08-31");
		String actual = work.getLasDayOfMonth(2012,8);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース17() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-09-30");
		String actual = work.getLasDayOfMonth(2012,9);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース18() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-10-31");
		String actual = work.getLasDayOfMonth(2012,10);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース19() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-11-30");
		String actual = work.getLasDayOfMonth(2012,11);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース20() throws Exception {
		Work130 work = new Work130();
		String expected = ("2012-12-31");
		String actual = work.getLasDayOfMonth(2012,12);
		assertEquals(actual, expected);
	}
	@Test
	public void getLasDayOfMonthのケース21() throws Exception {
		Work130 work = new Work130();
		String expected = ("2013-02-28");
		String actual = work.getLasDayOfMonth(2013,2);
		assertEquals(actual, expected);
	}



}

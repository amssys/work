package com.ams.work130;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class Work130Test {


	/**
	 * Work110のテストを実行するクラス<BR>
	 *
	 * テスト実行方法：<BR>
	 *   右クリック → 実行 → JUnitテスト<BR>
	 *
	 * テスト結果の確認：<BR>
	 *   実行結果が 実行:52/52 エラー:0 失敗:0 となっていたらテスト合格<BR>
	 */
	@Test(expected = IllegalArgumentException.class)
	public void extractYMDのケース1() throws Exception {
	Work130 work = new Work130();
	work.extractYMD(null,null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractYMDのケース2() throws Exception {
		Work130 work = new Work130();
		work.extractYMD(new Date(),null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractYMDのケース3() throws Exception {
		Work130 work = new Work130();
		work.extractYMD(new Date(), "X");
	}

	@Test
	public void extractYMDのケース4() throws Exception {
		Work130 work = new Work130();
		int actual = work.extractYMD(new Date(24L*60L*60L*1000L), "Y");
		int expected = 1970;
		assertThat(actual, is(expected));
	}

	@Test
	public void extractYMDのケース5() throws Exception {
		Work130 work = new Work130();
		int actual = work.extractYMD(new Date(24L*60L*60L*1000L),"M");
		int expected = 1;
		assertThat(actual, is(expected));
	}

	@Test
	public void extractYMDのケース6() throws Exception {
		Work130 work = new Work130();
		int actual = work.extractYMD(new Date(24L*60L*60L*1000L), "D");
		int expected = 2;
		assertThat(actual, is(expected));
	}

	@Test
	public void extractYMDのケース7() throws Exception {
		Work130 work = new Work130();
		int actual = work.extractYMD(new Date(), "Y");
		Calendar c1 = Calendar.getInstance();
		Date date = new Date();
		c1.setTime(date);
		int expected = c1.get(Calendar.YEAR);
		assertThat(actual, is(expected));
	}

	@Test
	public void extractYMDのケース8() throws Exception {
		Work130 work = new Work130();
		int actual = work.extractYMD(new Date(), "M");
		Calendar c1 = Calendar.getInstance();
		Date date = new Date();
		c1.setTime(date);
		int expected = c1.get(Calendar.MONTH) + 1;
		assertThat(actual, is(expected));
	}

	@Test
	public void extractYMDのケース9() throws Exception {
		Work130 work = new Work130();
		int actual = work.extractYMD(new Date(), "D");
		Calendar c1 = Calendar.getInstance();
		Date date = new Date();
		c1.setTime(date);
		int expected = c1.get(Calendar.DATE);;
		assertThat(actual, is(expected));
	}



	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース1() throws Exception {
		Work130 work = new Work130();
		work.createDate(1889,2,31);
	}


//	Calendar cl = Calendar.getInstance();
//	cl.set(Calendar.YEAR, 1900);
//	cl.set(Calendar.MONTH, 0);
//	cl.set(Calendar.DATE, 1);
//	Date expected = cl.getTime();

	@Test
	public void createDateのケース2() throws Exception {
		Work130 work = new Work130();
		Date actual = work.createDate(1900, 1, 1);
		@SuppressWarnings("deprecation")
		Date expected = new Date(0, 0, 1);
		assertThat(actual, is(expected));
	}

	@Test
	public void createDateのケース3() throws Exception {
		Work130 work = new Work130();
		Date actual = work.createDate(2100, 12, 31);
		@SuppressWarnings("deprecation")
		Date expected = new Date(200,11,31);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース4() throws Exception {
		Work130 work = new Work130();
		work.createDate(2101, 1, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース5() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900, 0, 1);
	}

	@Test
	public void createDateのケース6() throws Exception {
		Work130 work = new Work130();
		Date actual = work.createDate(1900,12,1);
		@SuppressWarnings("deprecation")
		Date expected = new Date(0,11,1);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース7() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900, 13, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース8() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900, 1, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース9() throws Exception {
		Work130 work = new Work130();
		work.createDate(1900, 1, 32);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createDateのケース10() throws Exception {
		Work130 work = new Work130();
		work.createDate(2011, 2, 29);
	}

	@Test
	public void createDateのケース11() throws Exception {
		Work130 work = new Work130();
		Date actual = work.createDate(2012, 2, 29);
		@SuppressWarnings("deprecation")
		Date expected = new Date(112,1,29);
		assertThat(actual, is(expected));
	}

	@Test
	public void createDateのケース12() throws Exception {
		Work130 work = new Work130();
		Date actual = work.createDate(2012, 5, 1);
		@SuppressWarnings("deprecation")
		Date expected = new Date(112,4,1);
		assertThat(actual, is(expected));
	}



	@Test(expected = IllegalArgumentException.class)
	public void dateToStringのケース1() throws Exception {
		Work130 work  = new Work130();
		work.dateToString(null);
	}

	@Test
	public void dateToStringのケース2() throws Exception {
		Work130 work = new Work130();
		String actual = work.dateToString(new Date(24L*60L*60L*1000L));
		String expected = "1970-01-02";
		assertThat(actual, is(expected));
	}



	@Test(expected = IllegalArgumentException.class)
	public void stringToDateのケース1() throws Exception {
		Work130 work = new Work130();
		work.stringToDate(null);
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
		Date actual = work.stringToDate("2012-05-01");
		@SuppressWarnings("deprecation")
		Date expected = new Date(112,4,1);
		assertThat(actual, is(expected));
	}



	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース1() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(1889, 1);
	}

	@Test
	public void getLasDayOfMonthのケース2() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(1900, 1);
		String expected = "1900-01-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース3() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2100, 1);
		String expected = "2100-01-31";
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース4() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(2101, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース5() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(1900, 0);
	}

	@Test
	public void getLasDayOfMonthのケース6() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(1900, 1);
		String expected = "1900-01-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース7() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(1900, 12);
		String expected = "1900-12-31";
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void getLasDayOfMonthのケース8() throws Exception {
		Work130 work = new Work130();
		work.getLasDayOfMonth(1900, 13);
	}

	@Test
	public void getLasDayOfMonthのケース9() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 1);
		String expected = "2012-01-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース10() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 2);
		String expected = "2012-02-29";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース11() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 3);
		String expected = "2012-03-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース12() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 4);
		String expected = "2012-04-30";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース13() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 5);
		String expected = "2012-05-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース14() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 6);
		String expected = "2012-06-30";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース15() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 7);
		String expected = "2012-07-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース16() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 8);
		String expected = "2012-08-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース17() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 9);
		String expected = "2012-09-30";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース18() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 10);
		String expected = "2012-10-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース19() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 11);
		String expected = "2012-11-30";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース20() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2012, 12);
		String expected = "2012-12-31";
		assertThat(actual, is(expected));
	}

	@Test
	public void getLasDayOfMonthのケース21() throws Exception {
		Work130 work = new Work130();
		String actual = work.getLasDayOfMonth(2013, 2);
		String expected = "2013-02-28";
		assertThat(actual, is(expected));
	}

}

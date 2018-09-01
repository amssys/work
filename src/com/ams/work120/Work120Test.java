package com.ams.work120;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * Work120実行クラス
 *
 * テスト実行方法<BR>
 *	右クリック → 実行 → JUnitテスト<BR>
 *
 * テスト結果の確認:<BR>
 * 	実行結果が 実行:14/14 エラー:0 失敗:0 となっていたらテスト合格<BR>
 *
 */
public class  Work120Test {

	@Test(expected = IllegalArgumentException.class)
	public void sumのケース1() throws Exception {
		Work120 work = new Work120();
		work.sum(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void sumのケース2() throws Exception {
		Work120 work = new Work120();
		String[] str = {"1","2","A"};
		work.sum(str);
	}

	@Test(expected = IllegalArgumentException.class)
	public void sumのケース3() throws Exception {
		Work120 work = new Work120();
		String[] str = {"1","2","3.4"};
		work.sum(str);
	}

	@Test
	public void sumのケース4() throws Exception {
		Work120 work = new Work120();
		String expected = "6";
		String[] str = {"1","2","3"};
		String actual = work.sum(str);
		assertThat(actual, is(expected));
	}

	@Test
	public void sumのケース5() throws Exception {
		Work120 work = new Work120();
		String expected = "4";
		String[] str = {"-1","2","3"};
		String actual = work.sum(str);
		assertThat(actual, is(expected));
	}

	@Test
	public void sumのケース6() throws Exception {
		Work120 work = new Work120();
		String expected = "0";
		String[] str = {};
		String actual = work.sum(str);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void sumのケース7() throws Exception {
		Work120 work = new Work120();
		String[] str = {"999999999999","1"};
		work.sum(str);
	}

	@Test(expected = IllegalArgumentException.class)
	public void averageのケース1() throws Exception {
		Work120 work = new Work120();
		work.average(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void averageのケース2() throws Exception {
		Work120 work = new Work120();
		String[] str = {""};
		work.average(str);
	}

	@Test(expected =IllegalArgumentException.class)
	public void averageのケース3() throws Exception {
		Work120 work = new Work120();
		String[] str = {"1","2","A"};
		work.average(str);
		}

	@Test
	public void averageのケース4() throws IllegalArgumentException {
		Work120 work = new Work120();
		String[] str = {"1","2","3"};
		BigDecimal actual = work.average(str);
		BigDecimal expected = new BigDecimal(2.000).setScale(4);
		assertThat(actual, is(expected));
	}

	@Test
	public void averageのケース5() throws IllegalArgumentException {
		Work120 work = new Work120();
		String[] str = {"1","2","3.4"};
		BigDecimal actual = work.average(str);
		BigDecimal expected = new BigDecimal(2.1333).setScale(4, BigDecimal.ROUND_DOWN);
		assertThat(actual, is(expected));
	}

	@Test
	public void averageのケース6() throws IllegalArgumentException {
		Work120 work = new Work120();
		String[] str = {"-1","2","3"};
		BigDecimal actual = work.average(str);
		BigDecimal expected = new BigDecimal(1.3333).setScale(4, BigDecimal.ROUND_HALF_UP);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void averageのケース7() throws IllegalArgumentException {
		Work120 work = new Work120();
		String[] str = {"999999999999","1"};
		work.average(str);
	}

}

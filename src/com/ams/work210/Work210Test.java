package com.ams.work210;

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
 * 	実行結果が 実行:11/11 エラー:0 失敗:0 となっていたらテスト合格<BR>
 *
 */
public class Work210Test {

	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース1() throws Exception {
		Work210 work = new Work210();
		work.createRecord(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース2() throws Exception {
		Work210 work = new Work210();
		String[] str = {};
		work.createRecord(str);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース3() throws Exception {
		Work210 work = new Work210();
		String[] str = {"X"};
		work.createRecord(str);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース4() throws Exception {
		Work210 work = new Work210();
		String[] str = {"X","X","X","X"};
		work.createRecord(str);
	}

	@Test(expected = IllegalArgumentException.class)
	public void createRecordのケース5() throws Exception {
		Work210 work = new Work210();
		String[] str = {"X","X","X"};
		work.createRecord(str);
	}

	@Test
	public void createRecordのケース6() throws Exception {
		Work210 work = new Work210();
		String[] str = {"4903110006770","毎朝の食パン","138"};
		ProductDto actual = work.createRecord(str);
		ProductDto expected = new ProductDto(str[0],str[1],new BigDecimal(str[2]));
		assertThat(actual.getCode(), is(expected.getCode()));
		assertThat(actual.getName(), is(expected.getName()));
		assertThat(actual.getPrice(), is(expected.getPrice()));
	}

	
	
	@Test
	public void createRecordのケース7() throws Exception {
		Work210 work = new Work210();
		String[] str = {"4903110006770",null,"138"};
		ProductDto actual = work.createRecord(str);
		ProductDto expected = new ProductDto(str[0],null,new BigDecimal(str[2]));
		assertThat(actual.getCode(), is(expected.getCode()));
		assertThat(actual.getName(), is(expected.getName()));
		assertThat(actual.getPrice(), is(expected.getPrice()));
	}

	@Test
	public void createRecordのケース8() throws Exception {
		Work210 work = new Work210();
		String[] str = {"4903110006770","毎朝の食パン",null};
		ProductDto actual = work.createRecord(str);
		ProductDto expected = new ProductDto(str[0],str[1],null);
		assertThat(actual.getCode(), is(expected.getCode()));
		assertThat(actual.getName(), is(expected.getName()));
		assertThat(actual.getPrice(), is(expected.getPrice()));
	}

}
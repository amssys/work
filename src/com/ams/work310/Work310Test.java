package com.ams.work310;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Work310Test {

	@Test(expected = IllegalArgumentException.class)
	public void createListのケース1() throws Exception {
		Work310 work = new Work310();
		work.createRecordList(null);
	}

	@Test
	public void createListのケース2() throws Exception {
		Work310 work = new Work310();
		String[] str1 = {"ロールケーキ","生どら焼き","手包みクレープ"};
		List<String> actual = work.createList(str1);
		List<String> expected = new ArrayList<>();
		expected.add("ロールケーキ");
		expected.add("生どら焼き");
		expected.add("手包みクレープ");
		assertThat(actual, is(expected));
	}

	@Test
	public void createListのケース3() throws Exception {
		Work310 work = new Work310();
		String[] str1 = {};
		List<String> actual = work.createList(str1);
		List<String> expected = new ArrayList<>();
		assertThat(actual, is(expected));
	}


	@Test(expected = IllegalArgumentException.class)
	public void createRecordListのケース1() throws Exception{
		Work310 work = new Work310();
		work.createRecordList(null);
	}

	@Test
	public void createRecordListのケース2() throws Exception{
		Work310 work = new Work310();
		String[][] str1 = {{"A001","ロールケーキ","130"},{"A002","生どら焼","150"},{"A003","手包みクレープ","210"}};
		List<ProductBean> actual = work.createRecordList(str1);
//		for(int i =0;i<str1.length;i++) {
			assertThat(actual.get(0).getCode(), is(str1[0][0]));
			assertThat(actual.get(0).getName(), is(str1[0][1]));
			assertThat(actual.get(0).getPrice().toString(), is(str1[0][2]));
			assertThat(actual.get(1).getCode(), is(str1[1][0]));
			assertThat(actual.get(1).getName(), is(str1[1][1]));
			assertThat(actual.get(1).getPrice().toString(), is(str1[1][2]));
			assertThat(actual.get(2).getCode(), is(str1[2][0]));
			assertThat(actual.get(2).getName(), is(str1[2][1]));
			assertThat(actual.get(2).getPrice().toString(), is(str1[2][2]));
//		}

	}

	@Test
	public void createRecordListのケース3() throws Exception{
		Work310 work = new Work310();
		String[][] str1 = {};
		List<ProductBean> actual = work.createRecordList(str1);
		List<ProductBean> expected = new ArrayList<>();
		assertThat(actual, is(expected));







	}
}

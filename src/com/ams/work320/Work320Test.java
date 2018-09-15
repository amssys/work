package com.ams.work320;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Work320Test {

	@Test(expected = IllegalArgumentException.class)
	public void createMapのケース1() throws Exception{
		Work320 work = new Work320();
		work.createMap(null);
	}

	@Test
	public void createMapのケース2() throws Exception{
		Work320 work = new Work320();
		String[][] str = {{"A001","ロールケーキ"},{"A002","生どら焼"},{"A003","手包みクレープ"}};
		Map<String,String> actual = work.createMap(str);
		assertThat(actual.get("A001"), is(str[0][1]));
		assertThat(actual.get("A002"), is(str[1][1]));
		assertThat(actual.get("A003"), is(str[2][1]));
	}

	@Test
	public void createMapのケース3() throws Exception{
		Work320 work = new Work320();
		String[][] str = {};
		Map<String,String> actual = work.createMap(str);
		Map<String, String> expected = new HashMap<>();
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void createRecordsMapのケース1() throws Exception{
		Work320 work = new Work320();
		work.createRecordsMap(null);
	}

	@Test
	public void createRecordsMapのケース2() throws Exception{
		Work320 work = new Work320();
		String[][][] str = {{{"A001"},{"ロールケーキ","130"}},{{"A002"},{"生どら焼","150"}},{{"A003"},{"手包みクレープ",  "210"}}};
		Map<String,ProductBean> actual = work.createRecordsMap(str);
		for(int i= 0;i<str.length;i++) {
			String expected = ("code == " + str[i][0][0] + " name == " + str[i][1][0] + " price == " + str[i][1][1]);
			assertThat(actual.get(str[i][0][0]).toString(), is(expected));
		}
	}
}

package com.ams.work120;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Work120Test {

	@Test(expected = IllegalArgumentException.class)
	public void sumのケース1() throws Exception {
		Work120 work = new Work120();
		work.sum(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void sumのケース2() throws Exception {
		Work120 work = new Work120();
		String[] hairetu ={"1",  "2",  "A"};
		work.sum(hairetu);
	}


	@Test(expected = IllegalArgumentException.class)
	public void sumのケース3() throws Exception {
		Work120 work = new Work120();
		String[] hairetu = {"1",  "2",  "3.4"};
		work.sum(hairetu);
	}

	@Test
	public void sumのケース4() throws Exception {
		Work120 work = new Work120();
		String expected = "6";
		String[] hairetu = {"1",  "2",  "3"};
		String actual = work.sum(hairetu);
		assertThat(actual, is(expected));
	}

	@Test
	public void sumのケース5() throws Exception {
		Work120 work = new Work120();
		String expected = "4";
		String[] hairetu = {"-1",  "2",  "3"};
		String actual = work.sum(hairetu);
		assertThat(actual, is(expected));
	}

	@Test
	public void sumのケース6() throws Exception {
		Work120 work = new Work120();
		String expected = "0";
		String[] hairetu = {};
		String actual = work.sum(hairetu);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void sumのケース7() throws Exception {
		Work120 work = new Work120();
		String[] hairetu = {"999999999999",  "1"};
		work.sum(hairetu);
	}


	@Test(expected = IllegalArgumentException.class)
	public void averageのケース1() throws Exception {
		Work120 work = new Work120();
		work.average(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void averageのケース2() throws Exception {
		Work120 work = new Work120();
		String[] hairetu ={};
		work.average(hairetu);
	}

	@Test(expected = IllegalArgumentException.class)
	public void averageのケース3() throws Exception {
		Work120 work = new Work120();
		String[] hairetu ={"1",  "2",  "A"};
		work.average(hairetu);
	}

	@Test
	public void averageのケース4() throws Exception {
		Work120 work = new Work120();
		String expected = "2";
		String[] hairetu = {"1",  "2",  "3"};
		String actual = work.average(hairetu);
		assertThat(actual, is(expected));
	}

	@Test
	public void averageのケース5() throws Exception {
		Work120 work = new Work120();
		String expected = "2.133";
		String[] hairetu = {"1",  "2",  "3.4"};
		String actual = work.average(hairetu);
		assertThat(actual, is(expected));
	}

	@Test
	public void averageのケース6() throws Exception {
		Work120 work = new Work120();
		String expected = "1.333";
		String[] hairetu = {"-1",  "2",  "3"};
		String actual = work.average(hairetu);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void averageのケース7() throws Exception {
		Work120 work = new Work120();
		String expected = "5E+11";
		String[] hairetu = {"999999999999",  "1"};
		String actual = work.average(hairetu);
		assertThat(actual, is(expected));
	}





}

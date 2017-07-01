package com.ams.work410;

import org.junit.Test;

public class Work410Test {
	@Test(expected = IllegalArgumentException.class)
	public void selectByKeyのケース1() throws Exception {
		Work410 work = new Work410();
//		work.selectByKey(null);
	}

//	@Test
//	public void selsectByKeyのケース2() throws Exception {
//
//		Work410 work = new Work410();
//		List<SalesDto> result = new ArrayList<SalesDto>();
//		result = Work410Test(work.readCsv("item_list.csv"),10000005,3);
//		String except;
//
//		assertEquals(except,actual);
//	}

}

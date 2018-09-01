package com.ams.work310;

import org.junit.Test;

public class Work310Test {

	@Test(expected = IllegalArgumentException.class)
	public void createRecordListのケース1() throws Exception {
		Work310 work = new Work310();
		work.createRecordList(null);
	}



}

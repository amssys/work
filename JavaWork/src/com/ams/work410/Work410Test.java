package com.ams.work410;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Work410Test {
	@Test(expected = IllegalArgumentException.class)
	public void selectByKeyのケース1() throws Exception {
		Work410 work = new Work410();
		work.selectByKey(null, 5, 3);
	}

	@Test
	public void selsectByKeyのケース2() throws Exception {

		Work410 work = new Work410();
		List<SalesDto> list = new ArrayList<SalesDto>();
		Utility uti = new Utility();
		list = uti.splitData("item_list.csv");

		List<SalesDto> result = new ArrayList<SalesDto>();
		SalesDto actual1 = new SalesDto(5, uti.changeDate("2012/4/4"), 3,
				"F004", BigDecimal.valueOf(1), BigDecimal.valueOf(98));

		result = work.selectByKey(list, 5, 3);

		assertEquals(result.get(0).getTranNo(), actual1.getTranNo());
		assertEquals(result.get(0).getTranDate(), actual1.getTranDate());
		assertEquals(result.get(0).getDetailNo(), actual1.getDetailNo());
		assertEquals(result.get(0).getItemCd(), actual1.getItemCd());
		assertEquals(result.get(0).getQty(), actual1.getQty());
		assertEquals(result.get(0).getPrice(), actual1.getPrice());

	}

	@Test
	public void selectByKeyのケース3() throws Exception {
		Work410 work = new Work410();
		List<SalesDto> list = new ArrayList<SalesDto>();
		List<SalesDto> result = work.selectByKey(list, 5, 3);
		List<SalesDto> actual = null;
		assertEquals(result, actual);
	}

	@Test
	public void selectByKeyのケース4() throws Exception {
		Work410 work = new Work410();
		List<SalesDto> list = new ArrayList<SalesDto>();
		Utility uti = new Utility();
		uti.splitData("item_list.csv");
		List<SalesDto> result = work.selectByKey(list, 9999, 1);
		List<SalesDto> actual = null;
		assertEquals(result, actual);
	}

	@Test
	public void selectByKeyのケース5() throws Exception {
		Work410 work = new Work410();
		List<SalesDto> list = new ArrayList<SalesDto>();
		Utility uti = new Utility();

		uti.splitData("item_list.csv");
		List<SalesDto> result = work.selectByKey(list, 5, 99);
		List<SalesDto> actual = null;
		assertEquals(result, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void selectByTranDateのケース1() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		Date tranDateFrom = uti.changeDate("2012/4/1");
		Date tranDateTo = uti.changeDate("2012/4/30");
		work.selectByTranDate(null, tranDateFrom, tranDateTo);
	}

	@Test(expected = IllegalArgumentException.class)
	public void selectByTranDateのケース2() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		List<SalesDto> list = new ArrayList<SalesDto>();
		list = uti.splitData("item_list.csv");
		Date tranDateTo = uti.changeDate("2012/4/30");
		work.selectByTranDate(list, null, tranDateTo);
	}

	@Test(expected = IllegalArgumentException.class)
	public void selectByTranDateのケース3() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		List<SalesDto> list = new ArrayList<SalesDto>();
		list = uti.splitData("item_list.csv");
		Date tranDateFrom = uti.changeDate("2012/4/1");
		work.selectByTranDate(list, tranDateFrom, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void selectByTranDateのケース4() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		List<SalesDto> list = new ArrayList<SalesDto>();
		list = uti.splitData("item_list.csv");
		Date tranDateFrom = uti.changeDate("2012/4/2");
		Date tranDateTo = uti.changeDate("2012/4/1");
		work.selectByTranDate(list, tranDateFrom, tranDateTo);
	}

	@Test
	public void selectByTranDateのケース5() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		List<SalesDto> list = new ArrayList<SalesDto>();
		list = uti.splitData("item_list.csv");
		Date tranDateFrom = uti.changeDate("2012/4/2");
		Date tranDateTo = uti.changeDate("2012/4/2");

		List<SalesDto> result = work.selectByTranDate(list, tranDateFrom,
				tranDateTo);

		SalesDto actual1 = new SalesDto(4, uti.changeDate("2012/4/2"), 1,
				"F002", BigDecimal.valueOf(4), BigDecimal.valueOf(398));
		SalesDto actual2 = new SalesDto(4, uti.changeDate("2012/4/2"), 4,
				"F002", BigDecimal.valueOf(5), BigDecimal.valueOf(398));
		SalesDto actual3 = new SalesDto(4, uti.changeDate("2012/4/2"), 2,
				"F005", BigDecimal.valueOf(2), BigDecimal.valueOf(298));

		for (int i = 0; i < result.size(); i++) {
			final int tranNo = result.get(i).getTranNo();
			final Date tranDate = result.get(i).getTranDate();
			final int detailNo = result.get(i).getDetailNo();
			final String itemCd = result.get(i).getItemCd();
			final BigDecimal qty = result.get(i).getQty();
			final BigDecimal price = result.get(i).getPrice();

			switch (i) {
			case 0:
				assertEquals(tranNo, actual1.getTranNo());
				assertEquals(tranDate, actual1.getTranDate());
				assertEquals(detailNo, actual1.getDetailNo());
				assertEquals(itemCd, actual1.getItemCd());
				assertEquals(qty, actual1.getQty());
				assertEquals(price, actual1.getPrice());
				break;
			case 1:
				assertEquals(tranNo, actual2.getTranNo());
				assertEquals(tranDate, actual2.getTranDate());
				assertEquals(detailNo, actual2.getDetailNo());
				assertEquals(itemCd, actual2.getItemCd());
				assertEquals(qty, actual2.getQty());
				assertEquals(price, actual2.getPrice());
				break;
			case 2:
				assertEquals(tranNo, actual3.getTranNo());
				assertEquals(tranDate, actual3.getTranDate());
				assertEquals(detailNo, actual3.getDetailNo());
				assertEquals(itemCd, actual3.getItemCd());
				assertEquals(qty, actual3.getQty());
				assertEquals(price, actual3.getPrice());

				//
				break;

			default:
				break;
			}
		}
	}

	@Test
	public void selectByTranDateのケース6() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		List<SalesDto> list = new ArrayList<SalesDto>();
		list = uti.splitData("item_list.csv");
		Date tranDateFrom = uti.changeDate("2012/4/2");
		Date tranDateTo = uti.changeDate("2012/4/4");
		List<SalesDto> result = work.selectByTranDate(list, tranDateFrom,
				tranDateTo);
		SalesDto actual1 = new SalesDto(4, uti.changeDate("2012/4/2"), 1,
				"F002", BigDecimal.valueOf(4), BigDecimal.valueOf(398));
		SalesDto actual2 = new SalesDto(4, uti.changeDate("2012/4/2"), 4,
				"F002", BigDecimal.valueOf(5), BigDecimal.valueOf(398));
		SalesDto actual3 = new SalesDto(4, uti.changeDate("2012/4/2"), 2,
				"F005", BigDecimal.valueOf(2), BigDecimal.valueOf(298));
		SalesDto actual4 = new SalesDto(6, uti.changeDate("2012/4/4"), 1,
				"F002", BigDecimal.valueOf(2), BigDecimal.valueOf(250));
		SalesDto actual5 = new SalesDto(7, uti.changeDate("2012/4/4"), 1,
				"F002", BigDecimal.valueOf(12), BigDecimal.valueOf(250));
		SalesDto actual6 = new SalesDto(7, uti.changeDate("2012/4/4"), 2,
				"F002", BigDecimal.valueOf(1), BigDecimal.valueOf(250));
		SalesDto actual7 = new SalesDto(5, uti.changeDate("2012/4/4"), 1,
				"F003", BigDecimal.valueOf(1), BigDecimal.valueOf(88));
		SalesDto actual8 = new SalesDto(5, uti.changeDate("2012/4/4"), 2,
				"F003", BigDecimal.valueOf(1), BigDecimal.valueOf(88));
		SalesDto actual9 = new SalesDto(5, uti.changeDate("2012/4/4"), 3,
				"F004", BigDecimal.valueOf(1), BigDecimal.valueOf(98));
		SalesDto actual10 = new SalesDto(5, uti.changeDate("2012/4/4"), 2,
				"F005", BigDecimal.valueOf(1), BigDecimal.valueOf(198));
		SalesDto actual11 = new SalesDto(5, uti.changeDate("2012/4/4"), 3,
				"F005", BigDecimal.valueOf(1), BigDecimal.valueOf(198));

		for (int i = 0; i < result.size(); i++) {
			final int tranNo = result.get(i).getTranNo();
			final Date tranDate = result.get(i).getTranDate();
			final int detailNo = result.get(i).getDetailNo();
			final String itemCd = result.get(i).getItemCd();
			final BigDecimal qty = result.get(i).getQty();
			final BigDecimal price = result.get(i).getPrice();

			switch (i) {
			case 0:
				assertEquals(tranNo, actual1.getTranNo());
				assertEquals(tranDate, actual1.getTranDate());
				assertEquals(detailNo, actual1.getDetailNo());
				assertEquals(itemCd, actual1.getItemCd());
				assertEquals(qty, actual1.getQty());
				assertEquals(price, actual1.getPrice());
				break;
			case 1:
				assertEquals(tranNo, actual2.getTranNo());
				assertEquals(tranDate, actual2.getTranDate());
				assertEquals(detailNo, actual2.getDetailNo());
				assertEquals(itemCd, actual2.getItemCd());
				assertEquals(qty, actual2.getQty());
				assertEquals(price, actual2.getPrice());
				break;
			case 2:
				assertEquals(tranNo, actual3.getTranNo());
				assertEquals(tranDate, actual3.getTranDate());
				assertEquals(detailNo, actual3.getDetailNo());
				assertEquals(itemCd, actual3.getItemCd());
				assertEquals(qty, actual3.getQty());
				assertEquals(price, actual3.getPrice());
				break;
			case 3:
				assertEquals(tranNo, actual4.getTranNo());
				assertEquals(tranDate, actual4.getTranDate());
				assertEquals(detailNo, actual4.getDetailNo());
				assertEquals(itemCd, actual4.getItemCd());
				assertEquals(qty, actual4.getQty());
				assertEquals(price, actual4.getPrice());
				break;
			case 4:
				assertEquals(tranNo, actual5.getTranNo());
				assertEquals(tranDate, actual5.getTranDate());
				assertEquals(detailNo, actual5.getDetailNo());
				assertEquals(itemCd, actual5.getItemCd());
				assertEquals(qty, actual5.getQty());
				assertEquals(price, actual5.getPrice());
				break;
			case 5:
				assertEquals(tranNo, actual6.getTranNo());
				assertEquals(tranDate, actual6.getTranDate());
				assertEquals(detailNo, actual6.getDetailNo());
				assertEquals(itemCd, actual6.getItemCd());
				assertEquals(qty, actual6.getQty());
				assertEquals(price, actual6.getPrice());
				break;
			case 6:
				assertEquals(tranNo, actual7.getTranNo());
				assertEquals(tranDate, actual7.getTranDate());
				assertEquals(detailNo, actual7.getDetailNo());
				assertEquals(itemCd, actual7.getItemCd());
				assertEquals(qty, actual7.getQty());
				assertEquals(price, actual7.getPrice());
				break;
			case 7:
				assertEquals(tranNo, actual8.getTranNo());
				assertEquals(tranDate, actual8.getTranDate());
				assertEquals(detailNo, actual8.getDetailNo());
				assertEquals(itemCd, actual8.getItemCd());
				assertEquals(qty, actual8.getQty());
				assertEquals(price, actual8.getPrice());
				break;
			case 8:
				assertEquals(tranNo, actual9.getTranNo());
				assertEquals(tranDate, actual9.getTranDate());
				assertEquals(detailNo, actual9.getDetailNo());
				assertEquals(itemCd, actual9.getItemCd());
				assertEquals(qty, actual9.getQty());
				assertEquals(price, actual9.getPrice());
				break;
			case 9:
				assertEquals(tranNo, actual10.getTranNo());
				assertEquals(tranDate, actual10.getTranDate());
				assertEquals(detailNo, actual10.getDetailNo());
				assertEquals(itemCd, actual10.getItemCd());
				assertEquals(qty, actual10.getQty());
				assertEquals(price, actual10.getPrice());
				break;
			case 10:
				assertEquals(tranNo, actual11.getTranNo());
				assertEquals(tranDate, actual11.getTranDate());
				assertEquals(detailNo, actual11.getDetailNo());
				assertEquals(itemCd, actual11.getItemCd());
				assertEquals(qty, actual11.getQty());
				assertEquals(price, actual11.getPrice());
				break;



			default:
				break;
			}
		}

	}

	@Test
	public void selectByTranDateのケース7() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		List<SalesDto> list = new ArrayList<SalesDto>();
		Date tranDateFrom = uti.changeDate("2012/4/1");
		Date tranDateTo = uti.changeDate("2012/4/30");
		List<SalesDto> result = work.selectByTranDate(list, tranDateFrom,
				tranDateTo);
		List<SalesDto> actual = null;
		assertEquals(result.size(), 0);
	}

	@Test
	public void selectByTranDateのケース8() throws Exception {
		Work410 work = new Work410();
		Utility uti = new Utility();
		List<SalesDto> list = new ArrayList<SalesDto>();
		list = uti.splitData("item_list.csv");
		Date tranDateFrom = uti.changeDate("2012/4/ 8");
		Date tranDateTo = uti.changeDate("2012/4/30");
		List<SalesDto> result = work.selectByTranDate(list, tranDateFrom,
				tranDateTo);
		List<SalesDto> actual = null;
		assertEquals(result.size(), 0);
	}
		@Test(expected = IllegalArgumentException.class)
		public void addItemNameのケース1() throws Exception {
			Work410 work = new Work410();
			Map<String,String> map = new HashMap<String,String>();
			work.addItemName(null, map);
		}

		@Test(expected = IllegalArgumentException.class)
		public void addItemNameのケース2() throws Exception {
			Work410 work = new Work410();
			List<SalesDto> list = new ArrayList<SalesDto>();
			work.addItemName(list, null);
		}
		@Test
		public void addItemNameのケース5() throws Exception {
			Work410 work = new Work410();
			Map<String,String> map = new HashMap<String,String>();
			Utility uti = new Utility();
			List<SalesDto> list = new ArrayList<SalesDto>();
			list = uti.splitData("item_list.csv");
			List<SalesDto> expected = work.addItemName(list, map);
			List<SalesDto> actual = uti.splitData("item_list.csv");

			for(int i = 0;i < actual.size();i++){
				final int tranNo = actual.get(i).getTranNo();
				final Date tranDate = actual.get(i).getTranDate();
				final int detailNo = actual.get(i).getDetailNo();
				final String itemCd = actual.get(i).getItemCd();
				final BigDecimal qty = actual.get(i).getQty();
				final BigDecimal price = actual.get(i).getPrice();

				assertEquals(expected.get(i).getTranNo(), tranNo);
				assertEquals(expected.get(i).getTranDate(), tranDate);
				assertEquals(expected.get(i).getDetailNo(), detailNo);
				assertEquals(expected.get(i).getItemCd(), itemCd);
				assertEquals(expected.get(i).getQty(), qty);
				assertEquals(expected.get(i).getPrice(), price);
			}
		}


}

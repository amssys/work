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
		public void addItemNameのケース3() throws Exception {
			Work410 work = new Work410();
			Utility uti = new Utility();
			Map<String,String> map = new HashMap<String,String>();
			map = uti.createMap("item_list.csv");
			List<SalesDto> list = new ArrayList<SalesDto>();
			List<SalesDto> result = work.addItemName(list, map);
			SalesDto actual1 = new SalesDto(1, uti.changeDate("2012/4/1"), 1,
					"F002","アボガド", BigDecimal.valueOf(1), BigDecimal.valueOf(150));
			SalesDto actual2 = new SalesDto(1, uti.changeDate("2012/4/1"), 3,
					"F002","アボガド", BigDecimal.valueOf(1), BigDecimal.valueOf(150));
			SalesDto actual3 = new SalesDto(1, uti.changeDate("2012/4/1"), 2,
					"F005","いちご", BigDecimal.valueOf(4), BigDecimal.valueOf(398));
			SalesDto actual4 = new SalesDto(2, uti.changeDate("2012/4/1"), 1,
					"F002","いちご", BigDecimal.valueOf(1), BigDecimal.valueOf(398));
			SalesDto actual5 = new SalesDto(2, uti.changeDate("2012/4/1"), 5,
					"F002","いちご", BigDecimal.valueOf(1), BigDecimal.valueOf(398));
			SalesDto actual6 = new SalesDto(2, uti.changeDate("2012/4/1"), 3,
					"F002","キウイ", BigDecimal.valueOf(2), BigDecimal.valueOf(98));
			SalesDto actual7 = new SalesDto(3, uti.changeDate("2012/4/1"), 1,
					"F003","キウイ", BigDecimal.valueOf(1), BigDecimal.valueOf(98));
			SalesDto actual8 = new SalesDto(3, uti.changeDate("2012/4/1"), 4,
					"F003","八朔", BigDecimal.valueOf(5), BigDecimal.valueOf(120));
			SalesDto actual9 = new SalesDto(3, uti.changeDate("2012/4/1"), 2,
					"F004","バナナ", BigDecimal.valueOf(2), BigDecimal.valueOf(298));
			SalesDto actual10 = new SalesDto(3, uti.changeDate("2012/4/1"), 5,
					"F005","バナナ", BigDecimal.valueOf(3), BigDecimal.valueOf(298));
			SalesDto actual11 = new SalesDto(3, uti.changeDate("2012/4/1"), 4,
					"F005", "りんご",BigDecimal.valueOf(1), BigDecimal.valueOf(198));
			SalesDto actual12 = new SalesDto(3, uti.changeDate("2012/4/1"), 6,
					"F005","りんご", BigDecimal.valueOf(6), BigDecimal.valueOf(198));
			SalesDto actual13 = new SalesDto(3, uti.changeDate("2012/4/1"), 3,
					"F005","アボカド", BigDecimal.valueOf(1), BigDecimal.valueOf(150));
			SalesDto actual14 = new SalesDto(3, uti.changeDate("2012/4/1"), 4,
					"F005","アボカド", BigDecimal.valueOf(3), BigDecimal.valueOf(150));
			SalesDto actual15 = new SalesDto(4, uti.changeDate("2012/4/2"), 1,
					"F002","いちご", BigDecimal.valueOf(4), BigDecimal.valueOf(398));
			SalesDto actual16 = new SalesDto(4, uti.changeDate("2012/4/2"), 4,
					"F002","いちご", BigDecimal.valueOf(5), BigDecimal.valueOf(398));
			SalesDto actual17 = new SalesDto(4, uti.changeDate("2012/4/2"), 2,
					"F005","バナナ", BigDecimal.valueOf(2), BigDecimal.valueOf(298));
			SalesDto actual18 = new SalesDto(6, uti.changeDate("2012/4/4"), 1,
					"F002","いちご", BigDecimal.valueOf(2), BigDecimal.valueOf(250));
			SalesDto actual19 = new SalesDto(7, uti.changeDate("2012/4/4"), 1,
					"F002","いちご", BigDecimal.valueOf(12), BigDecimal.valueOf(250));
			SalesDto actual20 = new SalesDto(7, uti.changeDate("2012/4/4"), 2,
					"F002","いちご", BigDecimal.valueOf(1), BigDecimal.valueOf(250));
			SalesDto actual21 = new SalesDto(5, uti.changeDate("2012/4/4"), 1,
					"F003","キウイ", BigDecimal.valueOf(1), BigDecimal.valueOf(88));
			SalesDto actual22 = new SalesDto(5, uti.changeDate("2012/4/4"), 2,
					"F003","キウイ", BigDecimal.valueOf(1), BigDecimal.valueOf(88));
			SalesDto actual23 = new SalesDto(5, uti.changeDate("2012/4/4"), 3,
					"F004","八朔", BigDecimal.valueOf(1), BigDecimal.valueOf(98));
			SalesDto actual24 = new SalesDto(5, uti.changeDate("2012/4/4"), 2,
					"F005","バナナ", BigDecimal.valueOf(1), BigDecimal.valueOf(198));
			SalesDto actual25 = new SalesDto(5, uti.changeDate("2012/4/4"), 3,
					"F005", "バナナ",BigDecimal.valueOf(1), BigDecimal.valueOf(198));
			SalesDto actual26 = new SalesDto(8, uti.changeDate("2012/4/5"), 1,
					"F002","いちご", BigDecimal.valueOf(1), BigDecimal.valueOf(398));
			SalesDto actual27 = new SalesDto(9, uti.changeDate("2012/4/5"), 1,
					"F002","いちご", BigDecimal.valueOf(3), BigDecimal.valueOf(398));
			SalesDto actual28 = new SalesDto(9, uti.changeDate("2012/4/5"), 2,
					"F002","いちご", BigDecimal.valueOf(2), BigDecimal.valueOf(398));
			SalesDto actual29 = new SalesDto(9, uti.changeDate("2012/4/5"), 2,
					"F002","いちご", BigDecimal.valueOf(3), BigDecimal.valueOf(398));
			SalesDto actual30 = new SalesDto(9, uti.changeDate("2012/4/5"), 3,
					"F002","キウイ", BigDecimal.valueOf(7), BigDecimal.valueOf(98));
			SalesDto actual31 = new SalesDto(10, uti.changeDate("2012/4/7"), 1,
					"F002","八朔", BigDecimal.valueOf(2), BigDecimal.valueOf(120));

			for (int i = 0; i < result.size(); i++) {
				final int tranNo = result.get(i).getTranNo();
				final Date tranDate = result.get(i).getTranDate();
				final int detailNo = result.get(i).getDetailNo();
				final String itemCd = result.get(i).getItemCd();
				final String itemName = result.get(i).getItemName();
				final BigDecimal qty = result.get(i).getQty();
				final BigDecimal price = result.get(i).getPrice();

				switch (i) {
				case 0:
					assertEquals(tranNo, actual1.getTranNo());
					assertEquals(tranDate, actual1.getTranDate());
					assertEquals(detailNo, actual1.getDetailNo());
					assertEquals(itemCd, actual1.getItemCd());
					assertEquals(itemName, actual1.getItemName());
					assertEquals(qty, actual1.getQty());
					assertEquals(price, actual1.getPrice());
					break;
				case 1:
					assertEquals(tranNo, actual2.getTranNo());
					assertEquals(tranDate, actual2.getTranDate());
					assertEquals(detailNo, actual2.getDetailNo());
					assertEquals(itemCd, actual2.getItemCd());
					assertEquals(itemName, actual2.getItemName());
					assertEquals(qty, actual2.getQty());
					assertEquals(price, actual2.getPrice());
					break;
				case 2:
					assertEquals(tranNo, actual3.getTranNo());
					assertEquals(tranDate, actual3.getTranDate());
					assertEquals(detailNo, actual3.getDetailNo());
					assertEquals(itemCd, actual3.getItemCd());
					assertEquals(itemName, actual3.getItemName());
					assertEquals(qty, actual3.getQty());
					assertEquals(price, actual3.getPrice());
					break;
				case 3:
					assertEquals(tranNo, actual4.getTranNo());
					assertEquals(tranDate, actual4.getTranDate());
					assertEquals(detailNo, actual4.getDetailNo());
					assertEquals(itemCd, actual4.getItemCd());
					assertEquals(itemName, actual4.getItemName());
					assertEquals(qty, actual4.getQty());
					assertEquals(price, actual4.getPrice());
					break;
				case 4:
					assertEquals(tranNo, actual5.getTranNo());
					assertEquals(tranDate, actual5.getTranDate());
					assertEquals(detailNo, actual5.getDetailNo());
					assertEquals(itemCd, actual5.getItemCd());
					assertEquals(itemName, actual5.getItemName());
					assertEquals(qty, actual5.getQty());
					assertEquals(price, actual5.getPrice());
					break;
				case 5:
					assertEquals(tranNo, actual6.getTranNo());
					assertEquals(tranDate, actual6.getTranDate());
					assertEquals(detailNo, actual6.getDetailNo());
					assertEquals(itemCd, actual6.getItemCd());
					assertEquals(itemName, actual6.getItemName());
					assertEquals(qty, actual6.getQty());
					assertEquals(price, actual6.getPrice());
					break;
				case 6:
					assertEquals(tranNo, actual7.getTranNo());
					assertEquals(tranDate, actual7.getTranDate());
					assertEquals(detailNo, actual7.getDetailNo());
					assertEquals(itemCd, actual7.getItemCd());
					assertEquals(itemName, actual7.getItemName());
					assertEquals(qty, actual7.getQty());
					assertEquals(price, actual7.getPrice());
					break;
				case 7:
					assertEquals(tranNo, actual8.getTranNo());
					assertEquals(tranDate, actual8.getTranDate());
					assertEquals(detailNo, actual8.getDetailNo());
					assertEquals(itemCd, actual8.getItemCd());
					assertEquals(itemName, actual8.getItemName());
					assertEquals(qty, actual8.getQty());
					assertEquals(price, actual8.getPrice());
					break;
				case 8:
					assertEquals(tranNo, actual9.getTranNo());
					assertEquals(tranDate, actual9.getTranDate());
					assertEquals(detailNo, actual9.getDetailNo());
					assertEquals(itemCd, actual9.getItemCd());
					assertEquals(itemName, actual9.getItemName());
					assertEquals(qty, actual9.getQty());
					assertEquals(price, actual9.getPrice());
					break;
				case 9:
					assertEquals(tranNo, actual10.getTranNo());
					assertEquals(tranDate, actual10.getTranDate());
					assertEquals(detailNo, actual10.getDetailNo());
					assertEquals(itemCd, actual10.getItemCd());
					assertEquals(itemName, actual10.getItemName());
					assertEquals(qty, actual10.getQty());
					assertEquals(price, actual10.getPrice());
					break;
				case 10:
					//
					assertEquals(tranNo, actual11.getTranNo());
					assertEquals(tranDate, actual11.getTranDate());
					assertEquals(detailNo, actual11.getDetailNo());
					assertEquals(itemCd, actual11.getItemCd());
					assertEquals(itemName, actual11.getItemName());
					assertEquals(qty, actual11.getQty());
					assertEquals(price, actual11.getPrice());
					break;
				case 11:
					assertEquals(tranNo, actual12.getTranNo());
					assertEquals(tranDate, actual12.getTranDate());
					assertEquals(detailNo, actual12.getDetailNo());
					assertEquals(itemCd, actual12.getItemCd());
					assertEquals(itemName, actual12.getItemName());
					assertEquals(qty, actual12.getQty());
					assertEquals(price, actual12.getPrice());
					break;
				case 12:
					assertEquals(tranNo, actual13.getTranNo());
					assertEquals(tranDate, actual13.getTranDate());
					assertEquals(detailNo, actual13.getDetailNo());
					assertEquals(itemCd, actual13.getItemCd());
					assertEquals(itemName, actual13.getItemName());
					assertEquals(qty, actual13.getQty());
					assertEquals(price, actual13.getPrice());
					break;
				case 13:
					assertEquals(tranNo, actual14.getTranNo());
					assertEquals(tranDate, actual14.getTranDate());
					assertEquals(detailNo, actual14.getDetailNo());
					assertEquals(itemCd, actual14.getItemCd());
					assertEquals(itemName, actual14.getItemName());
					assertEquals(qty, actual14.getQty());
					assertEquals(price, actual14.getPrice());
					break;
				case 14:
					assertEquals(tranNo, actual15.getTranNo());
					assertEquals(tranDate, actual15.getTranDate());
					assertEquals(detailNo, actual15.getDetailNo());
					assertEquals(itemCd, actual15.getItemCd());
					assertEquals(itemName, actual15.getItemName());
					assertEquals(qty, actual15.getQty());
					assertEquals(price, actual15.getPrice());
					break;
				case 15:
					assertEquals(tranNo, actual16.getTranNo());
					assertEquals(tranDate, actual16.getTranDate());
					assertEquals(detailNo, actual16.getDetailNo());
					assertEquals(itemCd, actual16.getItemCd());
					assertEquals(itemName, actual16.getItemName());
					assertEquals(qty, actual16.getQty());
					assertEquals(price, actual16.getPrice());
					break;
				case 16:
					assertEquals(tranNo, actual17.getTranNo());
					assertEquals(tranDate, actual17.getTranDate());
					assertEquals(detailNo, actual17.getDetailNo());
					assertEquals(itemCd, actual17.getItemCd());
					assertEquals(itemName, actual17.getItemName());
					assertEquals(qty, actual17.getQty());
					assertEquals(price, actual17.getPrice());
					break;
				case 17:
					assertEquals(tranNo, actual18.getTranNo());
					assertEquals(tranDate, actual18.getTranDate());
					assertEquals(detailNo, actual18.getDetailNo());
					assertEquals(itemCd, actual18.getItemCd());
					assertEquals(itemName, actual18.getItemName());
					assertEquals(qty, actual18.getQty());
					assertEquals(price, actual18.getPrice());
					break;
				case 18:
					assertEquals(tranNo, actual19.getTranNo());
					assertEquals(tranDate, actual19.getTranDate());
					assertEquals(detailNo, actual19.getDetailNo());
					assertEquals(itemCd, actual19.getItemCd());
					assertEquals(itemName, actual11.getItemName());
					assertEquals(qty, actual19.getQty());
					assertEquals(price, actual19.getPrice());
					break;
				case 19:
					assertEquals(tranNo, actual20.getTranNo());
					assertEquals(tranDate, actual20.getTranDate());
					assertEquals(detailNo, actual20.getDetailNo());
					assertEquals(itemCd, actual20.getItemCd());
					assertEquals(itemName, actual20.getItemName());
					assertEquals(qty, actual20.getQty());
					assertEquals(price, actual20.getPrice());
					break;
				case 20:
					assertEquals(tranNo, actual21.getTranNo());
					assertEquals(tranDate, actual21.getTranDate());
					assertEquals(detailNo, actual21.getDetailNo());
					assertEquals(itemCd, actual21.getItemCd());
					assertEquals(itemName, actual21.getItemName());
					assertEquals(qty, actual21.getQty());
					assertEquals(price, actual21.getPrice());
					break;
				case 21:
					assertEquals(tranNo, actual22.getTranNo());
					assertEquals(tranDate, actual22.getTranDate());
					assertEquals(detailNo, actual22.getDetailNo());
					assertEquals(itemCd, actual22.getItemCd());
					assertEquals(itemName, actual22.getItemName());
					assertEquals(qty, actual22.getQty());
					assertEquals(price, actual22.getPrice());
					break;
				case 22:
					assertEquals(tranNo, actual23.getTranNo());
					assertEquals(tranDate, actual23.getTranDate());
					assertEquals(detailNo, actual23.getDetailNo());
					assertEquals(itemCd, actual23.getItemCd());
					assertEquals(itemName, actual23.getItemName());
					assertEquals(qty, actual23.getQty());
					assertEquals(price, actual23.getPrice());
					break;
				case 23:
					assertEquals(tranNo, actual24.getTranNo());
					assertEquals(tranDate, actual24.getTranDate());
					assertEquals(detailNo, actual24.getDetailNo());
					assertEquals(itemCd, actual24.getItemCd());
					assertEquals(itemName, actual24.getItemName());
					assertEquals(qty, actual24.getQty());
					assertEquals(price, actual24.getPrice());
					break;
				case 24:
					assertEquals(tranNo, actual25.getTranNo());
					assertEquals(tranDate, actual25.getTranDate());
					assertEquals(detailNo, actual25.getDetailNo());
					assertEquals(itemCd, actual25.getItemCd());
					assertEquals(itemName, actual25.getItemName());
					assertEquals(qty, actual25.getQty());
					assertEquals(price, actual25.getPrice());
					break;
				case 25:
					assertEquals(tranNo, actual26.getTranNo());
					assertEquals(tranDate, actual26.getTranDate());
					assertEquals(detailNo, actual26.getDetailNo());
					assertEquals(itemCd, actual26.getItemCd());
					assertEquals(itemName, actual26.getItemName());
					assertEquals(qty, actual26.getQty());
					assertEquals(price, actual26.getPrice());
					break;
				case 26:
					assertEquals(tranNo, actual27.getTranNo());
					assertEquals(tranDate, actual27.getTranDate());
					assertEquals(detailNo, actual27.getDetailNo());
					assertEquals(itemCd, actual27.getItemCd());
					assertEquals(itemName, actual27.getItemName());
					assertEquals(qty, actual27.getQty());
					assertEquals(price, actual27.getPrice());
					break;
				case 27:
					assertEquals(tranNo, actual28.getTranNo());
					assertEquals(tranDate, actual28.getTranDate());
					assertEquals(detailNo, actual28.getDetailNo());
					assertEquals(itemCd, actual28.getItemCd());
					assertEquals(itemName, actual28.getItemName());
					assertEquals(qty, actual28.getQty());
					assertEquals(price, actual28.getPrice());
					break;
				case 28:
					assertEquals(tranNo, actual29.getTranNo());
					assertEquals(tranDate, actual29.getTranDate());
					assertEquals(detailNo, actual29.getDetailNo());
					assertEquals(itemCd, actual29.getItemCd());
					assertEquals(itemName, actual29.getItemName());
					assertEquals(qty, actual29.getQty());
					assertEquals(price, actual29.getPrice());
					break;
				case 29:
					assertEquals(tranNo, actual30.getTranNo());
					assertEquals(tranDate, actual30.getTranDate());
					assertEquals(detailNo, actual30.getDetailNo());
					assertEquals(itemCd, actual30.getItemCd());
					assertEquals(itemName, actual30.getItemName());
					assertEquals(qty, actual30.getQty());
					assertEquals(price, actual30.getPrice());
					break;
				case 30:
					assertEquals(tranNo, actual31.getTranNo());
					assertEquals(tranDate, actual31.getTranDate());
					assertEquals(detailNo, actual31.getDetailNo());
					assertEquals(itemCd, actual31.getItemCd());
					assertEquals(itemName, actual31.getItemName());
					assertEquals(qty, actual31.getQty());
					assertEquals(price, actual31.getPrice());
					break;
				default:
					break;
				}
			}

		}

		@Test
		public void addItemNameのケース4() throws Exception {
			Work410 work = new Work410();
			Utility uti = new Utility();
			Map<String,String> map = new HashMap<String,String>();
			map = uti.createMap("item_list.csv");
			List<SalesDto> list = new ArrayList<SalesDto>();
			List<SalesDto> expected = work.addItemName(list, map);
			List<SalesDto> actual = list;
			assertEquals(expected,actual);
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

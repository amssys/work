package com.ams.work410;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Work410 {

	/**
	 * レコード・キーを指定してデータを抽出する<BR>
	 *
	 * @param tranNo
	 * @param detailNo
	 * @return
	 */
	public List<SalesDto> selectByKey(List<SalesDto> data, int tranNo,
			int detailNo) {
		if (data == null) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		List<SalesDto> list = new ArrayList<SalesDto>();
		for (SalesDto dto : data) {
			if (dto.getTranNo() == tranNo && dto.getDetailNo() == detailNo) {
				list.add(dto);
			}
		}
		if (list.size() == 0) {
			return null;
		}
		return list;
	}

	public List<SalesDto> selectByTranDate(List<SalesDto> data,
											Date tranDateFrom,
											Date tranDateTo) throws AssertionError{
		if (data == null||tranDateFrom == null||tranDateTo == null) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		if (tranDateFrom.compareTo(tranDateTo) > 0) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		long dateTimeFrom = tranDateFrom.getTime();
		long dateTimeTo = tranDateTo.getTime();
		int days = (int) ((dateTimeTo - dateTimeFrom) / (1000 * 60 * 60 * 24)) + 1;
		Date[] date = new Date[days];
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(tranDateFrom);
		for (int i = 0; i < date.length; i++) {
			date[i] = calendar.getTime();
			calendar.add(Calendar.DATE, 1);
		}

		List<SalesDto> list = new ArrayList<SalesDto>();
		for (SalesDto dto : data) {
			for (Date day : date) {
				if (day.compareTo(dto.getTranDate()) == 0) {
					list.add(dto);
				}
			}
		}

		return list;
	}
	public  List<SalesDto> addItemName(List<SalesDto> data, Map<String,String> itemCdNameMap){
		if (data == null||itemCdNameMap == null) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		List<SalesDto> list = new ArrayList<SalesDto>();

		for (SalesDto dto : data) {
			String itemName = itemCdNameMap.get(dto.getItemCd());
			dto.setItemName(itemName);
			list.add(dto);
		}

		return list;
	}

}

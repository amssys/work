package com.ams.work410;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility {

	/**
	 * 指定したCSVファイルを1行ずつ読み込みます<BR>
	 *
	 * @param csvFileName
	 * @return
	 */
	public static List<String> readCsv(String csvFileName) {
		List<String> csvElements = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// ファイルを読み込む
			fr = new FileReader(".\\FILE\\work400\\" + csvFileName);
			br = new BufferedReader(fr);
			// 読み込んだファイルを１行ずつ処理する
			String line;
			while ((line = br.readLine()) != null) {
				csvElements.add(line);
			}
			// 終了処理
			br.close();
		} catch (IOException ex) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 例外発生時処理
			ex.printStackTrace();
		}
		return csvElements;
	}

	/**
	 * 指定したCSVファイルを分解してSalesDtoに入れます
	 *
	 * @param scvFileName
	 * @return List<SalesDto>
	 */
	public List<SalesDto> splitData(String csv) {
		List<SalesDto> list = new ArrayList<SalesDto>();
		for (String s : readCsv(csv)) {
			SalesDto dto = new SalesDto();
			String[] str = s.split(",", 0);
			if (str.length == 6) {
				dto.setTranNo(Integer.valueOf(str[0]));
				dto.setTranDate(changeDate(str[1]));
				dto.setDetailNo(Integer.parseInt(str[2]));
				dto.setItemCd(str[3]);
				BigDecimal bQty = new BigDecimal(str[4]);
				dto.setQty(bQty);
				BigDecimal bPrice = new BigDecimal(str[5]);
				dto.setPrice(bPrice);
				list.add(dto);
			} else {
				dto.setTranNo(Integer.parseInt(str[0]));
				dto.setTranDate(changeDate(str[1]));
				dto.setDetailNo(Integer.parseInt(str[2]));
				dto.setItemCd(str[3]);
				dto.setItemName(str[4]);
				BigDecimal bQty = new BigDecimal(str[5]);
				dto.setQty(bQty);
				BigDecimal bPrice = new BigDecimal(str[6]);
				dto.setPrice(bPrice);
				BigDecimal bAmount = new BigDecimal(str[7]);
				dto.setAmount(bAmount);
				list.add(dto);
			}
		}
		return list;
	}

	/**
	 * 指定したCSVファイルを分解してMapに入れます
	 *
	 * @param createMap
	 * @return Map<String,String>
	 */
	public Map<String,String> createMap(String csv) {
		Map<String,String> map = new HashMap<String,String>();
		for (String s : readCsv(csv)) {
			String[] str = s.split(",", 0);
			map.put(str[0], str[1]);
		}

		return map;
	}

	/**
	 * 文字列をDate型"yyyy/MM/DD"に変換します。
	 *
	 * @param String
	 *            day
	 * @return Date
	 */
	public Date changeDate(String day) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/DD");
		try {
			date = sdf.parse(day);
		} catch (ParseException e) {
			System.out.println(e);
		}

		return date;
	}

	public Date changeDate(Calendar cal) {
		Date date = new Date();
		date = cal.getTime();

		return date;
	}

}

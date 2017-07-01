package com.ams.work410;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Work410 {

	/**
	 * レコード・キーを指定してデータを抽出する<BR>
	 *
	 * @param tranNo
	 * @param detailNo
	 * @return
	 */
	public List<SalesDto> selectByKey(List<SalesDto> data ,int tranNo, int detailNo) {
		if(data == null){
			throw new IllegalArgumentException("引数がNULLです");
		}
		List<String> strs = new ArrayList<String>();
		List<SalesDto> list = new ArrayList<SalesDto>();
		//for(String s : readCsv("item_list.csv")) {
		for(String s :strs){
			if(s.indexOf(String.valueOf(tranNo)) != -1 && s.indexOf(String.valueOf(detailNo))  != -1){
				SimpleDateFormat sdf = new SimpleDateFormat();
				SalesDto dto = new SalesDto();
				String[] str = s.split(",",0);
				dto.setTranNo(Integer.parseInt(str[0]));
				try{
					dto.setTranDate(sdf.parse(str[1]));
				}catch(ParseException e){
					System.out.println(e);
				}
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
			System.out.println(s);
		}
		return list;
	}



	/**
	 * 指定したCSVファイルを1行ずつ読み込みます<BR>
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
			try { br.close();} catch (IOException e) {
				e.printStackTrace();
			}
			// 例外発生時処理
			ex.printStackTrace();
		}
		return csvElements;
	}
}

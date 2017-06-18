package com.ams.work410;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
	public List<SalesDto> selectByKey(int tranNo, int detailNo) {
		for(String s : readCsv("item_code.csv")) {
			System.out.println(s);
		}
		return null;
	}

	/**
	 * 指定したCSVファイルを1行ずつ読み込みます<BR>
	 * @param csvFileName
	 * @return
	 */
	private static List<String> readCsv(String csvFileName) {
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

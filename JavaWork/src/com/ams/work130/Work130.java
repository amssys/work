package com.ams.work130;

import java.util.Date;

public class Work130 {






	/**
	 * 日付情報を取り出す<BR>
	 * 作成者:mizobata<BR>
	 * @param date 日付ｵﾌﾞｼﾞｪｸﾄ, type種別 <BR>
	 * @return dates BR>
	 * @throws IllegalArgumentException 引数がNULLの場合<BR>
	 */
	public  int extractYMD(Date date,String type) throws IllegalArgumentException {
		if(date == null){
			throw new IllegalArgumentException("日付オブジェクトがありません");
		}else if(type == null){
			throw new IllegalArgumentException("種別がありません");
		}

		int dates = 0;

		return dates;
	}







}

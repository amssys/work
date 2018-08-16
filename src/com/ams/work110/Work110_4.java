package com.ams.work110;

public class Work110_4 {

	/**
	 * 携帯電話番号であるかを判定する。
	 * @param telNo　電話番号
	 * @return
	 * @throws IllegalArgumentException
	 */
	public boolean isMobilePhoneNumber(String telNo) throws IllegalArgumentException{
		if(telNo == null) {
			throw new IllegalArgumentException("判定対象ではありません。");
		}

		telNo = telNo.trim();

		if(telNo.matches(".*A.*") || telNo.matches(".*あ.*") || telNo.matches(".*\\*.*")) {
			throw new IllegalArgumentException("半角数字以外を使用しています。");
		}
	
		if(telNo.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
			if(telNo.matches(".*070-.*") || telNo.matches(".*080-.*") || telNo.matches(".*090-.*")) {
				return true;
			}
			
		}else if(telNo.matches("[0-9]{3}-[0-9]{4}-")){
			if(telNo.length() != 13) {
				throw new IllegalArgumentException("文字数が不正です。");
			}
		}else {
			throw new IllegalArgumentException("区切りの位置が不正です。");
		}
		return false;	
	}
}
	

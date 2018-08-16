package com.ams.work110;

public class Work110_4 {

	/**
	 * �g�ѓd�b�ԍ��ł��邩�𔻒肷��B
	 * @param telNo�@�d�b�ԍ�
	 * @return
	 * @throws IllegalArgumentException
	 */
	public boolean isMobilePhoneNumber(String telNo) throws IllegalArgumentException{
		if(telNo == null) {
			throw new IllegalArgumentException("����Ώۂł͂���܂���B");
		}

		telNo = telNo.trim();

		if(telNo.matches(".*A.*") || telNo.matches(".*��.*") || telNo.matches(".*\\*.*")) {
			throw new IllegalArgumentException("���p�����ȊO���g�p���Ă��܂��B");
		}
	
		if(telNo.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}")) {
			if(telNo.matches(".*070-.*") || telNo.matches(".*080-.*") || telNo.matches(".*090-.*")) {
				return true;
			}
			
		}else if(telNo.matches("[0-9]{3}-[0-9]{4}-")){
			if(telNo.length() != 13) {
				throw new IllegalArgumentException("���������s���ł��B");
			}
		}else {
			throw new IllegalArgumentException("��؂�̈ʒu���s���ł��B");
		}
		return false;	
	}
}
	

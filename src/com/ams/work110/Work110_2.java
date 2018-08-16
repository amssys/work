package com.ams.work110;

public class Work110_2 {

	/**
	 * •¶š—ñ‚ğ”äŠr‚·‚é
	 * @param str1@”äŠr‚·‚é•¶š—ñ
	 * @param str2@”äŠr‚·‚é•¶š—ñ
	 * @return@”äŠrŒ‹‰Ê
	 * @throws IllegalArgumentException
	 */

	public int compare(String str1,String str2) throws IllegalArgumentException{
		if(str1==null || str2==null) {
			throw new IllegalArgumentException("ˆø”‚ªnull‚Å‚·B");
		}

		if(str1==str2) {
			return 0;

		}else if(str1.equals(str2)) {
			return 1;

		}else if(!(str1.equals(str2)) && str1.equalsIgnoreCase(str2)) {
			return 2;

		} else return 9;
	}
}

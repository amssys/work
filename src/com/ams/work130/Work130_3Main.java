package com.ams.work130;

import java.util.Date;

public class Work130_3Main {

	/**
	 * Work130_3実行クラス
	 * @param args
	 */

	public static void main(String args[]) {
		Work130_3 testObj = new Work130_3();

		System.out.println("ケースNo.1");
		try {
			System.out.println(testObj.dateToString(null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.2");
		try {
			System.out.println(testObj.dateToString(new Date(24L*60L*60L*1000L)));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}
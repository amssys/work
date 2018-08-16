package com.ams.work130;

public class Work130_4Main {

	/**
	 * Work130_4実行クラス
	 * @param args
	 */

	public static void main(String args[]) {
		Work130_4 testObj = new Work130_4();

		System.out.println("ケースNo.1");
		try {
		System.out.println(testObj.stringToDate(null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.2");
		try {
			System.out.println(testObj.stringToDate("2012-05-010"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.3");
		try {
			System.out.println(testObj.stringToDate("2012-05-0"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.4");
		try {
			System.out.println(testObj.stringToDate("2012/05/01"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.5");
		try {
			System.out.println(testObj.stringToDate("201-2-05-01"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.6");
		try {
			System.out.println(testObj.stringToDate("2012-00501"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.7");
		try {
			System.out.println(testObj.stringToDate("2012-04-31"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.8");
		try {
			System.out.println(testObj.stringToDate("2012-05-01"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}

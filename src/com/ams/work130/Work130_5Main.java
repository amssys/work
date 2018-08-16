package com.ams.work130;

public class Work130_5Main {

	/**
	 * Work130_5実行クラス
	 * @param args
	 */

	public static void main(String args[]) {
		Work130_5 testObj = new Work130_5();

		System.out.println("ケースNo.1");
		try {
			System.out.println(testObj.getLasDayOfMonth(1899,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.2");
		try {
			System.out.println(testObj.getLasDayOfMonth(1900,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.3");
		try {
			System.out.println(testObj.getLasDayOfMonth(2100,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.4");
		try {
			System.out.println(testObj.getLasDayOfMonth(2101,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.5");
		try {
			System.out.println(testObj.getLasDayOfMonth(1900,0));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.6");
		try {
			System.out.println(testObj.getLasDayOfMonth(1900,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.7");
		try {
			System.out.println(testObj.getLasDayOfMonth(1900,12));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.8");
		try {
			System.out.println(testObj.getLasDayOfMonth(2100,13));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.9");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.10");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,2));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.11");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,3));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.12");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,4));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.13");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,5));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.14");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,6));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.15");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,7));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.16");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,8));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.17");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,9));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.18");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,10));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.19");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,11));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.20");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,12));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.21");
		try {
			System.out.println(testObj.getLasDayOfMonth(2012,2));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
}

package com.ams.work130;

public class Work130_2Main {

	/**
	 * Work130_2 ���s�N���X
	 * @param args
	 */

	public static void main(String args[]) {
		Work130_2 testObj = new Work130_2();

		System.out.println("�P�[�XNo.1");
		try {
			System.out.println(testObj.creatDate(1899,12,31));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.2");
		try {
			System.out.println(testObj.creatDate(1900,1,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.3");
		try {
			System.out.println(testObj.creatDate(2100,12,31));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.4");
		try {
			System.out.println(testObj.creatDate(2101,1,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.5");
		try {
			System.out.println(testObj.creatDate(1900,0,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.6");
		try {
			System.out.println(testObj.creatDate(1900,12,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.7");
		try {
			System.out.println(testObj.creatDate(1900,13,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.8");
		try {
			System.out.println(testObj.creatDate(1900,1,0));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.9");
		try {
			System.out.println(testObj.creatDate(1900,1,32));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.10");
		try {
			System.out.println(testObj.creatDate(2011,2,29));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.11");
		try {
			System.out.println(testObj.creatDate(2012,2,29));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.12");
		try {
			System.out.println(testObj.creatDate(2012,5,1));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}

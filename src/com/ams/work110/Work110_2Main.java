package com.ams.work110;

public class Work110_2Main {

	/**
	 * Work110_2 ���s�N���X
	 * @param args
	 */

	public static void main(String args[]) {

		Work110_2 testObj  = new Work110_2();

		System.out.println("�P�[�XNo.1");
		try {
			System.out.println(testObj.compare(null,null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.2");
		try {
			System.out.println(testObj.compare(null,"ABC"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.3");
		try {
			System.out.println(testObj.compare("ABC",null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.4");
		try {
			System.out.println(testObj.compare("ABC","ABC"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.5");
		try {
			System.out.println(testObj.compare("ABC",new String("ABC")));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.6");
		try {
			System.out.println(testObj.compare("ABC","abc"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.6");
		try {
			System.out.println(testObj.compare("ABC","XYZ"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
}

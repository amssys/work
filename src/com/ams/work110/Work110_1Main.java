package com.ams.work110;

public class Work110_1Main {

	/**
	 * Work110_1���s�N���X
	 * @auther�@nozomi
	 */

	public static void main(String args[]) {
		Work110_1 testObj = new Work110_1();

		System.out.println("�P�[�XNo.1");
		try {
			testObj.devideIntoChars(null);
			System.out.println(testObj);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.2");
		try {
			testObj.devideIntoChars("ABC");
			System.out.println(testObj);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.3");
		try {
			testObj.devideIntoChars("A");
			System.out.println(testObj);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.4");
		try {
			testObj.devideIntoChars("");
			System.out.println(testObj);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
}

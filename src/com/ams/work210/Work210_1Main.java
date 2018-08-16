package com.ams.work210;

public class Work210_1Main {
	public static void main(String args[]) {
		Work210_1 testObj = new Work210_1();

		System.out.println("No.1");
		try {
			System.out.println(testObj.createRecord(null));
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("No.2");
		try {
			System.out.println(testObj.createRecord(new String[] {}));
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("No.3");
		try {
			System.out.println(testObj.createRecord(new String[] { "X" }));
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("No.4");
		try {
			System.out.println(testObj.createRecord(new String[] { "X", "X", "X", "X" }));
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("No.5");
		try {
			System.out.println(testObj.createRecord(new String[] { "X", "X", "X" }));
	} catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("No.6");
		try {
			System.out.println(testObj.createRecord(new String[] { "4903110006770", "毎朝の食パン", "138" }));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("No.7");
		try {
			System.out.println(testObj.createRecord(new String[] { "4903110006770", null, "138" }));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("No.8");
		try {
			System.out.println(testObj.createRecord(new String[] { "4903110006770", "毎朝の食パン", null }));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
}

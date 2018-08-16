package com.ams.work110;

public class Work110_4Main {
	public static void main(String args[]) {
		Work110_4 testObj = new Work110_4();

		System.out.println("ケースNo.1");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-5678"));
			System.out.println(testObj.isMobilePhoneNumber("090-1234-5679    "));
			System.out.println(testObj.isMobilePhoneNumber("    090-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.2");
		try {
			System.out.println(testObj.isMobilePhoneNumber(null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.3");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-567"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.4");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-56789"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.5");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-567A"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.6");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-567あ"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.7");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234*5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.8");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234567-8"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-12345678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		try {
			System.out.println(testObj.isMobilePhoneNumber("09012345678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.9");
		try {
			System.out.println(testObj.isMobilePhoneNumber("080-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.10");
		try {
			System.out.println(testObj.isMobilePhoneNumber("070-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo11");
		try {
			System.out.println(testObj.isMobilePhoneNumber("060-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.12");
		try {
			System.out.println(testObj.isMobilePhoneNumber("990-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.13");
		try {
			System.out.println(testObj.isMobilePhoneNumber("980-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.14");
		try {
			System.out.println(testObj.isMobilePhoneNumber("970-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
}

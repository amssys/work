package com.ams.work110;

public class Work110_4Main {
	public static void main(String args[]) {
		Work110_4 testObj = new Work110_4();

		System.out.println("�P�[�XNo.1");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-5678"));
			System.out.println(testObj.isMobilePhoneNumber("090-1234-5679    "));
			System.out.println(testObj.isMobilePhoneNumber("    090-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.2");
		try {
			System.out.println(testObj.isMobilePhoneNumber(null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.3");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-567"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.4");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-56789"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.5");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-567A"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.6");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234-567��"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.7");
		try {
			System.out.println(testObj.isMobilePhoneNumber("090-1234*5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.8");
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

		System.out.println("�P�[�XNo.9");
		try {
			System.out.println(testObj.isMobilePhoneNumber("080-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.10");
		try {
			System.out.println(testObj.isMobilePhoneNumber("070-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo11");
		try {
			System.out.println(testObj.isMobilePhoneNumber("060-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.12");
		try {
			System.out.println(testObj.isMobilePhoneNumber("990-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.13");
		try {
			System.out.println(testObj.isMobilePhoneNumber("980-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.14");
		try {
			System.out.println(testObj.isMobilePhoneNumber("970-1234-5678"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
}

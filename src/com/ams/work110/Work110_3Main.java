package com.ams.work110;

public class Work110_3Main {
	public static void main(String args[]) {

		Work110_3 testObj = new Work110_3();

		System.out.println("ケースNo.1");
		try {
			System.out.println("\"" + testObj.extractString(null,9,1) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.2");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",0,1) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.3");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",9,1) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.4");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",1,-1) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.5");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",1,9) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.6");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",3,4) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.7");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",1,0) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.8");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",1,1) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.9");
		try {
			System.out.println("\"" + testObj.extractString("ABCDEFGH",1,8) + "\"");
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}

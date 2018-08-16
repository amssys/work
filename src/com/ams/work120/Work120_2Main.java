package com.ams.work120;

public class Work120_2Main {
	public static void main(String args[]) {
		Work120_2 testObj = new Work120_2();

		System.out.println("ケースNo.1");
		try {
			System.out.println(testObj.average(null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.2");
		try {
			System.out.println(testObj.average(new String[] {""}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.3");
		try {
			System.out.println(testObj.average(new String[]{"1","2","A"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.4");
		try {
			System.out.println(testObj.average(new String[] {"1","2","3"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケース5");
		try {
			System.out.println(testObj.average(new String[] {"1","2","3.4"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.6");
		try {
			System.out.println(testObj.average(new String[] {"-1","2","3"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.7");
		try {
			System.out.println(testObj.average(new String[] {"999999999999","1"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}

package com.ams.work120;

public class Work120_1Main {
	public static void main(String args[]) {
		Work120_1 testObj = new Work120_1();

		System.out.println("ケースNo.1");
		try {
			System.out.println(testObj.sum(null));
		}catch (IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.2");
		try {
			System.out.println(testObj.sum(new String[]{"1", "2", "A"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.3");
		try {
			System.out.println(testObj.sum(new String[]{"1", "2", "3.4"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo4");
		try {
			System.out.println(testObj.sum(new String[]{"1", "2", "3"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.5");
		try {
			System.out.println(testObj.sum(new String[]{"-1", "2", "3"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.6");
		try {
			System.out.println(testObj.sum(new String[]{}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("ケースNo.7");
		try {
			System.out.println(testObj.sum(new String[]{"99999999999", "1"}));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}
}

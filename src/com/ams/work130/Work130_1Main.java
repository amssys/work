package com.ams.work130;

import java.util.Date;

public class Work130_1Main {
	public static void main(String args[]) {
		Work130_1 testObj = new Work130_1();

		System.out.println("�P�[�XNo.1");
		try {
			System.out.println(testObj.extractYMD(null,"Y"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.2");
		try {
			System.out.println(testObj.extractYMD(new Date(),null));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.3");
		try {
			System.out.println(testObj.extractYMD(new Date(),"X"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.4");
		try {
			System.out.println(testObj.extractYMD(new Date(24L*60L*60L*1000L), "Y"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.5");
		try {
			System.out.println(testObj.extractYMD(new Date(24L*60L*60L*1000L), "M"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.6");
		try {
			System.out.println(testObj.extractYMD(new Date(24L*60L*60L*1000L), "D"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.7");
		try {
			System.out.println(testObj.extractYMD(new Date(),"Y"));
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.8");
		try {
			System.out.println(testObj.extractYMD(new Date(), "M"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

		System.out.println("�P�[�XNo.9");
		try {
			System.out.println(testObj.extractYMD(new Date(), "D"));
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}

	}
}

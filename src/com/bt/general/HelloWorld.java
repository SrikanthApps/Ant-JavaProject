package com.bt.general;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to ANT !! " + getLocalCurrentDate());
		System.out.println("This is SrikanthNani");
		System.out.println("testing artifactory");
	}

	private static Date getLocalCurrentDate() {
		return new Date();
	}

}

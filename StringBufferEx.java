package com.strings;

public class StringBufferEx {

	public static void main(String[] args) {
		
	//methods--> insert, delete, append, reverse;
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
		String msg = sb.toString();
		
		System.out.println(msg);
		
		
		
		sb.insert(0,"p");
		System.out.println(sb.insert(0,"p"));
		
/*
 * StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" world");
		String msg = sb.toString();
		System.out.println(msg);
		
		sb.insert(11," p");
		System.out.println(sb.insert(0,"p"));*/
		
	}

}


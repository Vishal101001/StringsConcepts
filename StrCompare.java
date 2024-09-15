package com.strings;

public class StrCompare {

	public static void main(String[] args) {
		String data1="java";
		String data2= "java";
		String data3= new String("java");
		System.out.println(data1==data2);
		System.out.println(data1==data3);
		boolean result= data2.equals(data3);
		System.out.println(result);
	
	}

}

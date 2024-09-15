package com.strings;

public class ToStrMethod {

	int rollNo;
	String name;
	
	ToStrMethod(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	//override toString() method
	public String toString() {
		return rollNo+" "+name;
	}
	public static void main(String[] args) {
		ToStrMethod t = new ToStrMethod(1,"vishal") ;
		ToStrMethod t1 = new ToStrMethod(2,"aman") ;
		
		System.out.println(t);
		System.out.println(t1);
	}
}

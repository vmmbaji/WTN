package com.wipro.StringAndStringBuffer;

public class StrEx3 {
	public static String extraFront(String str) {
		  if(str.length()<2)
		  return str;
		  return str.substring(0,2);
		}

	public static void main(String[] args) {
		String s="Wipro";
		int n=s.length();
		while(n>0) {
//			System.out.print(s.substring(0,2));
			System.out.print(extraFront(s));
			n--;
		}
	}
}

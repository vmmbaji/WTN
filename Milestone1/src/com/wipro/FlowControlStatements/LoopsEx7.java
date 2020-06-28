package com.wipro.FlowControlStatements;

public class LoopsEx7 {
	public static void main(String[] args) {
		char ch='A';
		if(Character.isUpperCase(ch))
			System.out.println(ch+"->"+Character.toLowerCase(ch));
		else
			System.out.println(ch+"->"+Character.toUpperCase(ch));
	}
}

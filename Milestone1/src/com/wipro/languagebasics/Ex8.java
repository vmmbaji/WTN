package com.wipro.languagebasics;

public class Ex8 {
	public static void main(String[] args) {
		char ch='5';
		if(Character.isLetter(ch))
			System.out.println("Alphabet");
		else if(Character.isDigit(ch))
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}

}

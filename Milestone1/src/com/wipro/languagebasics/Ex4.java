package com.wipro.languagebasics;

public class Ex4 {
	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		if(x==0)
			System.out.println("Zero");
		else if(x>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}

}
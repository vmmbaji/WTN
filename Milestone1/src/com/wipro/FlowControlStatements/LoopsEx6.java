package com.wipro.FlowControlStatements;

public class LoopsEx6 {
	public static void main(String[] args) {
		String s=String.valueOf(args[0]);
		int age=Integer.parseInt(args[1]);
		String s1="Male";
		String s2="Female";
		if(s.compareTo(s1)==0 && (age>=1 && age<=58))
			System.out.println("The percentage of interest is 8.4%");
		else if(s.compareTo(s1)==0 && (age>=59 && age<=100))
			System.out.println("The percentage of interest is 10.5%");
		else if(s.compareTo(s2)==0 && (age>=1 && age<=58))
			System.out.println("The percentage of interest is 8.2%");
		else
			System.out.println("The percentage of interest is 9.2%");
		
	}

}

package com.wipro.FlowControlStatements;

public class LoopsEx17 {
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		int rem=0,rev=0,t=n;
		while(t>0) {
			rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		System.out.println(rev);
	}
}

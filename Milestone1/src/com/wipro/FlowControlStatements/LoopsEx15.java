package com.wipro.FlowControlStatements;

public class LoopsEx15 {
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		int rem=0,sum=0,t=n;
		for( ;t>0; ) {
			rem=t%10;
			sum=sum+rem;
			t=t/10;
		}
		System.out.println(sum);
	}
}

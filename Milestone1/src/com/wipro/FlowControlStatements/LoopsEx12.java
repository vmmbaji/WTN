package com.wipro.FlowControlStatements;

public class LoopsEx12 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int f=0;
		if(n==0 || n==1)
			System.out.println(n+" is neither prime nor composite");
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0)
					f=1;
			}
			if(f==0)
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+" is not a prime number");
		}
	}
}

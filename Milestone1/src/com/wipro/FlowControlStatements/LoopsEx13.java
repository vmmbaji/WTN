package com.wipro.FlowControlStatements;

public class LoopsEx13 {
	public static void main(String args[]) {
		for(int n=10;n<=99;n++) {
			int f=0;
			for(int i=2;i<n;i++) {
				if(n%i==0)
					f=1;
			}
			if(f==0)
				System.out.print(n+" ");
		}
	}
}

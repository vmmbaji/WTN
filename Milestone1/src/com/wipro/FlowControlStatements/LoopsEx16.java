package com.wipro.FlowControlStatements;

public class LoopsEx16 {
	public static void main(String args[]) {
		int n=Integer.parseInt(args[0]);
		int j=1;
		while(j<=n) {
			for(int i=1;i<=j;i++) {
				System.out.print("* ");
			}
			j++;
			System.out.println();
		}
	}
}

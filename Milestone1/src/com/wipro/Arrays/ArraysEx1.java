package com.wipro.Arrays;

public class ArraysEx1 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("Sum is "+sum+"\nAverage is "+sum/(a.length));
	}
}

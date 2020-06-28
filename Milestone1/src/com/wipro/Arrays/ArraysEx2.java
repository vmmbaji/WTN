package com.wipro.Arrays;

public class ArraysEx2 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int min=a[0],max=a[0];
		for(int i:a) {
			if(min>i)
				min=i;
			if(max<i)
				max=i;
		}
		System.out.println("Minimum number is "+min+"\nMaximum number is "+max);
	}
}

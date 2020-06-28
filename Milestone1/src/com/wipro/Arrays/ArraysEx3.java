package com.wipro.Arrays;

public class ArraysEx3 {
	public static void main(String[] args) {
		int[] a= {1,4,34,56,7};
		int k=56,f=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				System.out.println(i);
				f++;
				break;
			}
		}
		if(f==0)
			System.out.println(-1);
}
}

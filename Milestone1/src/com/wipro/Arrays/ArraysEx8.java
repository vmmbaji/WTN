package com.wipro.Arrays;

public class ArraysEx8 {
	public static void main(String[] args) {
		int[] a= {1,6,4,7,9};
		int s=0,fi=0,si=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==6)
				fi=i;
			if(a[i]==7)
				si=i;
		}
		for(int i=fi;i<=si;i++)
			a[i]=0;
		for(int i:a)
			s+=i;
		System.out.println(s);
	}
}

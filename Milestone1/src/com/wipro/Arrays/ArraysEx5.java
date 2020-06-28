package com.wipro.Arrays;
import java.util.Arrays;
public class ArraysEx5 {
	public static void main(String[] args) {
		int[] a= {5,89,58,26,4,47,1,99,97,3};
		Arrays.sort(a);
		System.out.println("Minimum numbers are "+a[0]+"  "+a[1]+"\nMaximum numbers are "+a[a.length-2]+"  "+a[a.length-1]);
//		int min1,min2,max1,max2;
//		min1=min2=max1=max2=a[0];
//		for(int i:a) {
//			if(min1>i) {
//				min1=i;
//			}
//			if(min2>i && i>min1) {
//				min2=i;
//			}
//			if(max1<i) {
//				max1=i;
//			}
//			if(max2<i && i<max1) {
//				max2=i;
//			}
//		}
//		System.out.println("Minimum numbers are "+min1+"  "+min2+"\nMaximum numbers are "+max2+"  "+max1);
	}
}

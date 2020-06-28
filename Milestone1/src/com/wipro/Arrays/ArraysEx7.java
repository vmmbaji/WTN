package com.wipro.Arrays;

public class ArraysEx7 {
	public static void main(String[] args) {
		int[] a={12,34,12,45,67,89};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					a[j]=-1;
			}
			if(a[i]!=-1)
				System.out.print(a[i]+" ");
		}
	}
}

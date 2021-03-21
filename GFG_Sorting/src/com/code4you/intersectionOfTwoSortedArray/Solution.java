package com.code4you.intersectionOfTwoSortedArray;

public class Solution {

	public static void main(String[] args) {
		int a[] = {3,5,10,10,10,15,15,20};
		int b[] = {5,10,10,15,30};
		
		printInterSectionElement(a,b);
	}

	private static void printInterSectionElement(int[] a, int[] b) {

		int aLen = a.length;
		int bLen = b.length;
		
		int i=0,j=0;
		while (i<aLen && j<bLen) {
			if (i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			
			
			if (a[i]>b[j]) {
				j++;
			}else if(a[i]<b[j]){
				i++;
			}else {
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
		}
		
		/*while (i<aLen) {
			if (i>0 && a[i]==a[i-1]) {
				i++;
			}else {
				System.out.print(a[i]+" ");
			}
		}
		
		while (j<bLen) {
			if (j>0 && b[j]==b[j-1]) {
				j++;
			}else {
				System.out.print(b[j]+" ");
			}
		}*/
	}

}

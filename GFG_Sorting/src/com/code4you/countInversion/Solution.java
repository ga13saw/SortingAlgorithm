package com.code4you.countInversion;

public class Solution {

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,3,5};
		int count = findInversionCount(arr,0,arr.length-1);
		System.out.println(count);
	}

	private static int findInversionCount(int[] arr, int l, int r) {

		int res=0;
		if (r>l) {
			int m = l+(r-l)/2;
			res+=findInversionCount(arr, l, m);
			res+=findInversionCount(arr, m+1, r);
			res+=countAndMerge(arr,l,m,r);
		}
		return res;
	}

	private static int countAndMerge(int[] arr, int l, int m, int r) {

		int n1 = m-l+1, n2=r-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			left[i]=arr[l+i];
		}
		
		for (int i = 0; i < n2; i++) {
			right[i]=arr[m+1+i];
		}
		
		int i=0,j=0,k=l,res=0;
		
		while (i<n1 && j< n2) {
			if (left[i]<=right[j]) {
				arr[k++]=left[i++];
				
			}else {
				arr[k++]=right[j++];
				res+=n1-i;
			}
		}
		
		while (i<n1) {
			arr[k++]=left[i++];
		}
		
		while (j<n2) {
			arr[k++]=right[j++];
		}
		
		return res;
	}

}











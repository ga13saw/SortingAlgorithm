package com.code4you.mergesort;

public class Solution {

	public static void main(String[] args) {
		//int[] arr = {2,1,6,3,9,5,7,8};
		int[] arr = {32,19,62,3,9,25,73,8};
		mergeSort(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static void mergeSort(int[] arr,int l, int r) {
		
		if (l<r) {
			int mid = l+(r-l)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
		
	}

	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m-l+1, n2 = r-m;
		int[] left= new int[n1];
		int[] right = new int[n2];
		
		//coping elements respective array
		for (int i = 0; i < n1; i++) {
			left[i]= arr[l+i];
		}
		
		for (int i = 0; i < n2; i++) {
			right[i]= arr[m+1+i];
		}
		
		int i=0,j=0,k=l;
		
		//sorting arrays
		while (i<n1&j<n2) {
			if (left[i]<=right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
			}
			
		}
		while (i<n1) {
			arr[k++]=left[i++];
		}
		while (j<n2) {
			arr[k++]=right[j++];
		}
		
	}

}








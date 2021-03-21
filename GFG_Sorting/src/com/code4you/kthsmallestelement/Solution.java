package com.code4you.kthsmallestelement;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		//test case 1
		//int[] arr = {10,5,30,12}; int k =2;
		
		//test case 2
		int[] arr = {30,20,5,10,8,1,15}; int k =4;
		
		//int kthSmallest = findKthSmallest(arr,k);
		//System.out.println(kthSmallest);
		int partititon = findKthSmallestUsingPartititon(arr, k);
		System.out.println(partititon);

	}

	/*
	 * naive solution step1: sort array step2: find k-1 element as kth smallest
	 * element time complexity : O(nlogn) ,space complexity: O(1)
	 */
	private static int findKthSmallest(int[] arr, int k) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);

		return arr[k - 1];
	}

	/*
	 * efficient solution using partition concept of quick sort
	 */
	private static int findKthSmallestUsingPartititon(int[] arr, int k) {
		int l= 0, r=arr.length-1;
		while (l<=r) {
			int p = partition(arr,l,r);
			if (p==k-1) {
				return arr[p];
			}
			else if (p<k-1) {
				l=p+1;
			}else {
				r=p-1;
			}
		}
		return -1;
	}

	private static int partition(int[] arr, int l, int r) {
		int pivot = arr[r];
		int index = l-1;
		
			for (int i = l; i < r; i++) {
				if (arr[i]<pivot) {
					index++;
					swap(arr,index,i);
				}
			}
		swap(arr,index+1, r);
		return index+1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
		
	}


	
	
}

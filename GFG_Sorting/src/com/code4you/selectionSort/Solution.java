package com.code4you.selectionSort;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {4,1,9,2,6,5};
		selectionSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			int min=i;
			for (int j = i+1; j < len; j++) {
				if (arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(arr, i,min);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}

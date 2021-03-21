package com.code4you.insertionSort;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {4,1,9,2,6,5};
		insertionSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j=i-1;
			while (j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}

}

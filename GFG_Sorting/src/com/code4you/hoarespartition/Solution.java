package com.code4you.hoarespartition;

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 1, 9, 4, 12, 8, 3 };
		hoarespartition(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int hoarespartition(int[] arr, int l, int h) {

		int pivot = arr[l];
		int i = l - 1, j = h + 1;
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			do {
				j--;
			} while (arr[j] > pivot);
			if (i >= j) {
				return j;
			} else {
				swap(arr, i, j);
			}

		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}

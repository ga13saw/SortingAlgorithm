package com.code4you.qsort;

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 1, 9, 4, 12, 8, 3 };
		qSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

	private static void qSort(int[] arr, int i, int j) {
		if (i<j) {
			/* hoarespartition
			 * int p = hoarespartition(arr, i, j);
			qSort(arr, i, p);
			qSort(arr, p+1, j);*/
			
			//lomuto partition
			int p = lomutoPartion(arr, i, j);
			qSort(arr, i, p-1);
			qSort(arr, p+1, j);
			
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
	private static void naivepartiotion(int[] arr, int i, int j) {
		int[] tempArr = new int[j+1];
		int pivot=arr[j],index=0;
		for (int k : arr) {
			if(k <= pivot){
				tempArr[index++]=k;
			}
		}
		for (int k : arr) {
			if (k>pivot) {
				tempArr[index++]=k;
			}
		}
		System.arraycopy(tempArr, 0	, arr, 0, tempArr.length);
		
	}
	private static int lomutoPartion(int[] arr,int l, int h) {
		int pivot = arr[h];
		int i=l-1;
		
			for (int j = l; j <= h-1; j++) {
				if (arr[j]<=pivot) {
					i++;
					swap(arr,i,j);
				}
			}
			swap(arr,i+1,h);
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}

package com.code4you.lomutopartion;

public class Solution {

	public static void main(String[] args) {
		//int[] arr = {10,7,1,9,4,12,8,3};
		int[] arr = {30,20,5,10,1,8,15};
		int[] lomutoPartion = lomutoPartion(arr,0,arr.length-1);
		for (int i : lomutoPartion) {
			System.out.print(i+" ");
		}
	}
	
	// as soon as you see smaller element than pivot, increment smaller element window and swap the number
	private static int[] lomutoPartion(int[] arr,int l, int h) {
		int pivot = arr[h];
		int i=l-1;
		
			for (int j = l; j < h-1; j++) {
				if (arr[j]<pivot) {
					i++;
					swap(arr,j,i);
				}
			}
			swap(arr,i+1,h);
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}

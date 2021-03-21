package com.code4you.naivepartition;

public class Solution {

	public static void main(String[] args) {
		int[] arr = {10,7,1,9,4,12,8,3};
		int[] naivepartiotion = naivepartiotion(arr,0,arr.length-1);
		for (int i : naivepartiotion) {
			System.out.print(i+" ");
		}
	}

	private static int[] naivepartiotion(int[] arr, int i, int j) {
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
		return tempArr;
		
	}

}

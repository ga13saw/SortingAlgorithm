package com.code4you.sortanarraywith2types;

public class Solution {
	/*problem:
	 * given an array 'arr'. Segregate 2 different types of element
	 * 
	 * */
	public static void main(String[] args) {
		//test case1:
		//int[] arr = {15,-3,-2,16};
		//test case2:
		int[] arr = {-15,-3,-2,16,0,8,-7};
		segregateEvenOdd(arr);
		//segregateNegPos(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	//time complexity:O(n)  time complexity:(1)
	//segregate positive and negative values
	private static void segregateNegPos(int[] arr) {
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0){
				swap(arr,++index,i);
			}
		}
	}
	
	private static void segregateEvenOdd(int[] arr) {
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0){
				swap(arr,++index,i);
			}
		}
	}

	private static void swap(int[] arr, int i, int i2) {
		int temp = arr[i];
		arr[i]=arr[i2];
		arr[i2]=temp;
		
	}

}

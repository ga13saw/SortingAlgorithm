package com.code4you.sortanarraywith3types;

public class Solution {
	/*problem:
	 * given an array 'arr'. Segregate 3 different types of element
	 * 
	 * */
	public static void main(String[] args) {
		//test case1:
		//int[] arr = {15,-3,-2,16};
		//test case2:
		int[] arr = {0,2,2,2,1,1,0,1,2,2,2,1};
		//int[] arr = {0,2,3,6,1,1,0,10,2,99,1};
		segregate(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
	
	private static void segregate(int[] arr) {
		int index=0,mid=0,last=arr.length-1;
		while(mid<=last){
			if(arr[mid]==0){
				swap(arr,index,mid);
				mid++;
				index++;
			}else if (arr[mid]==1) {
				mid++;
			}
			else{
				swap(arr, mid, last);
				last--;
			}
		}
	}

	private static void swap(int[] arr, int i, int i2) {
		int temp = arr[i];
		arr[i]=arr[i2];
		arr[i2]=temp;
		
	}

}

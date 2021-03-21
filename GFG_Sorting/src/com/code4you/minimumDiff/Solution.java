package com.code4you.minimumDiff;

import java.util.Arrays;

public class Solution {
	//find minimum difference in an array
	public static void main(String[] args) {
		//test case1:
			//int[] arr = {2,5,1,8,3,9};
		//test case2:
			//int[] arr = {1,8,12,5,18};
		//test case3:
			//int[] arr = {8,-1,0,3};
		//test case4:
		int[] arr = {};
		int mindiff = calculateMindiff(arr);
		System.out.println(mindiff);
	}
	
	//using sorting approach Time complexity:O(nlogn)
	private static int calculateMindiff(int[] arr) {
		int min = Integer.MAX_VALUE;
		if (arr.length==0) {
			return min;
		}
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]-arr[i-1]);
		}
		return min;
		
	}

}

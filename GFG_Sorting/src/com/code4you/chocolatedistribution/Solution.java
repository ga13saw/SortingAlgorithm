package com.code4you.chocolatedistribution;

import java.util.Arrays;

public class Solution {
	/*problem:
	 * given array 'arr' of chocolate packets. Distribute these chocolates among 'm' such that
	 * minimum difference between selected max and min choclate packets is minimum.
	 * */
	public static void main(String[] args) {
		//test case1:
		//int[] chocopkt = {7,3,2,4,9,12,56}; // select 2 3 4 and min = 4-2 = 2
		//int m = 3;
		
		//test case2:
		int[] chocopkt = {3,4,1,9,56,7,9,12};
		int m = 5;
		
		int min = distributeChocolate(chocopkt,m);
		System.out.println(min);
	}
	
	//time complexity: O(nlogn)  space complexity: O(1)
	private static int distributeChocolate(int[] chocopkt, int m) {
		Arrays.sort(chocopkt);
		int res = chocopkt[m-1]-chocopkt[0];
		for (int i = 1; i < chocopkt.length-m; i++) {
			res = Math.min(res, chocopkt[i+m-1]-chocopkt[i]);
		}
		return res;
	}

}

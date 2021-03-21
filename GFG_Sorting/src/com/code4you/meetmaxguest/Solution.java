package com.code4you.meetmaxguest;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] arr = { 800, 700, 600, 500 };
		int[] dep = { 840, 820, 830, 530 };

		int maxGuestMeet = maxGuestMeet(arr, dep);
		System.out.println(maxGuestMeet);
	}

	private static int maxGuestMeet(int[] arr, int[] dep) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int n = arr.length;
		int i = 1, j = 0, curr = 1, res = 1;
		while (i < n && j < n) {
			if (arr[i] <= dep[j]) {
				curr++;
				i++;
			} else {
				j++;
				curr--;
			}
			res = Math.max(res, curr);
		}
		return res;
	}

}

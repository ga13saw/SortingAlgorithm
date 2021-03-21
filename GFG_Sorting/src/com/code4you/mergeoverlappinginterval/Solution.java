package com.code4you.mergeoverlappinginterval;

public class Solution {
	//problem: merge overlapping interval
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] interval = {{1,3},{2,4},{5,7},{6,8}};
		//mergeInterval(interval);
		int[][] interval2 = mergeInterval2(interval);
		for (int[] is : interval2) {
			System.out.print("["+is[0]+","+is[1]+"] ");
		}
	}
	//ranges should be sorted based on start of range value
	private static void mergeInterval(int[][] interval) {
		int index = 0,j=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		StringBuilder str = new StringBuilder();
		for (int i = 1; i < interval.length; i++) {
			if (interval[index][j+1]>interval[i][j]) {
				min = Math.min(interval[index][j],interval[i][j]);
				max = Math.max(interval[index][j+1],interval[i][j+1]);
				interval[index][0]=min;
				interval[index][1]=max;
				//str.append("["+min+","+max+"]");
			}else{
			interval[++index]=interval[i];
			}
			
		}
		/*for (int[] is : interval) {
			System.out.print(is[0]+","+is[1]+"  ");
		}*/
		
		for (int k = 0; k <= index; k++) {
			System.out.print("["+interval[k][0]+","+interval[k][1]+"] ");
		}
		
	}
	
	private static int[][] mergeInterval2(int[][] interval) {
		int index = 0,j=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		StringBuilder str = new StringBuilder();
		for (int i = 1; i < interval.length; i++) {
			if (interval[index][j+1]>interval[i][j]) {
				min = Math.min(interval[index][j],interval[i][j]);
				max = Math.max(interval[index][j+1],interval[i][j+1]);
				interval[index][0]=min;
				interval[index][1]=max;
				//str.append("["+min+","+max+"]");
			}else{
			interval[++index]=interval[i];
			}
			
		}
		/*for (int k = 0; k <= index; k++) {
			System.out.print("["+interval[k][0]+","+interval[k][1]+"] ");
		}*/
		
		int[][] res = new int[index+1][2];
		for (int i = 0; i <= index; i++) {
			res[i]=interval[i];
			
		}
		
		
		return res;
		
	}

}

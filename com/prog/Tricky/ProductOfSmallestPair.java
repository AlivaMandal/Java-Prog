package com.prog.Tricky;

import java.util.Arrays;

public class ProductOfSmallestPair {
	static int prodsmal(int arr[],int sum) {
		if(arr == null || arr.length<2)
			return 1;
		Arrays.sort(arr);
		int smallpair=arr[0]+arr[1];
			if(smallpair<=sum)
				return arr[0]*arr[1];
		return 0;
	}

	public static void main(String[] args) {
		int array[]= {7,9,8,2,3,5,4,6};
		int sum=7;
		System.out.print("sum of smalest pair is: "+prodsmal(array,sum));
		}

	}


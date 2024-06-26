package com.Acc.prv;

public class MinMask {
	public static int mini(int s[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<s.length;i++) {
			if(min>s[i]) {
				min=s[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[]= {50,66,86,23,10,45};
		System.out.println(mini(arr));

	}

}

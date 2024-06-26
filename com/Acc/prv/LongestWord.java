package com.Acc.prv;

public class LongestWord {
	static String longest(String s) {
		String arr[]=s.split(" ");
		String ans="";
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i].length()>arr[j].length()) 
				ans=arr[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s="my name is aliva an di am mandal";
		System.out.println(longest(s));
	}

}

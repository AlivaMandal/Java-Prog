package com.Acc.prv;

public class NUmsqSum {
	public static int sum(int n) {
		String s="";
		while(n!=0) {
			int rem=n%10;             //4     //3
			s=rem*rem+s;              //4*4=16+""=16(String)
			//System.out.println(s);     //3*3=9+s =9+16 =916
			n=n/10;
		}
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		int num=34;
		int n=15;
		System.out.println(sum(n));
		System.out.println(sum(num));

	}

}

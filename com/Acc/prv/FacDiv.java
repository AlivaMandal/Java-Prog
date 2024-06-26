package com.Acc.prv;

public class FacDiv {
	public static int fact(int n) {
		if(n==0)
			return 1;
		return n * fact(n-1);
	}
	
	public static int num(String s) {
		int count=0;
		int res=fact(s.length());
		for(int i=0;i<s.length();i++) {
			count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				System.out.println("count"+count);
				}
			
			
		}
			}
			
		return res;
	}

	public static void main(String[] args) {
	
		String s="abcba";
		System.out.println(num(s));
	}

}

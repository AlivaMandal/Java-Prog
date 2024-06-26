package com.Acc.prv;

public class XorAndOr {
	public static int check(String s) {
		int res=0;
			if(s.charAt(1)=='c') {
				res=(s.charAt(0)-'0') ^ (s.charAt(2)-'0');
			}else if(s.charAt(1)=='b') {
				res=(s.charAt(0)-'0') & (s.charAt(2)-'0');
			}else if(s.charAt(1)=='a') {
				res=(s.charAt(1)-'0') | (s.charAt(2)-'0');
			}
			int i=3;
			while(i<s.length()) {
				if(s.charAt(i)=='c') {
					res=res ^ (s.charAt(i+1)-'0');
				}else if(s.charAt(i)=='b') {
					res=res & (s.charAt(i+1)-'0');
				}else if(s.charAt(i)=='a') {
					res=res | (s.charAt(i+1)-'0');
				}
				i+=2;
			}
			
		return res;
	}
	public static void main(String args[]) {
		String s="1c0c1c1a0b1";
		System.out.println(check(s));
	}

}

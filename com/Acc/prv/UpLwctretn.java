package com.Acc.prv;

public class UpLwctretn {
	static String check(String s) {
		int up=0,low=0;
		for(int i=0;i<s.length();i++) {
			char cur= s.charAt(i);
			if(cur<=122 && cur>=97) {
				low++;
			}
			if(cur<=90 && cur>=65) {
				up++;
			}
		}
		if(up>low) {
			return s.toUpperCase();
			}else {
				return s.toLowerCase();
			}
	}
	static String check2(String st) {
		int count=0;
		for(int i=0;i<st.length();i++) {
			if(Character.isUpperCase(st.charAt(i))) {
				count++;
			}else {
				count--;
			}
			//System.out.println(count);
		}
		if(count>0)
			return st.toUpperCase();
		else
			return st.toLowerCase();
	}

	public static void main(String[] args) {
		String str="AbCdEfG";
		String str1="xYz";
		String str2="ABCabcxZ";
		System.out.println(check2(str));
		System.out.println(check2(str1));
		System.out.println(check2(str2));
	}

}

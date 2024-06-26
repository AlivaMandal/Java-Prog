package com.prog.Tricky;

public class StrRem {
	static int rem(String s) {
		int temp=Integer.parseInt(s);
		int rem=temp%11;
		return rem;
	}

	public static void main(String[] args) {
		String str="121";
		String s2="1345";
		System.out.println(str+" output: "+rem(str));
		System.out.println(s2+" output: "+rem(s2));
	}

}

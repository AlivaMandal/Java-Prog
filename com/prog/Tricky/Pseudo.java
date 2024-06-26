package com.prog.Tricky;

public class Pseudo {
	static int fun(int a,int b) {
		if(a<b) {
			System.out.println("first "+fun(a,b-2));
			return 1+fun(a,b-2);
		}
		if((a ^ b) > (a & b)) {
			System.out.println(a+" "+b);
			System.out.println("xor "+(a ^ b));
			return a ^ b;
		}
		else {
			System.out.println("and "+(a & b));
			return (a & b);
		}
	}

	public static void main(String[] args) {
		int a=4,b=9;
		System.out.println("ans: "+fun(a,b));

	}

}

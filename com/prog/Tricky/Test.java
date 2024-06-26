package com.prog.Tricky;

public class Test {
	static int fun(int n) {
		if(n==5)
			return 2*(n+1);
		else
			return 2*fun(n-1);
	}

	public static void main(String[] args) {
		int x=8;
		System.out.println(fun(x));

	}

}

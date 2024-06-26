package com.prog.Tricky;

public class Sum_of_Nth {
	static int sum(int k) {
		if(k>0) {
			return k+sum(k-1);
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int n=8;
		System.out.println(sum(n));
	}

}

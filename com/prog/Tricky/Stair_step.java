package com.prog.Tricky;
/*
 * a person climbs  a staircase and take n steps to reach the top 
 * In each turn person can climb 1 or m stairs,
 * find the minimum number of climbs to reach the top. 
 */

public class Stair_step {
	static int count_min_step(int n,int m) {  
		if(m>=n)
			return n;
		return (n/m)+(n%m);
	}

	public static void main(String[] args) {
		int n=13,m=5;
		System.out.println(n/m);
		System.out.println(n%m);
		System.out.println("minimum step to reach the top: "+count_min_step(n,m));

	}

}

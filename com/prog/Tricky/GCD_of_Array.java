package com.prog.Tricky;

import java.util.Scanner;

public class GCD_of_Array {
	static int gcd(int x,int y) {
		if(x>y) {
			if(x%y==0)
			return x;
		return gcd(y,x%y);
		}else {
			if(y%x==0)
				return y;
			return gcd(x,y%x);
		}
	}
	
	static int gcd_range(int low, int high) {
	    int a = low;
	    for (int i = low + 1; i <= high; i++) {
	        a = gcd(a, i);
	    }
	    return a;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range: ");
		int low=s.nextInt();
		int high=s.nextInt();
		int gcd=gcd_range(low,high);
		System.out.println("yout gcd is: "+gcd);
		s.close();
	}

}

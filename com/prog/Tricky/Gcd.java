package com.prog.Tricky;

import java.util.Scanner;

public class Gcd {
	static int gcd(int a,int b) {
		int gcd=1;
		for(int i=1;i<=a && i<= b;i++) {
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		return gcd;
	}
	static int gcd2(int x,int y) {
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

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your number: ");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("gcd of "+a+" and "+b+" is: "+gcd2(a,b));
		s.close();
	}

}

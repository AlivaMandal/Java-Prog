package com.prog.Tricky;

public class SumOfDigit {
	static int sumDigit(int n) {
		int sum=0;
		while(n!=0) {
			sum+=(n%10);
			n/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num=1235;
		System.out.println("sum of digit ("+num+") is "+sumDigit(num));
	}

}

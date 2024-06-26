package com.Acc.prv;

public class PowisInt {
	public static int powr(int n,int m) {
	   
	    double p=1.0/(double)n;
	    //System.out.println(p);
		int a =  (int) Math.pow(m, p);
		//System.out.println(a);
		if(a%1==0)
			return a;
		else
			return -1;
	}
	
	public static int nthroot(int number,int root) {
		 double x = number;
	     double guess = 1;

	        while (Math.abs(x - guess) > 0) {
	            guess = ((guess + (number / Math.pow(guess, root - 1))) / root);
	        }                      //Newton-Raphson method

	        return (int) guess;
	}

	public static void main(String[] args) {
		int n=3,m=27;
		int n1=4,m1=69;
		System.out.println(powr(n,m));
		System.out.println(nthroot(n1,m1));

	}

}

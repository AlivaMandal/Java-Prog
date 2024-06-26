package com.Acc.prv;

public class PrintPattern {
	static void pattern(int n) {
		for(int i=n;i>0;i--) {           //printing lines
			for(int j=n;j>0;j--) {        //print the digit
				for(int k=0;k<i;k++) {    //count of digit
				System.out.print(j);      
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=4;
		pattern(n);

	}

}

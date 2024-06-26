package com.Acc.prv;

public class NumTringle {
	public static void triangle(int n) {
		int p=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(p+" ");
				p++;
			}
			for(int k=n-1;k>=0;k--) {         //spaces
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		triangle(4);

	}

}

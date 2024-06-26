package com.pattern;

public class FloydsTriangle {
	static void floyd(int n) {
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(a+" ");
				a++;
			}
			for(int j=n-1;j<=0;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int i=4;
		floyd(i);

	}

}

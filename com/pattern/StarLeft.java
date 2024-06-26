package com.pattern;

public class StarLeft {
	public static void leftstar(int height) {
		for(int i=1;i<=height;i++) {
			for(int j=0;j<=height-i;j++) {
				System.out.print("*");
			}
			for(int k=0;k<2*i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void starlef(int h) {
		for(int i=0;i<=h;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int k=h-1;k>=0;k--) {
				System.out.print("");
	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=5;
	     leftstar(n);
	     System.out.println("__________________");
		 starlef(n);

	}

}

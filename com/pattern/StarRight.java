package com.pattern;

public class StarRight {
	
public static void stardown(int h) {
	for(int i=1;i<=h;i++) {
		for(int j=0;j<h-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}public static void starup(int h) {
	for(int i=1;i<=h;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=i;k<=h;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}



	public static void main(String[] args) {
		int n=5;
		starup(n);
		System.out.println("_________");
		//stardown(n);
	}

}

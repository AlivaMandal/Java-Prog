package com.pattern;

public class StarMiddle {
	//height (n)=5
	//height*2-1 = number of star per row
	public static void starmid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<2*i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void starmidown(int h) {
		for(int i=0;i<=h;i++) {
			for(int j=2*i;j<=i;j--) {
				System.out.print("*");
			}
			for(int k=i;k<2*i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}


	public static void main(String[] args) {
		int n=5;
		starmidown(n);

	}

}

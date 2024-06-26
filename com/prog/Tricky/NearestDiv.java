package com.prog.Tricky;

public class NearestDiv {
	static int near(int n,int div) {
		int rem=n%div;
		int temp;
		if(rem < div/2) {
			return n-rem;
		}else {
			temp=div-rem;
		}
		return n+temp;
	}

	public static void main(String[] args) {
		int input1=67,div1=8;
		int input2=26,div2=3;
		System.out.println(" output1: "+near(input1,div1));
		System.out.println(" output2: "+near(input2,div2));
	}

}

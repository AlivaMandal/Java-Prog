package com.prog.Tricky;

public class DifWithMInPrime {
	public static int dif(int n) {
		int minprime=2;
		while(n>minprime) {
			if(n%minprime ==0) {
				break;
			}else {
				minprime++;
			}
		}
		return minprime;
	}

	public static void main(String[] args) {
		int n1=350;       //2x2x5x7
		int n2=1771;      //7x
		System.out.println("output1: "+dif(n1));
		System.out.println("output2: "+dif(n2));
	}

}

package com.Acc.prv;

public class ToysLeft {
	static int remn(int toy,int donate) {
		return toy-donate;
	}

	public static void main(String[] args) {
		int toy=50,donate=45;
		System.out.println("toys left: "+remn(toy,donate));
	}

}
